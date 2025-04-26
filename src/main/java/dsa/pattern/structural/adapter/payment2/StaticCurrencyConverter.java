package dsa.pattern.structural.adapter.payment2;

public class StaticCurrencyConverter implements CurrencyConverter {
    @Override
    public double convert(String fromCurrency, String toCurrency, double amount) {
        if (fromCurrency.equals("INR") && toCurrency.equals("USD")) {
            return amount / 83; // Assume static conversion rate
        }
        throw new UnsupportedOperationException("Unsupported conversion");
    }
}
