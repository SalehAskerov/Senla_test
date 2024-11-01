package task_1;

public class Display {

    public void displayWord(String guessedWord) {
        System.out.println("Загаданное слово: " + guessedWord);
    }

    public void displayLives(int lives) {
        System.out.println("Осталось жизней: " + lives);
    }

    public void displayHangman(int lives) {
        String[] hangmanStages = {
                """
               -----
               |   |
               |   O
               |  /|\\
               |  / \\
               |
            """,
                """
               -----
               |   |
               |   O
               |  /|\\
               |  / 
               |
            """,
                """
               -----
               |   |
               |   O
               |  /|\\
               |  
               |
            """,
                """
               -----
               |   |
               |   O
               |  /|
               |  
               |
            """,
                """
               -----
               |   |
               |   O
               |   |
               |  
               |
            """,
                """
               -----
               |   |
               |   O
               |   
               |  
               |
            """,
                """
               -----
               |   |
               |   
               |   
               |  
               |
            """
        };

        System.out.println(hangmanStages[6 - lives]);
    }

    public void displayEndGameMessage(boolean wordGuessed, String wordToGuess) {
        if (wordGuessed) {
            System.out.println("Поздравляю! Вы угадали слово: " + wordToGuess);
        } else {
            System.out.println("Вы проиграли! Загаданное слово было: " + wordToGuess);
        }
    }
}
