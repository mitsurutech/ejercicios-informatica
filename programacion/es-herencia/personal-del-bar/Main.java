// Un trabajador del bar: tiene nombre y cobra por horas.
class Worker {
    private String name;
    private double hourly;

    Worker(String name, double hourly) {
        this.name = name;
        this.hourly = hourly;
    }

    String getName() {
        return name;
    }

    // Lo que cobra por un número de horas.
    double pay(int hours) {
        return hourly * hours;
    }
}

// Un cocinero cobra siempre 12.0 euros por hora.
class Cook extends Worker {
    Cook(String name) {
        super(name, 0.0);
    }
}

// Un camarero tiene su sueldo por hora y además recibe propinas.
class Waiter extends Worker {
    private double tips;

    Waiter(String name, double hourly, double tips) {
        super(name, 0.0);
    }

    // Lo que cobra por las horas más sus propinas.
    double totalPay(int hours) {
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Cook cook = new Cook("Iker");
        Waiter waiter = new Waiter("Lucía", 10.0, 25.0);
        System.out.println(cook.getName() + " cobra " + cook.pay(10));
        System.out.println(waiter.getName() + " cobra " + waiter.totalPay(10));
    }
}
