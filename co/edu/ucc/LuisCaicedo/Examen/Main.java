package co.edu.ucc.LuisCaicedo.Examen;

public class Main {
    public static void main(String[] args) {
        imprimirEncabezado();

        Identidad identidad = new Identidad("Luis Caicedo");

        Prestamo prestamo = FabricaPrestamo.obtenerPrestamo("hipotecario");
        prestamo.mostrarDetalles();

        FabricaPrestamo.getPatron();


        System.out.println("La indentidad del estudiante en Base64 es: " + identidad.getNombreCodificado());

    }
    public static void imprimirEncabezado() {
        System.out.println("=============================================");
        System.out.println(" 👷         BIENVENIDO A LA UCC      👷     ");
        System.out.println("         Prestamos - Factory Method           ");
        System.out.println("=============================================");
        System.out.println("Ejecutado por: Luis Fernando Caicedo Solis"   );
        System.out.println("Patrones de Diseño Orientado a Odjeto        ");
        System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
        System.out.println("=============================================");
        System.out.println();
    }
}