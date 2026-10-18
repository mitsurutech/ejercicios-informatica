public class Main {
    // Convierte el texto en una edad. Si no es un número, o no está entre 0 y 120,
    // devuelve -1. Con "17" devuelve 17 y con "diecisiete" devuelve -1.
    static int parseAge(String text) {
        return 0;
    }

    // Reparte euros entre personas y devuelve lo que paga cada una (división entera).
    // Si people es 0 o menos, lanza una IllegalArgumentException con un mensaje.
    static int splitBill(int euros, int people) {
        return 0;
    }

    // Devuelve values[index]. Si el puesto no existe, devuelve fallback.
    // Usa try y catch.
    static int safeGet(int[] values, int index, int fallback) {
        return 0;
    }

    // Suma los textos que son números enteros y se salta los que no lo son.
    // Con {"4", "x", "6"} devuelve 10.
    static int sumNumbers(String[] texts) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(parseAge("17"));
        System.out.println(parseAge("diecisiete"));
        System.out.println(splitBill(30, 3));
        System.out.println(safeGet(new int[]{5, 6, 7}, 9, -1));
        System.out.println(sumNumbers(new String[]{"4", "x", "6"}));
    }
}
