# Java Exercises Summary

This document provides an overview of all the Java exercises in the blitz package, including their names and what needs to be implemented.

## Exercise List

### 1. **GradeAverage.java**
- **Task**: Calculate the average of an array of scores. Think about what happens when the array is empty - you need to return a special value to indicate this case.
- **Method**: `average(int[] scores)`
- **Status**: TODO - Not yet implemented

### 2. **CinemaRowRearrange.java**
- **Task**: Reorganize a list of ages so that all viewers under 18 appear first, followed by those 18 and older. The order within each age group should remain the same as in the original list.
- **Method**: `rearrange(List<Integer> ages)`
- **Status**: TODO - Not yet implemented

### 3. **HelloHero.java**
- **Task**: Create a greeting method that takes a name and returns a personalized message. Consider how to format the greeting to make it welcoming.
- **Method**: `greet(String name)`
- **Status**: TODO - Not yet implemented

### 4. **SpeedUnitSwitcher.java**
- **Task**: Convert between different speed units. You'll need to know the conversion factors between kilometers per hour and meters per second to implement these methods correctly.
- **Methods**: 
  - `kmhToMps(double kmh)` - Convert km/h to m/s
  - `mpsToKmh(double mps)` - Convert m/s to km/h
- **Status**: TODO - Not yet implemented

### 5. **LibraryCatalogue.java**
- **Task**: Build a simple library system that can store books using ISBN numbers as unique identifiers. You'll need to manage adding, finding, and removing books from the catalogue.
- **Methods**:
  - `addBook(String isbn, String title)` - Add a book to the catalogue
  - `lookup(String isbn)` - Find a book by ISBN
  - `removeBook(String isbn)` - Remove a book by ISBN
- **Status**: TODO - Not yet implemented

### 6. **PizzaPlanner.java**
- **Task**: Calculate how many pizzas are needed for a group of people. Since each pizza has exactly 8 slices, you'll need to use ceiling division to ensure everyone gets enough slices.
- **Method**: `pizzasNeeded(int people, int slicesPerPerson)`
- **Status**: TODO - Not yet implemented

### 7. **TinyEncryption.java**
- **Task**: Implement a simple Caesar cipher that shifts letters by a given offset. Remember that letters wrap around the alphabet (A comes after Z, and a comes after z). Consider both positive and negative shifts.
- **Method**: `shiftCipher(String text, int offset)`
- **Status**: TODO - Not yet implemented

### 8. **BankFeeSimulator.java**
- **Task**: Calculate monthly bank fees using a two-tier system. The fee is either a percentage of the balance OR a minimum amount, whichever is greater. The result should be the new balance after subtracting the fee.
- **Method**: `applyMonthlyFee(double balance, double feePercent, double minFee)`
- **Status**: TODO - Not yet implemented

### 9. **VatCalculator.java**
- **Task**: Add Value Added Tax (VAT) to a net amount. You'll receive the net price and the VAT rate as a percentage, and need to calculate the total including tax.
- **Method**: `addVat(double net, double ratePercent)`
- **Status**: TODO - Not yet implemented

### 10. **WeatherSensor.java**
- **Task**: Create a temperature monitoring system that can record hourly readings and calculate the average temperature. Think about how to store multiple temperature values and compute their average.
- **Methods**:
  - `record(double temp)` - Record a temperature reading
  - `averageTemp()` - Calculate average temperature
- **Status**: TODO - Not yet implemented

### 11. **SimpleDungeonCrawler.java**
- **Task**: Simulate a character's health changes during an adventure. The character starts with 10 health points. Each "hit" reduces health by 3, while "potion" increases it by 5 (but can't exceed 10). The simulation stops if health drops below 0.
- **Method**: `simulate(String[] actions)`
- **Status**: TODO - Not yet implemented

### 12. **MiniRpg.java**
- **Task**: Build a simple turn-based combat system. Characters have names, health, and attack power. They can attack each other until one is defeated. Consider how to implement the battle logic and determine the winner.
- **Methods**:
  - `Character` constructor - Initialize character with name, health, and attack
  - `attack(Character target)` - Attack another character
  - `battle(Character a, Character b)` - Conduct battle until one character is defeated, returns winner's name
- **Status**: TODO - Not yet implemented

### 13. **BankAccount.java**
- **Task**: Create a basic bank account class that can handle deposits and withdrawals. The account should prevent overdrafts (negative balances) and maintain an accurate balance. Consider what happens when invalid amounts are provided.
- **Methods**:
  - Constructor - Initialize account with owner and opening balance
  - `deposit(double amount)` - Add money to account
  - `withdraw(double amount)` - Remove money (prevent overdraft)
- **Status**: TODO - Not yet implemented

### 14. **TodoItem.java**
- **Task**: Build a todo item system that tracks completion status and due dates. Items can be marked as complete/incomplete, and you need to determine if they're overdue based on the current date.
- **Methods**:
  - Constructor - Initialize todo item with title and due date
  - `toggleCompleted()` - Toggle completion status
  - `isOverdue(LocalDate now)` - Check if item is overdue
- **Status**: TODO - Not yet implemented

### 15. **RainStreakCounter.java**
- **Task**: Find the longest sequence of consecutive rainy days in a boolean array. You'll need to scan through the array and keep track of the current streak and the longest streak seen so far.
- **Method**: `longestStreak(boolean[] rainDays)`
- **Status**: TODO - Not yet implemented

### 16. **Pet.java**
- **Task**: Create a pet class that can make different sounds based on their type. Dogs say "Woof!", cats say "Meow!", and other pets make a default sound. Consider how to handle different pet types efficiently.
- **Methods**:
  - Constructor - Initialize pet with name, type, and age
  - `speak()` - Return appropriate sound based on pet type
- **Status**: TODO - Not yet implemented

