package org.howard.edu.lsp.midterm.question3;

import java.util.*;

public class VotingMachine {
    private Map<String, Integer> votes = new HashMap<>(); // map to store candidate names and their votes
    
    // add candidate
    public void addCandidate(String name) {
        if (!votes.containsKey(name)) {
            votes.put(name, 0); // initialize candidate with 0 votes
        }
    }

    // cast vote
    public boolean castVote(String name) {
        if (votes.containsKey(name)) { 
            votes.put(name, votes.get(name) + 1); // increment vote count
            return true;
        } else {
            return false; // vote for non-existent candidate
        }
    }

    // get winner
    public String getWinner() {
        String winner = null;
        int maxVotes = 0;

        // iterate thru the vote map to find candidate with highest votes
        for (Map.Entry<String, Integer> entry : votes.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        // if no votes were cast
        if (winner == null) {
            return "No votes cast.";
        }

        return winner + " WINS with " + maxVotes + " votes!!";
    }

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
        System.out.println("Vote for Eve successful? " + success);

        // Displaying results
        System.out.println("Winner: " + vm.getWinner());
    }
}