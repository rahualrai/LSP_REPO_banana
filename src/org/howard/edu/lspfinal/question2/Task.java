package org.howard.edu.lspfinal.question2;

/**
 * Represents a Task with a unique name, integer priority, and status.
 * Valid statuses are "TODO", "IN_PROGRESS", and "DONE".
 * 
 * @author Rahual Rai
 * @since 2025-04-24
 */
public class Task {
    private final String name;
    private final int priority;
    private String status;

    /**
     * Constructs a new Task.
     *
     * @param name     the unique name of the task
     * @param priority the priority (lower number = higher priority)
     * @param status   initial status ("TODO", "IN_PROGRESS", or "DONE")
     */
    public Task(String name, int priority, String status) {
        this.name = name;
        this.priority = priority;
        this.status = status;
    }

    /** @return the task's name */
    public String getName() { return name; }

    /** @return the task's priority */
    public int getPriority() { return priority; }

    /** @return the task's current status */
    public String getStatus() { return status; }

    /**
     * Updates the task's status.
     *
     * @param status the new status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /** 
     * @return a string representation of the task 
     */
    @Override
    public String toString() {
        return String.format("Task{name='%s', priority=%d, status='%s'}", name, priority, status);
    }
}
