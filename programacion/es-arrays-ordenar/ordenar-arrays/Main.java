public class Main {
    // Intercambia lo que hay en las posiciones a y b del array.
    // Con {1, 2, 3} y las posiciones 0 y 2 el array queda {3, 2, 1}.
    static void swap(int[] values, int a, int b) {
    }

    // Devuelve true si cada número es menor o igual que el siguiente.
    static boolean isSorted(int[] values) {
        return true;
    }

    // Ordena de menor a mayor con el método de la burbuja y devuelve el mismo array.
    static int[] sortUp(int[] values) {
        return values;
    }

    // Ordena de mayor a menor y devuelve el mismo array.
    static int[] sortDown(int[] values) {
        return values;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 4};
        System.out.println(isSorted(numbers));
        sortUp(numbers);
        System.out.println(java.util.Arrays.toString(numbers));
        sortDown(numbers);
        System.out.println(java.util.Arrays.toString(numbers));
    }
}
