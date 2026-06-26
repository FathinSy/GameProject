# Simple Tic-Tac-Toe Game with Java Swing, Login, and Statistics

## Student Information
**Name        : Naufal Zaky Fathin Syuhada**  
**Student ID  : 5026251095**  
**Class       : E**  

## Project Description
This project is a simple Tic-Tac-Toe game built using Java Swing.
The application includes login, game statistics, and Top 5 scorer
feature.

## Features
- Login using database authentication
- Play Tic-Tac-Toe using Java Swing GUI
- Record wins, losses, draws, and score
- Display player statistics
- Display Top 5 scorers using JTable

## Database
**Database Used: MySQL**  

## How to Run the Program
1. Create the required database in your MySQL server.
2. Execute the provided SQL script to create the necessary table and sample data.
3. Open the project using your preferred Java IDE.
4. Ensure the MySQL JDBC Connector is added to the project's libraries.
5. Update the database connection settings in `DatabaseManager.java` if necessary.
6. Compile and run the `Main.java` file to start the application.
7. Login using an existing player account.
8. Play the game.

## Class Explanation
Main: Acts as the entry point of application. It launches to `LoginFrame` to start the program.
DatabaseManager: Manages the database connection for connecting the application to the MySQL database using JDBC.
Player: Represents a player object that stores player information, including ID, username, wins, losses, draws, and score.
PlayerService: Handles the database operations related to players, including user authentication, updating game statistics, retrieving player information, and displaying the Top 5 scorers.
GameLogic: Showing the game mechanics of tic-tac-toe, like managing the board, validating moves, checking winning condition, detecting draws, and generating random computer moves.
LoginFrame: Provides the login interface for users to enter their username and password. It authenticates users through `PlayerService` before allowing access to the main menu. 
MainMenuFrame: Reveal main menu after successful login, allowing players to start new game, view their personal statistics, view the top 5 scorers of tic-tac-toe, or exit the application.
GameFrame: Provides the graphical game interface using Java Swing. It controls player interactions, communicates with `GameLogic` to process the game, and updates player statistics when the game finished.
StatisticsFrame: Displays the logged-in player's game statistics, including the number of wins, losses, draws, and total score.
TopScorersFrame: Displays the top five players ranked by score using a JTable populated with data retrieved from the database.

## Screenshots
### Login Window
<img width="678" height="389" alt="image" src="https://github.com/user-attachments/assets/6cde157e-4799-4aee-ae9d-c41ca330b305" />

### Main Menu
<img width="778" height="589" alt="image" src="https://github.com/user-attachments/assets/417dc98c-dce1-4b80-8d68-f1e28dd37b3b" />

### Game Window
<img width="778" height="789" alt="image" src="https://github.com/user-attachments/assets/71aa1407-abb9-48c1-889d-92f3f8786c74" />

### Player Statistics
<img width="678" height="489" alt="image" src="https://github.com/user-attachments/assets/b085d5fb-7e21-4c5f-aa58-e97e79c29325" />

### Top 5 Scorers
<img width="978" height="589" alt="image" src="https://github.com/user-attachments/assets/eeca1a9f-3e8d-4cc3-a4c4-377f1cd2c9bd" />

## YouTube Demonstration
YouTube Video: https://youtu.be/gNlWgdzWcqw
