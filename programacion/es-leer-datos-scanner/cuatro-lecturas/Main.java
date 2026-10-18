import java.util.Scanner;

public class Main {
    // Lee dos enteros y devuelve su suma.
    static int addTwo(Scanner in) {
        return 0;
    }

    // Lee una línea con un nombre y devuelve: Hola, nombre
    static String greeting(Scanner in) {
        return "";
    }

    // Lee el número de entradas y el precio de una, y devuelve lo que cuestan todas.
    static int ticketTotal(Scanner in) {
        return 0;
    }

    // Lee una edad y, en otra línea, un nombre. Devuelve: Iker tiene 17 años
    static String nameAndAge(Scanner in) {
        return "";
    }

    public static void main(String[] args) {
        System.out.println(addTwo(new Scanner("12 5")));
        System.out.println(greeting(new Scanner("Marta")));
        System.out.println(ticketTotal(new Scanner("4 3")));
        System.out.println(nameAndAge(new Scanner("17\nIker\n")));
    }
}
