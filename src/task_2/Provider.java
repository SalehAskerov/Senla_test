package task_2;

import java.util.HashMap;
import java.util.Map;

public class Provider {

    public Map<String, Double> getExchangeRates() {
        Map<String, Double> rates = new HashMap<>();
        rates.put("USD", 1.0);
        rates.put("EUR", 0.92);
        rates.put("GBP", 0.78);
        rates.put("JPY", 152.0);
        rates.put("RUB", 97.0);
        return rates;
    }
}