### 17. **ShoppingBasket.java**
- **Task**: Join a list of shopping items into a single string, separated by commas and spaces. This is useful for displaying a shopping list in a user-friendly format.
- **Method**: `join(List<String> items)`
- **Status**: TODO - Not yet implemented

### 18. **SpaceProbeSignalTime.java**
- **Task**: Calculate how long it takes for a signal to travel from Earth to a space probe and back. You'll use the speed of light (299,792 km/s) and need to account for the round-trip distance.
- **Method**: `roundTripSeconds(double distanceKm)`
- **Status**: TODO - Not yet implemented

### 19. **VowelCounter.java**
- **Task**: Count how many times each vowel (a, e, i, o, u) appears in a sentence. The counting should be case-insensitive, so both uppercase and lowercase vowels count the same. Return the results in a map.
- **Method**: `count(String sentence)`
- **Status**: TODO - Not yet implemented

### 20. **EvenOddGame.java**
- **Task**: Create a simple classification game where even numbers are associated with "wizard" and odd numbers with "orc". This is a basic example of using conditional logic to categorize numbers.
- **Method**: `classify(int n)`
- **Status**: TODO - Not yet implemented

### 21. **PocketMoneyTracker.java**
- **Task**: Calculate the total pocket money received on different days of the week. This exercise focuses on basic arithmetic operations and combining multiple amounts.
- **Method**: `calculateTotal(int mondayAmount, int wednesdayAmount)`
- **Status**: TODO - Not yet implemented

### 22. **Leaderboard.java**
- **Task**: Process a list of players with their scores and return the top 3 players in a formatted list. You'll need to sort players by points and format the output as "1. Name (pts)", "2. Name (pts)", etc.
- **Method**: `topThree(List<Map<String, Object>> players)`
- **Status**: TODO - Not yet implemented

### 23. **FantasyPotionMix.java**
- **Task**: Calculate the exact volumes of three magical ingredients needed for a potion. The recipe requires 30% dragon blood, 50% unicorn tears, and 20% stardust. Return the volumes in milliliters in the specified order.
- **Method**: `ingredientVolumes(int vialMl)`
- **Status**: TODO - Not yet implemented

### 24. **MoonWeightConverter.java**
- **Task**: Convert Earth weight to Moon weight using the fact that objects weigh only 16.5% as much on the Moon. This involves a simple percentage calculation.
- **Method**: `toMoonWeight(double earthWeight)`
- **Status**: TODO - Not yet implemented

### 25. **CafeTipJar.java**
- **Task**: Calculate the total bill including a tip. You'll add a percentage-based tip to the original bill amount to get the final total that customers need to pay.
- **Method**: `totalWithTip(double bill, double tipPercent)`
- **Status**: TODO - Not yet implemented

### 26. **Course.java**
- **Task**: Build a course management system that can enroll and drop students. You'll need to maintain a list of enrolled students and handle adding/removing them from the course.
- **Methods**:
  - Constructor - Initialize course with title
  - `enrol(String student)` - Add student to course
  - `drop(String student)` - Remove student from course
- **Status**: TODO - Not yet implemented

### 27. **SimpleCar.java**
- **Task**: Create a car class that stores basic information and can generate a description. Consider how to format the car details in a readable way.
- **Methods**:
  - Constructor - Initialize car with make, model, and year
  - `description()` - Return car description
- **Status**: TODO - Not yet implemented

### 28. **BookPageEstimator.java**
- **Task**: Estimate how many pages someone can read in a given time period. You'll convert the reading speed from pages per hour to pages for the given minutes, using the formula: pages/hour × minutes/60.
- **Method**: `estimatePages(int pagesPerHour, int minutes)`
- **Status**: TODO - Not yet implemented

### 29. **BusSeats.java**
- **Task**: Find the first available seat on a bus. The seats are represented as a boolean array where false means available and true means occupied. Return the index of the first free seat, or -1 if the bus is full.
- **Method**: `firstFree(boolean[] seats)`
- **Status**: TODO - Not yet implemented

### 30. **AmusementParkTicket.java**
- **Task**: Calculate ticket prices based on age. Children under 12 and seniors over 65 get free admission, while others pay the full base price. This involves age-based conditional logic.
- **Method**: `computePrice(int age, double basePrice)`
- **Status**: TODO - Not yet implemented

### 31. **FizzBuzzLite.java**
- **Task**: Generate a list of 20 items following FizzBuzz rules. For multiples of 3, use "Fizz"; otherwise, use the number as a string. This is a classic programming exercise that tests your understanding of loops and conditionals.
- **Method**: `generate()`
- **Status**: TODO - Not yet implemented

### 32. **ElevatorPanel.java**
- **Task**: Validate if a floor number is within the acceptable range for an elevator. The valid floors are 0 through 20 inclusive. Return true for valid floors and false for invalid ones.
- **Method**: `isValidFloor(int floor)`
- **Status**: TODO - Not yet implemented

### 33. **TemperatureSpread.java**
- **Task**: Calculate both the difference between high and low temperatures and their average. Return these two values in a specific array format: [0] = difference (high - low), [1] = average. This tests your ability to work with arrays and multiple calculations.
- **Method**: `spreadAndAverage(double high, double low)`
- **Status**: TODO - Not yet implemented

## Summary

Total exercises: **33**

All exercises are currently marked as TODO with "Not yet implemented" status. Each exercise focuses on different programming concepts including:
- Basic arithmetic and calculations
- String manipulation
- Array and list operations
- Object-oriented programming
- Data structures (Maps, Lists)
- Date/time handling
- Game logic and simulations
- Business logic (banking, shopping, etc.)

The exercises range from simple one-method implementations to more complex multi-class systems, providing a comprehensive learning path for Java programming fundamentals.
