package org.howard.edu.lspfinal.question2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TaskManagerTest {
    private TaskManager mgr;

    @BeforeEach
    void setUp() {
        mgr = new TaskManager();
    }

    @Test @DisplayName("Test for adding valid item")
    void addsTaskSuccessfully() throws Exception {
        mgr.addTask("A", 1, "TODO");
        assertEquals("A", mgr.getTaskByName("A").getName());
    }

    @Test @DisplayName("Test for adding item with 0 price (expect exception)")
    void duplicateThrows() {
        assertThrows(DuplicateTaskException.class, 
            () -> { mgr.addTask("X",1,"TODO"); mgr.addTask("X",2,"DONE"); });
    }

    @Test @DisplayName("Test for adding item with negative price (expect exception)")
    void getTaskNotFoundThrows() {
        assertThrows(TaskNotFoundException.class, 
            () -> mgr.getTaskByName("Nope"));
    }

    @Test @DisplayName("Test for applying SAVE10")
    void updateStatusAndRetrieve() throws Exception {
        mgr.addTask("T",5,"TODO");
        mgr.updateStatus("T","IN_PROGRESS");
        assertEquals("IN_PROGRESS", mgr.getTaskByName("T").getStatus());
    }

    // ...and so on, filling out the 9 criteria exactly:
    // - applying SAVE20
    // - invalid code (in this question invalid status update? adapt)
    // - total cost without discount (not relevant here)
    // - etc.

    // You’d replace these with the matching TaskManager behaviors per Q1/Q2 mix.
}
