package blitz;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {
    /**
     * A simple library management system for storing and retrieving books.
     * 
     * This class uses ISBN numbers as unique identifiers for books.
     * Think about: How do you store key-value pairs? How do you add, find, and remove items?
     */
    private final Map<String,String> books = new HashMap<>();

    /**
     * Add a new book to the library catalogue.
     * 
     * @param isbn the unique ISBN number for the book
     * @param title the title of the book
     */
    public void addBook(String isbn, String title) {
        // TODO: Implement book addition to the catalogue
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * Find a book by its ISBN number.
     * 
     * @param isbn the ISBN to search for
     * @return the title of the book, or null if not found
     */
    public String lookup(String isbn) {
        // TODO: Implement book lookup by ISBN
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * Remove a book from the library catalogue.
     * 
     * @param isbn the ISBN of the book to remove
     * @return true if the book was found and removed, false otherwise
     */
    public boolean removeBook(String isbn) {
        // TODO: Implement book removal from the catalogue
        throw new UnsupportedOperationException("Not yet implemented");
    }
} 