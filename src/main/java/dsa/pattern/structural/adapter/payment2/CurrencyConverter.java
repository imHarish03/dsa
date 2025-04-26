package dsa.pattern.structural.adapter.payment2;

public interface CurrencyConverter {
    double convert(String fromCurrency, String toCurrency, double amount);
}
