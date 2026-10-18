import java.io.PrintWriter;

public class Main {
    // Escribe una línea por equipo con el formato nombre;puntos.
    // Con {"Tigres", "Águilas"} y {3, 1} escribe Tigres;3 y después Águilas;1.
    static void writeStandings(PrintWriter out, String[] teams, int[] points) {
    }

    // Escribe una sola línea con la suma de los puntos: Total;4
    static void writeTotal(PrintWriter out, int[] points) {
    }

    // Escribe cada texto en su línea, con su número delante: 1. pan
    // Los números empiezan en 1.
    static void writeNumbered(PrintWriter out, String[] lines) {
    }

    // Escribe una línea con el equipo que tiene más puntos: Líder: Tigres
    // Si hay empate, el primero. Si no hay equipos, no escribe nada.
    static void writeLeader(PrintWriter out, String[] teams, int[] points) {
    }

    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out);
        String[] teams = {"Tigres", "Águilas", "Lobos"};
        int[] points = {3, 1, 0};
        writeStandings(out, teams, points);
        writeTotal(out, points);
        writeNumbered(out, new String[]{"pan", "leche"});
        writeLeader(out, teams, points);
        out.flush();
    }
}
