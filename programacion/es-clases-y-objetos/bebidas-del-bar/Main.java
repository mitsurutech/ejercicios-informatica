// El molde de una bebida del bar.
class Drink {
    String name;
    double price;
    int ml;
}

public class Main {
    // Crea una bebida nueva y rellena sus tres atributos.
    static Drink makeDrink(String name, double price, int ml) {
        return null;
    }

    // Resta el descuento al precio de la misma bebida (no crea otra).
    static void applyDiscount(Drink drink, double discount) {
    }

    // Devuelve el nombre de la bebida más barata. Si cuestan lo mismo, la primera.
    static String cheaperName(Drink first, Drink second) {
        return "";
    }

    // Devuelve un texto como: Cola (330 ml)
    static String describe(Drink drink) {
        return "";
    }

    public static void main(String[] args) {
        Drink cola = makeDrink("Cola", 1.5, 330);
        System.out.println(describe(cola));
    }
}
