The project uses loops and hit and trial inputs by the user. 
Random Number Generation:

The random number is generated using Random.nextInt(100) + 1, which ensures a number between 1 and 100.
User Guessing:

The program prompts the user to enter a guess and provides feedback if the guess is too high or too low.
Limited Attempts:

The user has a limited number of attempts (maxAttempts), and after each guess, the number of attempts is reduced.
If the user does not guess correctly within the limit, the game ends the round and reveals the correct number.
Rounds:

The game can be played in multiple rounds. The user can input how many rounds they want to play at the beginning of the game.
After each round, the score is added to the total score.
Scoring:

The score is calculated based on how quickly the user guesses the number. For example, the fewer the attempts, the higher the score.
The formula used is score = (maxAttempts - attempts + 1) * 10, meaning the score decreases with each additional attempt.
Final Score:

At the end of all rounds, the total score is displayed.
