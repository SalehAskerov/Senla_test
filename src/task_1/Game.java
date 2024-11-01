package task_1;

public class Game {
    private final String wordToGuess;
    private char[] guessedWord;
    private int lives;
    private boolean wordGuessed;

    public Game(String word, int maxLives) {
        this.wordToGuess = word;
        this.lives = maxLives;
        this.guessedWord = new char[word.length()];
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }
        this.wordGuessed = false;
    }

    public boolean isGameOver() {
        return lives <= 0 || wordGuessed;
    }

    public boolean guessLetter(char letter) {
        boolean correctGuess = false;
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == letter) {
                guessedWord[i] = letter;
                correctGuess = true;
            }
        }
        if (!correctGuess) {
            lives--;
        }
        wordGuessed = String.valueOf(guessedWord).equals(wordToGuess);
        return correctGuess;
    }

    public String getGuessedWord() {
        return String.valueOf(guessedWord);
    }

    public int getLives() {
        return lives;
    }

    public boolean isWordGuessed() {
        return wordGuessed;
    }
}
