package task_2;

import java.util.Map;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Provider provider = new Provider();
        Map<String, Double> exchangeRates = provider.getExchangeRates();
        Converter converter = new Converter(exchangeRates);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Добро пожаловать в конвертер валют!");
        System.out.print("Введите сумму для конвертации: ");
        double amount = scanner.nextDouble();

        System.out.print("Введите код валюты для конвертации из (например, USD): ");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.print("Введите код валюты для конвертации в (например, EUR): ");
        String toCurrency = scanner.next().toUpperCase();

        try {
            double convertedAmount = converter.convert(amount, fromCurrency, toCurrency);
            System.out.printf("Результат: %.2f %s = %.2f %s%n", amount, fromCurrency, convertedAmount, toCurrency);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        scanner.close();
    }
}

