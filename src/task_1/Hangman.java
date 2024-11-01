package task_1;

import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Word word = new Word();
        Display display = new Display();

        String wordToGuess = word.getRandomWord();
        Game game = new Game(wordToGuess, 6);

        while (!game.isGameOver()) {
            display.displayWord(game.getGuessedWord());
            display.displayLives(game.getLives());
            display.displayHangman(game.getLives());
            System.out.print("Введите букву: ");
            char guessedLetter = scanner.nextLine().charAt(0);

            boolean correctGuess = game.guessLetter(guessedLetter);
            if (!correctGuess) {
                System.out.println("Неправильная буква!");
            }
        }

        display.displayEndGameMessage(game.isWordGuessed(), wordToGuess);
        scanner.close();
    }
}

