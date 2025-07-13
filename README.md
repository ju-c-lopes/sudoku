# Sudoku Game 🎮

A Java-based Sudoku game featuring both Command Line Interface (CLI) and Graphical User Interface (GUI) implementations. The project demonstrates object-oriented programming principles, design patterns, and Java Swing for GUI development.

## 🎯 Features

### Core Functionality
- **9x9 Sudoku Grid**: Traditional Sudoku gameplay with standard rules
- **Dual Interface**: Both CLI and GUI versions available
- **Game Validation**: Real-time error checking and game completion validation
- **Configurable Boards**: Support for custom game configurations via command-line arguments
- **Game State Management**: Start, pause, reset, and finish game functionality

### CLI Features
- Interactive menu system with 8 different options
- Number input and removal with coordinate-based positioning
- Visual ASCII board representation
- Game status checking and error validation
- Progress saving and clearing capabilities

### GUI Features
- Intuitive Swing-based graphical interface
- 3x3 sector-based layout following Sudoku conventions
- Interactive number input fields with validation
- Control buttons for game management (Reset, Check Status, Finish)
- Event-driven architecture with notification system

## 🏗️ Architecture

### Project Structure
```
src/
├── Main.java              # CLI Entry Point
├── UIMain.java            # GUI Entry Point
└── br/com/dio/
    ├── model/             # Data Models
    │   ├── Board.java     # Game board representation
    │   ├── Space.java     # Individual cell logic
    │   └── GameStatusEnum.java # Game state enumeration
    ├── service/           # Business Logic
    │   ├── BoardService.java    # Board operations
    │   ├── NotifierService.java # Event handling
    │   └── EventListener.java   # Event interfaces
    ├── ui/custom/         # GUI Components
    │   ├── button/        # Custom buttons
    │   ├── frame/         # Main window
    │   ├── input/         # Input controls
    │   ├── panel/         # Layout panels
    │   └── screen/        # Screen management
    └── util/
        └── BoardTemplate.java # CLI board formatting
```

### Design Patterns Used
- **Observer Pattern**: Event notification system for GUI updates
- **Service Layer**: Separation of business logic from presentation
- **Model-View-Controller (MVC)**: Clear separation of concerns
- **Template Method**: Board template for consistent formatting

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 11 or higher
- IDE with Java support (IntelliJ IDEA, Eclipse, VS Code)

### Running the CLI Version
```bash
java Main [game_configuration]
```

**Example with game configuration:**
```bash
java Main "0,0;5,true" "0,1;3,false" "0,2;7,true" ...
```

### Running the GUI Version
```bash
java UIMain [game_configuration]
```

### Game Configuration Format
The game accepts configuration arguments in the format:
```
"row,col;expected_value,is_fixed"
```

Where:
- `row,col`: Grid position (0-8)
- `expected_value`: The correct number for this position (1-9)
- `is_fixed`: Boolean indicating if the cell is pre-filled and unchangeable

## 🎮 How to Play

### CLI Controls
1. **Start New Game**: Initialize a new Sudoku puzzle
2. **Add Number**: Place a number in a specific cell
3. **Remove Number**: Clear a cell's value
4. **View Current Game**: Display the current board state
5. **Check Game Status**: Validate current progress
6. **Clear Game**: Reset all user inputs
7. **Finish Game**: Complete and validate the solution
8. **Exit**: Quit the application

### GUI Controls
- **Click on cells**: Select and input numbers directly
- **Reset Button**: Clear all user inputs
- **Check Status Button**: Validate current game state
- **Finish Game Button**: Complete and validate solution

### Input sample game both in CLI and GUI:
- **Input in parameters**: To add example game configuration, you can pass the sample present in the file **[params-sudoku.txt](./params-sudoku.txt)**.
- **Solved Game**: In the same file, at the end, you can find a solved game that can be used to test the game validation.

## 🔧 Technical Details

### Core Classes

#### `Board.java`
- Manages the 9x9 grid of spaces
- Handles game state validation
- Provides methods for value manipulation and error checking

#### `Space.java`
- Represents individual cells
- Manages expected vs actual values
- Handles fixed/editable cell states

#### `BoardService.java`
- Service layer for board operations
- Initializes game configuration
- Provides business logic for game management

#### `MainScreen.java`
- Main GUI controller
- Manages UI components and user interactions
- Integrates with notification system for real-time updates

### Key Features Implementation

**Error Validation**: The game continuously validates user input against expected values and Sudoku rules.

**State Management**: Three distinct game states are tracked:
- `NON_STARTED`: Game not yet begun
- `INCOMPLETE`: Game in progress
- `COMPLETE`: All cells filled

**Event System**: GUI version uses a publisher-subscriber pattern for component communication.

## 🛠️ Development

### Building the Project
1. Clone or download the project
2. Open in your preferred Java IDE
3. Ensure all dependencies are resolved
4. Compile and run either `Main.java` or `UIMain.java`

### Extending the Project
- **Custom Difficulty Levels**: Modify the configuration system
- **Save/Load Functionality**: Implement file-based persistence
- **Timer Feature**: Add time tracking for completed games
- **Hint System**: Implement helper functionality for stuck players

## 📝 Game Rules

Standard Sudoku rules apply:
1. Fill each row with numbers 1-9 (no duplicates)
2. Fill each column with numbers 1-9 (no duplicates)
3. Fill each 3x3 sector with numbers 1-9 (no duplicates)
4. Some cells are pre-filled and cannot be changed
5. The puzzle is complete when all cells are correctly filled

## 🎯 Future Enhancements

- Multiple difficulty levels
- Puzzle generator for random games
- Save/load game functionality
- Undo/redo operations
- Hint system
- Timer and scoring system
- Multiple puzzle sizes (4x4, 16x16)

## 📄 License

This project is part of a learning exercise and is available for educational purposes.

---

*Created as a Java programming exercise demonstrating CLI and GUI development, object-oriented design patterns, and game logic implementation.*
