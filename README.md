# Java Programming Exercises

This repository contains 40 Java programming exercises designed to help students learn and practice Java fundamentals. Each exercise consists of a class with method stubs that throw `UnsupportedOperationException` and corresponding test cases.

## 📚 Exercise Categories

### 1️⃣ Variables & Primitive Data Types (8 exercises)

- **pocket_money_tracker**: Basic arithmetic operations
- **cafe_tip_jar**: Percentage calculations  
- **moon_weight_converter**: Constants and multiplication
- **book_page_estimator**: Time and rate calculations
- **temperature_spread**: Multiple calculations and returns
- **space_probe_signal_time**: Scientific calculations
- **fantasy_potion_mix**: Array construction
- **even_odd_game**: Modulo operations

### 2️⃣ Control Flow (7 exercises)

- **amusement_park_ticket**: Age-based conditionals
- **bus_seats**: String comparison and conditionals
- **fizz_buzz_lite**: Loop with conditionals
- **elevator_panel**: Range validation
- **rain_streak_counter**: Loop with state tracking
- **simple_dungeon_crawler**: State simulation
- **cinema_row_rearrange**: Conditional processing

### 3️⃣ Methods / Functions (8 exercises)

- **hello_hero**: String formatting
- **vat_calculator**: Tax calculations
- **pizza_planner**: Ceiling division
- **speed_unit_switcher**: Unit conversion
- **grade_average**: Average calculation
- **bank_fee_simulator**: Complex fee calculation
- **tiny_encryption**: Character manipulation
- **weather_sensor**: Data processing

### 4️⃣ Collections & Classes/Objects (17 exercises)

- **shopping_basket**: Array sum
- **mini_rpg**: Class implementation and object interaction
- **bank_account**: Class with state management
- **todo_item**: Object creation and manipulation
- **pet**: Class with properties and methods
- **course**: Class relationships
- **leaderboard**: Array processing
- **library_catalogue**: Collection operations
- **simple_car**: Object state management
- **vowel_counter**: String processing
- **temperature_spread**: Multiple return values
- **space_probe_signal_time**: Mathematical operations
- **fantasy_potion_mix**: Array manipulation
- **even_odd_game**: Conditional logic
- **amusement_park_ticket**: Input validation
- **bus_seats**: Conditional processing
- **cinema_row_rearrange**: Array manipulation

## 🚀 Getting Started

### Prerequisites

- Java 21 or higher
- Maven 3.6 or higher
- IDE (IntelliJ IDEA, Eclipse, or VS Code recommended)

### Setting Up the Project

1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd java-exercises
   ```

2. **Open in your IDE:**
   - **IntelliJ IDEA**: Open the project as a Maven project
   - **Eclipse**: Import as existing Maven project
   - **VS Code**: Install Java extensions and open the folder

3. **Verify setup:**
   ```bash
   mvn clean compile
   mvn test
   ```

## 📝 How to Implement an Exercise

### Step 1: Choose an Exercise

Navigate to `src/main/java/blitz/` and pick a file to work on. For example, let's work on `PocketMoneyTracker.java`:

```java
// src/main/java/blitz/PocketMoneyTracker.java

public class PocketMoneyTracker {
    public static int calculateTotal(int mondayAmount, int wednesdayAmount) {
        // TODO: replace with your implementation
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
```

### Step 2: Implement the Method

Replace `throw new UnsupportedOperationException("Not yet implemented");` with your implementation:

```java
public static int calculateTotal(int mondayAmount, int wednesdayAmount) {
    return mondayAmount + wednesdayAmount;
}
```

### Step 3: Run the Tests

Run the specific test for your exercise:

```bash
# Run all tests
mvn test

# Run specific test class
mvn test -Dtest=PocketMoneyTrackerTest

# Run specific test method
mvn test -Dtest=PocketMoneyTrackerTest#testCalculateTotal
```

### Step 4: Verify Your Solution

A successful implementation will show:

```
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
```

## 🧪 Running Tests

### Using IDE (Recommended)

Modern IDEs provide convenient testing features:

- **▶️ Play Button**: Click the green play button next to any test method or class to run it
- **▶️▶️ Run All**: Use the play button next to the test class to run all tests in that class
- **🔄 Rerun**: Use the refresh button to rerun the last test execution
- **⌨️ Keyboard Shortcuts**:
  - **Ctrl+Shift+F10** (IntelliJ) / **Ctrl+F11** (Eclipse) - Run current test
  - **Ctrl+Shift+F9** (IntelliJ) / **Ctrl+F9** (Eclipse) - Debug current test
  - **Shift+F10** (IntelliJ) / **F11** (Eclipse) - Run last test

### Using Command Line

#### Run all tests:
```bash
mvn test
```

#### Run tests for a specific exercise:
```bash
mvn test -Dtest=PocketMoneyTrackerTest
```

#### Run a specific test method:
```bash
mvn test -Dtest=PocketMoneyTrackerTest#testCalculateTotal
```

#### Run tests with more detailed output:
```bash
mvn test -Dtest=PocketMoneyTrackerTest -Dsurefire.useFile=false
```

#### Clean and run tests:
```bash
mvn clean test
```

## 📁 Project Structure

```
java-exercises/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── blitz/           # Exercise files (implement these!)
│   │           ├── PocketMoneyTracker.java
│   │           ├── HelloHero.java
│   │           ├── MiniRpg.java
│   │           └── ... (40 exercise files)
│   └── test/
│       └── java/
│           └── blitz/           # Test files (do not modify)
│               ├── PocketMoneyTrackerTest.java
│               ├── HelloHeroTest.java
│               ├── MiniRpgTest.java
│               └── ... (40 test files)
├── target/                      # Compiled classes (auto-generated)
├── pom.xml                      # Maven configuration
└── README.md                    # This file
```

## 💡 Tips for Success

- **Read the comments carefully** - They contain important implementation details
- **Look at the test cases** - They show expected inputs and outputs
- **Start with simpler exercises** - Begin with Variables & Primitive Data Types
- **Test frequently** - Run tests after each small change
- **Use proper Java syntax** - Follow Java naming conventions and structure
- **Don't modify test files** - Only implement methods in the `src/main/java/blitz/` directory
- **Check method signatures** - Ensure your method matches the expected signature exactly

## 🔧 Troubleshooting

### Compilation Issues

**General:**
```bash
# Clean and recompile
mvn clean compile

# Check Java version
java -version
mvn -version
```

**Import Errors:**
- Make sure you're running Maven from the project root directory
- Verify that your IDE recognizes this as a Maven project
- Check that the package declaration matches the directory structure

### Test Failures

- Check that your method signature matches exactly (parameter names, types, return type)
- Verify that your implementation handles the specific test cases
- Look at the test failure message for clues about what's wrong
- Ensure you're not modifying the test files

### IDE-Specific Issues

**IntelliJ IDEA:**
- Right-click on `pom.xml` → "Add as Maven Project"
- File → Project Structure → Project SDK → Set to Java 21

**Eclipse:**
- File → Import → Maven → Existing Maven Projects
- Right-click project → Configure → Convert to Maven Project

**VS Code:**
- Install Java Extension Pack
- Command Palette → "Java: Reload Projects"