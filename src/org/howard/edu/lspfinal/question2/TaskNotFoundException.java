package org.howard.edu.lspfinal.question2;

/**
 * Exception thrown when a requested task cannot be found.
 */
public class TaskNotFoundException extends Exception {
    public TaskNotFoundException(String message) {
        super(message);
    }
}
