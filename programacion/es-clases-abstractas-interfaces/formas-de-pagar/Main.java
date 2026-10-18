// Cualquier forma de pagar en el bar. No se puede crear un Payment suelto.
abstract class Payment {
    // Cada forma de pagar dice cuánto cobra de comisión.
    abstract double fee();

    // Lo que se paga de verdad: el importe más la comisión.
    double total(double amount) {
        return amount + fee();
    }
}

// Cosas que saben decir cómo se llaman en una palabra.
interface Describable {
    String describe();
}

// Efectivo: comisión 0.0 y describe() devuelve "Efectivo".
class CashPayment extends Payment implements Describable {
    double fee() {
        return -1;
    }

    public String describe() {
        return "";
    }
}

// Tarjeta: comisión 0.5 y describe() devuelve "Tarjeta".
class CardPayment extends Payment implements Describable {
    double fee() {
        return -1;
    }

    public String describe() {
        return "";
    }
}

// Móvil: comisión 0.25 y describe() devuelve "Móvil".
class MobilePayment extends Payment implements Describable {
    double fee() {
        return -1;
    }

    public String describe() {
        return "";
    }
}

public class Main {
    // Lo que entra en la caja: payments[i] paga amounts[i], con su comisión.
    static double totalCollected(Payment[] payments, double[] amounts) {
        return 0;
    }

    // Las descripciones separadas por coma y espacio: "Efectivo, Tarjeta".
    // Con un array vacío devuelve "".
    static String describeAll(Describable[] items) {
        return "x";
    }

    public static void main(String[] args) {
        Payment[] payments = {new CashPayment(), new CardPayment(), new MobilePayment()};
        double[] amounts = {2.0, 3.0, 4.0};
        System.out.println(totalCollected(payments, amounts));
        Describable[] items = {new CashPayment(), new CardPayment(), new MobilePayment()};
        System.out.println(describeAll(items));
    }
}
