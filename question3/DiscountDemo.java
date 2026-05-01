package question3;

@FunctionalInterface
interface DiscountCalculator {
// ===== TODO 1 =====
// Create a method named calculate.
// It should take double price and return double.
    double calculate(double price);
}
public class DiscountDemo {
    public static void main(String[] args) {
// ===== TODO 2 =====
// Create a lambda that gives 10% discount.
    DiscountCalculator tenPercent = price -> price * 0.90;
// ===== TODO 3 =====
// Create a lambda that gives 25% discount.
    DiscountCalculator twentyFivePercent = price -> price * 0.75;

    double price = 100;
// ===== TODO 4 =====
// Print final price after 10% discount.
        System.out.println("Price after 10% discount: " + tenPercent.calculate(price));
// ===== TODO 5 =====
// Print final price after 25% discount.
        System.out.println("Price after 25% discount: " + twentyFivePercent.calculate(price));
    }
}