public class Main {
    // Precio de la entrada al polideportivo.
    // Menos de 12 años: gratis. De 12 a 17 años: 2.5 euros. De 18 en adelante: 4 euros.
    static double ticketPrice(int age) {
        if (age <= 12) {
            return 0;
        }
        if (age < 17) {
            return 2.5;
        }
        return 4;
    }

    // Un grupo cabe en el autobús si tiene de 1 a 50 personas, las dos incluidas.
    static boolean fitsInBus(int people) {
        return people > 1 && people < 50;
    }

    // Un porcentaje válido va de 0 a 100, los dos incluidos.
    static boolean isValidPercentage(int value) {
        return value > 0 && value < 100;
    }

    public static void main(String[] args) {
        System.out.println(ticketPrice(12));
        System.out.println(fitsInBus(50));
        System.out.println(isValidPercentage(100));
    }
}
