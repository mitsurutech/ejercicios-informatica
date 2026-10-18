// Un abono de transporte.
class BusPass {
    String owner;
    int trips;
    boolean valid;

    // Constructor completo: guarda el titular y los viajes.
    // El abono es válido si tiene al menos un viaje.
    BusPass(String owner, int trips) {
    }

    // Constructor corto: un abono nuevo trae 10 viajes y es válido.
    BusPass(String owner) {
    }
}

public class Main {
    // Devuelve un texto como: Marta tiene 10 viajes
    static String describe(BusPass pass) {
        return "";
    }

    public static void main(String[] args) {
        BusPass pass = new BusPass("Marta");
        System.out.println(describe(pass));
    }
}
