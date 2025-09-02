package blitz;

import java.time.LocalDate;

public class TodoItem {
    /**
     * A todo item that tracks completion status and due dates.
     * 
     * This class should:
     * - Store the item's title and due date
     * - Track whether the item is completed
     * - Determine if the item is overdue
     * 
     * Think about: How do you compare dates? What makes an item overdue?
     * How do you toggle between two states?
     */
    private final String title;
    private final LocalDate dueDate;
    private boolean completed;

    /**
     * Create a new todo item.
     * 
     * @param title the description of the task
     * @param dueDate when the task should be completed
     */
    public TodoItem(String title, LocalDate dueDate) {
        // TODO: Initialize the todo item
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * Toggle the completion status of this item.
     * If completed, mark as incomplete; if incomplete, mark as completed.
     */
    public void toggleCompleted() {
        // TODO: Implement completion status toggle
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    public boolean isCompleted() { return completed; }

    /**
     * Check if this item is overdue.
     * 
     * @param now the current date to compare against
     * @return true if the due date has passed and the item is not completed
     */
    public boolean isOverdue(LocalDate now) {
        // TODO: Implement overdue checking
        throw new UnsupportedOperationException("Not yet implemented");
    }
} 