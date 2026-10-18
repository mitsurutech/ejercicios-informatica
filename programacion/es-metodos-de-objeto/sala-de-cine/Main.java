// Una sala de cine con aforo limitado.
class Room {
    private int capacity;
    private int people;

    Room(int capacity) {
        this.capacity = capacity;
        this.people = 0;
    }

    // Plazas libres que quedan.
    int freeSeats() {
        return 0;
    }

    // Entran varias personas a la vez. Solo entran si caben todas.
    // Devuelve true si han entrado y false si no caben.
    boolean enter(int count) {
        return false;
    }

    // Salen varias personas. Nunca puede haber menos de cero personas dentro.
    // Si salen más de las que hay, quedan cero.
    void leave(int count) {
    }
}

public class Main {
    public static void main(String[] args) {
        Room room = new Room(5);
        System.out.println(room.enter(3));
        System.out.println(room.freeSeats());
    }
}
