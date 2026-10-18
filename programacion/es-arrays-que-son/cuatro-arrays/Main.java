public class Main {
    // Devuelve el último elemento del array. Con {4, 8, 15} devuelve 15.
    static int last(int[] values) {
        return 0;
    }

    // Une los textos con una coma y un espacio.
    // Con {"pan", "queso", "uvas"} devuelve "pan, queso, uvas".
    static String join(String[] words) {
        return "";
    }

    // Devuelve un array nuevo con cada número multiplicado por 2.
    // Con {1, 2, 3} devuelve {2, 4, 6}.
    static int[] doubled(int[] values) {
        return values;
    }

    // Devuelve un array nuevo con los mismos números en orden inverso.
    // Con {1, 2, 3} devuelve {3, 2, 1}.
    static int[] reversed(int[] values) {
        return values;
    }

    public static void main(String[] args) {
        int[] goals = {2, 0, 3, 1, 4};
        System.out.println(last(goals));
        System.out.println(join(new String[]{"pan", "queso", "uvas"}));
        System.out.println(java.util.Arrays.toString(doubled(goals)));
        System.out.println(java.util.Arrays.toString(reversed(goals)));
    }
}
