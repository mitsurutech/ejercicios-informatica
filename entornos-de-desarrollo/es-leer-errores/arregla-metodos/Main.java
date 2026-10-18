public class Main {
    // Precio de un menú con un 10 % de descuento: 9.5 euros pasan a 8.55.
    static double discounted(double price) {
        double result = price * 0.9
        return result;
    }

    // Lo que paga cada persona al repartir una cuenta: 30 euros entre 4 son 7.5.
    static double perPerson(double total, int people) {
        int share = total / people;
        return share;
    }

    // Media de goles por partido, sin decimales. Sin partidos devuelve 0.
    static int averageGoals(int goals, int matches) {
        return goals / matches;
    }

    public static void main(String[] args) {
        System.out.println(discounted(9.5));
        System.out.println(perPerson(30, 4));
        System.out.println(averageGoals(7, 2));
    }
}
