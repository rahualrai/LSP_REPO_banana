package org.howard.edu.lsp.midterm.question4;

import java.util.*;

public class WordProcessor {
    private String sentence; // Stores the sentence to be processed

    // Constructor
    public WordProcessor(String sentence) {
        this.sentence = sentence;
    }

    // Method to find all longest words in the sentence
    public List<String> findLongestWords() {
        if (sentence == null || sentence.trim().isEmpty()) return new ArrayList<>(); // return empty list
        
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
