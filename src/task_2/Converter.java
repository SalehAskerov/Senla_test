package task_2;

import java.util.Map;

public class Converter {
    private final Map<String, Double> exchangeRates;

    public Converter(Map<String, Double> exchangeRates) {
        this.exchangeRates = exchangeRates;
    }

    public double convert(double amount, String fromCurrency, String toCurrency) {
        if (!exchangeRates.containsKey(fromCurrency) || !exchangeRates.containsKey(toCurrency)) {
            throw new IllegalArgumentException("Invalid currency code.");
        }
        double fromRate = exchangeRates.get(fromCurrency);
        double toRate = exchangeRates.get(toCurrency);
        return amount * toRate / fromRate;
    }
}

