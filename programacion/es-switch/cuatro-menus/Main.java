public class Main {
    // Máquina de la cafetería: 1 agua 1.00, 2 galletas 1.50, 3 chocolate 2.00.
    // Cualquier otra opción cuesta 0.
    static double price(int option) {
        return 0;
    }

    // 1 lunes, 2 martes... 7 domingo. Otro número: "desconocido".
    static String dayName(int number) {
        return "";
    }

    // Días de un mes del año: 1 es enero y 12 es diciembre. Febrero tiene 28.
    // Abril, junio, septiembre y noviembre tienen 30. El resto, 31.
    static int daysInMonth(int month) {
        return 0;
    }

    // "M" es Metro, "B" es Autobús y "T" es Tranvía. Otro código: "Andando".
    static String transport(String code) {
        return "";
    }

    public static void main(String[] args) {
        System.out.println(price(2));
        System.out.println(dayName(3));
        System.out.println(daysInMonth(4));
        System.out.println(transport("M"));
    }
}
