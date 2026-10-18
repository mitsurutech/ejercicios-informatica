import java.util.ArrayList;

public class Main {
    // Añade name a la lista solo si no está ya. Devuelve true si lo ha añadido.
    static boolean addIfMissing(ArrayList<String> list, String name) {
        return false;
    }

    // Borra de la lista los nombres con menos de minLength letras.
    // Devuelve cuántos ha borrado. Cuidado con los nombres que quedan juntos.
    static int removeShort(ArrayList<String> list, int minLength) {
        return 0;
    }

    // Devuelve el nombre más largo. Si hay empate, el primero.
    // Con la lista vacía devuelve "".
    static String longest(ArrayList<String> list) {
        return "x";
    }

    // Devuelve una lista nueva con los mismos nombres en orden inverso.
    // La lista original no cambia.
    static ArrayList<String> reversed(ArrayList<String> list) {
        return new ArrayList<String>();
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        System.out.println(addIfMissing(names, "Ana"));
        System.out.println(addIfMissing(names, "Ana"));
        names.add("Io");
        names.add("Marcos");
        System.out.println(longest(names));
        System.out.println(removeShort(names, 3));
        System.out.println(reversed(names));
    }
}
