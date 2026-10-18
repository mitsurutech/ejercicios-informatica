import java.util.Scanner;

public class Main {
    // Cuenta las líneas que tiene el texto, también las vacías.
    static int countLines(Scanner in) {
        return -1;
    }

    // Cada línea tiene un número. Suma los números y se salta las líneas
    // que no lo son, como una línea vacía o una que dice "abc".
    static int sumNumbers(Scanner in) {
        return -1;
    }

    // Devuelve la primera línea que contiene word. Si ninguna, devuelve "".
    // Pista: line.contains(word)
    static String firstWith(Scanner in, String word) {
        return "x";
    }

    // Cada línea es nombre;nota, por ejemplo Ana;8.
    // Devuelve el nombre de la nota más alta. Si hay empate, el primero.
    // Si no hay ninguna línea, devuelve "".
    static String bestStudent(Scanner in) {
        return "x";
    }

    public static void main(String[] args) {
        System.out.println(countLines(new Scanner("uno\ndos\ntres\n")));
        System.out.println(sumNumbers(new Scanner("10\n\nabc\n5\n")));
        System.out.println(firstWith(new Scanner("pan\nleche entera\nleche sin lactosa\n"), "leche"));
        System.out.println(bestStudent(new Scanner("Ana;8\nIker;9\nLucía;9\n")));
    }
}
