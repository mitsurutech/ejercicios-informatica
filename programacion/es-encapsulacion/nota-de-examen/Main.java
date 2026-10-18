// Una nota de examen, de 0 a 10.
class Grade {
    private int mark;

    // Devuelve la nota guardada. Al principio es 0.
    int getMark() {
        return -1; // Cámbialo: debe devolver la nota guardada.
    }

    // Guarda la nota solo si está entre 0 y 10 (los dos valen).
    // Devuelve true si la ha guardado y false si la ha rechazado.
    boolean setMark(int mark) {
        return false;
    }

    // Devuelve "Aprobado" si la nota es 5 o más y "Suspenso" si es menos.
    String result() {
        return "";
    }
}

public class Main {
    public static void main(String[] args) {
        Grade grade = new Grade();
        System.out.println(grade.setMark(7));
        System.out.println(grade.getMark());
        System.out.println(grade.result());
    }
}
