package org.howard.edu.lsp.midterm.question3;

import java.util.*;

/**
 * The VotingMachine class represents a voting machine that can add candidates,
 * cast votes, and determine the winner.
 * 
 */
public class VotingMachine {
	private Map<String, Integer> votes = new HashMap<>(); // map to store candidate names and their votes

	/**
	 * Adds a candidate to the voting machine.
	 *
	 * @param name the name of the candidate
	 */
	public void addCandidate(String name) {
		if (!votes.containsKey(name)) {
			votes.put(name, 0); // initialize candidate with 0 votes
		}
	}

	/**
	 * Casts a vote for the specified candidate.
	 *
	 * @param name the name of the candidate
	 * @return true if the vote was successfully cast, false if the candidate does
	 *         not exist
	 */
	public boolean castVote(String name) {
		if (votes.containsKey(name)) {
			votes.put(name, votes.get(name) + 1); // increment vote count
			return true;
		} else {
			return false; // vote for non-existent candidate
		}
	}

	/**
	 * Returns the winner of the election.
	 *
	 * @return the name of the winning candidate and the number of votes they
	 *         received, or "No votes cast." if no votes were cast
	 */
	public String getWinner() {
		String winner = null;
		int maxVotes = 0;

		// iterate through the vote map to find candidate with highest votes
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
}