package task_3;

import java.security.SecureRandom;

public class Generator {
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SPECIALS = "!@#$%^&*()-_=+<>?";

    private final SecureRandom random;

    public Generator() {
        this.random = new SecureRandom();
    }

    public String generatePassword(Settings settings) {
        StringBuilder password = new StringBuilder();
        String allChars = UPPER + LOWER + DIGITS + SPECIALS;

        // Добавляем по одному символу из каждой группы для соответствия требованиям
        password.append(getRandomChar(UPPER));
        password.append(getRandomChar(LOWER));
        password.append(getRandomChar(DIGITS));
        password.append(getRandomChar(SPECIALS));

        for (int i = 4; i < settings.getLength(); i++) {
            password.append(getRandomChar(allChars));
        }

        return shufflePassword(password.toString());
    }

    private char getRandomChar(String characters) {
        return characters.charAt(random.nextInt(characters.length()));
    }

    private String shufflePassword(String password) {
        StringBuilder shuffled = new StringBuilder(password.length());
        password.chars()
                .mapToObj(c -> (char) c)
                .sorted((a, b) -> random.nextInt(3) - 1)
                .forEach(shuffled::append);
        return shuffled.toString();
    }
}

