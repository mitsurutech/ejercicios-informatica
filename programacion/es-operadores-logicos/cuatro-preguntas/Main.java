public class Main {
    // El fin de semana es sábado o domingo.
    static boolean isWeekend(String day) {
        return false;
    }

    // Devuelve true si el número está entre low y high, los dos incluidos.
    static boolean isBetween(int number, int low, int high) {
        return false;
    }

    // Un año es bisiesto si es divisible entre 4 y no entre 100,
    // o si es divisible entre 400.
    static boolean isLeapYear(int year) {
        return false;
    }

    // En la biblioteca del instituto te prestan un libro si tienes carnet
    // y no debes ningún libro.
    static boolean canBorrow(boolean hasCard, boolean owesBooks) {
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isWeekend("sábado"));
        System.out.println(isBetween(15, 10, 20));
        System.out.println(isLeapYear(2024));
        System.out.println(canBorrow(true, false));
    }
}
