package co.edu.ucc.LuisCaicedo.Examen;

interface Prestamo {
    void mostrarDetalles();
}
 
class PrestamoHipotecario implements Prestamo {
    public void mostrarDetalles() {
        System.out.println("Préstamo Hipotecario: tasa 5%, plazo 30 años");
    }
}
 
class PrestamoAutomotriz implements Prestamo {
    public void mostrarDetalles() {
        System.out.println("Préstamo Automotriz: tasa 7%, plazo 5 años");
    }
}
 
class PrestamoPersonal implements Prestamo {
    public void mostrarDetalles() {
        System.out.println("Préstamo Personal: tasa 10%, plazo 3 años");
    }
}
 
class FabricaPrestamo {
    public static Prestamo obtenerPrestamo(String tipo) {
        switch (tipo.toLowerCase()) {
            case "hipotecario": return new PrestamoHipotecario();
            case "automotriz": return new PrestamoAutomotriz();
            case "personal": return new PrestamoPersonal();
            default: throw new IllegalArgumentException("Tipo de préstamo no válido");
        }
    }
    public static void getPatron() {
        System.out.println("El patrón de diseño utilizado es: Factory Method");
    }
}

