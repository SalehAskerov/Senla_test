package task_1;

import java.util.Random;

public class Word {
    private static final String[] WORDS = {"apple", "cherry", "bridge", "phone", "system"};

    public String getRandomWord() {
        Random random = new Random();
        return WORDS[random.nextInt(WORDS.length)];
    }
}
