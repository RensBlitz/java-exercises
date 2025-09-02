package blitz;

public class MiniRpg {

    /**
     * A character in the RPG battle system.
     * 
     * Each character has:
     * - A name (cannot be changed after creation)
     * - Health points (can change during battle)
     * - Attack power (cannot be changed after creation)
     */
    static class Character {
        private final String name;
        private int health;
        private final int attack;

        /**
         * Create a new character with the specified attributes.
         * 
         * @param name the character's name
         * @param health the starting health points
         * @param attack the attack power
         */
        Character(String name, int health, int attack) {
            // TODO: Initialize character attributes
            throw new UnsupportedOperationException("Not yet implemented");
        }
        
        /**
         * Check if the character is still alive.
         * 
         * @return true if health > 0, false otherwise
         */
        boolean isAlive() { return health > 0; }
        
        /**
         * Attack another character, reducing their health by this character's attack power.
         * 
         * @param target the character to attack
         */
        void attack(Character target) {
            // TODO: Implement attack logic
            throw new UnsupportedOperationException("Not yet implemented");
        }
        
        int getHealth() { return health; }
        String getName() { return name; }
    }

    /**
     * Conduct a battle between two characters until one is defeated.
     * 
     * This method should:
     * - Have characters take turns attacking each other
     * - Continue until one character's health drops to 0 or below
     * - Return the name of the winning character
     * 
     * Think about: How do you implement turn-based combat? How do you determine when the battle ends?
     * What happens if both characters have the same attack power?
     */
    public static String battle(Character a, Character b) {
        // TODO: Implement the battle system
        throw new UnsupportedOperationException("Not yet implemented");
    }
} 