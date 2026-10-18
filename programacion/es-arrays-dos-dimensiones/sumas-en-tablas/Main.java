public class Main {
    // Suma los números de una fila de la tabla.
    // Con {{1, 2, 3}, {4, 5, 6}} y la fila 1 devuelve 4 + 5 + 6 = 15.
    static int rowSum(int[][] table, int row) {
        return 0;
    }

    // Suma los números de una columna de la tabla.
    // Con {{1, 2, 3}, {4, 5, 6}} y la columna 2 devuelve 3 + 6 = 9.
    static int columnSum(int[][] table, int column) {
        return 0;
    }

    // Suma todos los números de la tabla. Con la tabla de arriba devuelve 21.
    static int total(int[][] table) {
        return 0;
    }

    // Devuelve el número más grande de la tabla. Con la tabla de arriba devuelve 6.
    static int biggest(int[][] table) {
        return 0;
    }

    public static void main(String[] args) {
        int[][] sales = {{12, 8, 5}, {9, 10, 7}, {15, 6, 4}};
        System.out.println(rowSum(sales, 0));
        System.out.println(columnSum(sales, 0));
        System.out.println(total(sales));
        System.out.println(biggest(sales));
    }
}
