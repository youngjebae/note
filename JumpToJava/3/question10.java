import java.util.HashMap;

public class question10 {
    enum coffee {
            AMERICANO,
            ICE_AMERICANO,
            CAFE_LATTE
        }

    static void printCoffeePrice(coffee type) {
        HashMap<coffee, Integer> priceMap = new HashMap<>();
        priceMap.put(coffee.AMERICANO, 3000);
        priceMap.put(coffee.ICE_AMERICANO, 4000);
        priceMap.put(coffee.CAFE_LATTE, 5000);
        int price = priceMap.get(type);
        System.out.println(String.format("가격은 %d원 입니다.", price));
    }

    public static void main(String[] args) {
        printCoffeePrice(coffee.AMERICANO); 
        printCoffeePrice(coffee.ICE_AMERICANO); 
        printCoffeePrice(coffee.CAFE_LATTE); 
    }
}