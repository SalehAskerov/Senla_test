package task_3;

public class Settings {
    private final int length;

    public Settings(int length) {
        if (length < 8 || length > 12) {
            throw new IllegalArgumentException("Длина пароля должна быть от 8 до 12 символов.");
        }
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
