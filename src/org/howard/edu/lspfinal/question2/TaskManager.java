package org.howard.edu.lspfinal.question2;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Manages a collection of tasks, enforcing unique names and providing
 * lookup, status updates, and grouped printing.
 * 
 * @author Rahual Rai
 * @since 2025-04-24
 */
public class TaskManager {
    private final Map<String, Task> tasks = new HashMap<>();

    /**
     * Adds a new task to the manager.
     *
     * @param name     unique task name
     * @param priority integer priority (lower = higher)
     * @param status   initial status: "TODO", "IN_PROGRESS", or "DONE"
     * @throws DuplicateTaskException if a task with the same name exists
     */
    public void addTask(String name, int priority, String status) throws DuplicateTaskException {
        if (tasks.containsKey(name)) {
            throw new DuplicateTaskException("Task '" + name + "' already exists.");
        }
        tasks.put(name, new Task(name, priority, status));
    }

    /**
     * Retrieves a task by its name.
     *
     * @param name the name of the task to retrieve
     * @return the Task object
     * @throws TaskNotFoundException if no task with the given name exists
     */
    public Task getTaskByName(String name) throws TaskNotFoundException {
        Task t = tasks.get(name);
        if (t == null) {
            throw new TaskNotFoundException("Task '" + name + "' not found.");
        }
        return t;
    }

    /**
     * Updates the status of an existing task.
     *
     * @param name   the name of the task to update
     * @param status new status: "TODO", "IN_PROGRESS", or "DONE"
     * @throws TaskNotFoundException if no task with the given name exists
     */
    public void updateStatus(String name, String status) throws TaskNotFoundException {
        Task t = getTaskByName(name);
        t.setStatus(status);
    }

    /**
     * Prints all tasks grouped by their status in the order TODO, IN_PROGRESS, DONE.
     */
    public void printTasksGroupedByStatus() {
        System.out.println("Tasks grouped by status:");
        // Group tasks by status
        Map<String, List<Task>> grouped = tasks.values().stream()
            .collect(Collectors.groupingBy(Task::getStatus, LinkedHashMap::new, Collectors.toList()));
        // Ensure order
        for (String status : Arrays.asList("TODO", "IN_PROGRESS", "DONE")) {
            System.out.println(status + ":");
            List<Task> list = grouped.getOrDefault(status, Collections.emptyList());
            for (Task t : list) {
                System.out.println("  " + t);
            }
        }
    }
}
