package task_3;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину пароля (от 8 до 12 символов): ");

        try {
            int length = scanner.nextInt();
            Settings settings = new Settings(length);
            Generator generator = new Generator();

            String password = generator.generatePassword(settings);
            System.out.println("Сгенерированный пароль: " + password);

        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
