import java.util.HashMap;
import java.util.HashSet;

public class Main {
    // Cuenta cuántas veces sale cada palabra.
    // Con {"si", "no", "si"} devuelve un mapa con si=2 y no=1.
    static HashMap<String, Integer> countWords(String[] words) {
        return new HashMap<String, Integer>();
    }

    // Cuenta cuántos nombres distintos hay. Con {"Ana", "Iker", "Ana"} devuelve 2.
    static int uniqueCount(String[] names) {
        return -1;
    }

    // El total del carrito: unidades de cada producto por su precio.
    // Un producto sin precio en la carta no suma nada.
    static int cartTotal(HashMap<String, Integer> units, HashMap<String, Integer> prices) {
        return -1;
    }

    // Devuelve true si algún nombre sale dos veces o más.
    static boolean hasDuplicates(String[] names) {
        return false;
    }

    public static void main(String[] args) {
        System.out.println(countWords(new String[]{"si", "no", "si"}).get("si"));
        System.out.println(uniqueCount(new String[]{"Ana", "Iker", "Ana"}));
        HashMap<String, Integer> units = new HashMap<String, Integer>();
        units.put("bocadillo", 2);
        units.put("café", 3);
        HashMap<String, Integer> prices = new HashMap<String, Integer>();
        prices.put("bocadillo", 3);
        prices.put("café", 1);
        System.out.println(cartTotal(units, prices));
        System.out.println(hasDuplicates(new String[]{"Ana", "Iker", "Ana"}));
    }
}
