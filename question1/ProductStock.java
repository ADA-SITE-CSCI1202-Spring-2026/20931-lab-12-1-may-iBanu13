package question1;
import java.util.HashMap;
public class ProductStock {
    public static void main(String[] args) {
        HashMap<String, Integer> stock = new HashMap<>();
// ===== TODO 1 =====
        stock.put("Laptop", 5);
        stock.put("Mouse", 20);
        stock.put("Keyboard", 10);
        stock.put("Monitor", 3);
        System.out.println("All products:");
// ===== TODO 2 =====
        stock.forEach((item, count) -> 
            System.out.println(item + " -> " + count)
        );

        System.out.println("\nLow stock products:");
// ===== TODO 3 =====
        stock.forEach((item, count) -> {
            if(count < 6){
                System.out.println(item + " -> " + count);
            }
        });
    }
}
