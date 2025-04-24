package org.howard.edu.lspfinal.question2;

/**
 * Exception thrown when attempting to add a task whose name already exists.
 */
public class DuplicateTaskException extends Exception {
    public DuplicateTaskException(String message) {
        super(message);
    }
}
