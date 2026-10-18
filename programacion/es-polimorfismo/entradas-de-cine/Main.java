// Una entrada de cine normal.
class Ticket {
    double price() {
        return 10.0;
    }

    String label() {
        return "Normal";
    }
}

// La entrada infantil cuesta 5.0 y se llama "Infantil".
class ChildTicket extends Ticket {
}

// La entrada de estudiante cuesta 8.0 y se llama "Estudiante".
class StudentTicket extends Ticket {
}

public class Main {
    // Suma lo que cuestan todas las entradas del array, sean del tipo que sean.
    static double total(Ticket[] tickets) {
        return 0;
    }

    public static void main(String[] args) {
        Ticket[] tickets = {new Ticket(), new ChildTicket(), new StudentTicket()};
        System.out.println(total(tickets));
    }
}
