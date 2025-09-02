package blitz;

import java.util.ArrayList;
import java.util.List;

public class Course {
    /**
     * A course management system that can enroll and drop students.
     * 
     * This class should:
     * - Store the course title
     * - Maintain a list of enrolled students
     * - Handle adding and removing students from the course
     * 
     * Think about: How do you add items to a list? How do you remove items?
     * What happens when you try to enroll a student who's already enrolled?
     */
    private final String title;
    private final List<String> students = new ArrayList<>();

    /**
     * Create a new course.
     * 
     * @param title the name of the course
     */
    public Course(String title) {
        // TODO: Initialize the course
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * Add a student to the course.
     * 
     * @param student the name of the student to enroll
     * @return true if enrollment was successful, false if student was already enrolled
     */
    public boolean enrol(String student) {
        // TODO: Implement student enrollment
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * Remove a student from the course.
     * 
     * @param student the name of the student to remove
     * @return true if removal was successful, false if student was not enrolled
     */
    public boolean drop(String student) {
        // TODO: Implement student removal
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    public int getEnrolmentCount() { return students.size(); }
} 