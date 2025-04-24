package org.howard.edu.lsp.midterm.question4;

import java.util.*;

/**
 * The WordProcessor class processes a sentence to find the longest words.
 */
public class WordProcessor {
	private String sentence; // Stores the sentence to be processed

	/**
	 * Constructs a new WordProcessor with the specified sentence.
	 *
	 * @param sentence the sentence to be processed
	 */
	public WordProcessor(String sentence) {
		this.sentence = sentence;
	}

	/**
	 * Finds all the longest words in the sentence.
	 *
	 * @return a list of the longest words in the sentence
	 */
	public List<String> findLongestWords() {
		if (sentence == null || sentence.trim().isEmpty())
			return new ArrayList<>(); // return empty list

		List<String> words = Arrays.asList(sentence.split("\\s+")); // split by whitespace
		int maxLength = words.stream().mapToInt(String::length).max().orElse(0); // find max length

		List<String> longestWords = new ArrayList<>(); // list to store longest words
		for (String word : words) {
			if (word.length() == maxLength) {
				longestWords.add(word);
			}
		}
		return longestWords;
	}
}