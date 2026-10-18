import java.util.Scanner;

public class Main {
    // La pista para un intento: "Más alto" si el intento es menor que el secreto,
    // "Más bajo" si es mayor y "¡Acertaste!" si es igual.
    static String hint(int secret, int guess) {
        return "";
    }

    // Un intento vale si está entre 1 y 100, los dos incluidos.
    static boolean validGuess(int guess) {
        return false;
    }

    // Lee intentos del Scanner hasta que uno acierte el secreto.
    // Devuelve cuántos intentos válidos ha hecho. Los que no son válidos no cuentan.
    // Si se acaban los números sin acertar, devuelve -1.
    static int play(int secret, Scanner in) {
        return 0;
    }

    // La nota según los intentos: -1 es "Sin acertar", de 1 a 3 "Excelente",
    // de 4 a 7 "Bien" y de 8 en adelante "A practicar".
    static String rating(int attempts) {
        return "";
    }

    public static void main(String[] args) {
        System.out.println(hint(42, 30));
        System.out.println(validGuess(150));
        int attempts = play(42, new Scanner("50 25 37 42"));
        System.out.println(attempts);
        System.out.println(rating(attempts));
    }
}
