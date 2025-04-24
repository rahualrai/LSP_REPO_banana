package org.howard.edu.lsp.midterm.question3;

public class VotingMachineTest {
	public static void main(String[] args) {
		VotingMachine vm = new VotingMachine();

		// Adding candidates
		vm.addCandidate("Alice");
		vm.addCandidate("Bob");
		vm.addCandidate("Charlie");

		// Casting votes
		vm.castVote("Alice");
		vm.castVote("Alice");
		vm.castVote("Bob");
		vm.castVote("Charlie");
		vm.castVote("Charlie");
		vm.castVote("Charlie");

		// Attempt to vote for a non-existent candidate
		boolean success = vm.castVote("Eve");
		System.out.println("Vote for Eve successful? " + success); // Expected output: false

		// Displaying results
		System.out.println("Winner: " + vm.getWinner()); // Expected output: Charlie WINS with 3 votes!!

		// Test case with no votes cast
		VotingMachine vm2 = new VotingMachine();
		vm2.addCandidate("Alice");
		vm2.addCandidate("Bob");
		System.out.println("Winner: " + vm2.getWinner()); // Expected output: No votes cast.
	}
}