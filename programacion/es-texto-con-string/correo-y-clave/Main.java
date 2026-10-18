public class Main {
    // Correo del instituto: nombre.apellido@instituto.es, todo en minúsculas.
    static String schoolEmail(String name, String surname) {
        return "";
    }

    // Iniciales en mayúsculas con puntos. Con "marta" y "ruiz" sale M.R.
    static String initials(String name, String surname) {
        return "";
    }

    // Una contraseña es fuerte si tiene 8 caracteres o más.
    static boolean isStrong(String password) {
        return false;
    }

    // Dos usuarios son el mismo aunque cambien las mayúsculas.
    static boolean sameUser(String first, String second) {
        return false;
    }

    public static void main(String[] args) {
        System.out.println(schoolEmail("Marta", "Ruiz"));
        System.out.println(initials("marta", "ruiz"));
        System.out.println(isStrong("gol2024"));
        System.out.println(sameUser("Marta", "marta"));
    }
}
