package blitz;

public class Pet {
    /**
     * A pet class that can make different sounds based on their type.
     * 
     * This class should:
     * - Store the pet's name, type, and age
     * - Return appropriate sounds based on the pet type
     * - Handle different pet types efficiently
     * 
     * Think about: How do you handle different types of pets? What sound should each type make?
     * How do you handle pets that aren't dogs or cats?
     */
    private final String name, type;
    private final int age;

    /**
     * Create a new pet.
     * 
     * @param name the pet's name
     * @param type the type of pet (e.g., "dog", "cat")
     * @param age the pet's age in years
     */
    public Pet(String name, String type, int age) {
        // TODO: Initialize the pet
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * Make the pet speak based on its type.
     * 
     * @return the sound the pet makes:
     *         - Dogs say "Woof!"
     *         - Cats say "Meow!"
     *         - Other pets say "..."
     */
    public String speak() {
        // type→sound mapping (dog→"Woof!", cat→"Meow!", default→"...").
        // TODO: Implement type-based sound generation
        throw new UnsupportedOperationException("Not yet implemented");
    }
} 