package co.edu.ucc.LuisCaicedo.Sector_Recreacion;

public class Main {
    public static void main(String[] args) {
        imprimirEncabezado();

        Identidad identidad = new Identidad("Luis Caicedo");

        CanchaReserva cancha = CanchaReserva.getInstancia(); // Se obtiene la única instancia
        cancha.reservarCancha("2025-10-15", "20:00", "Juan Pérez");
        cancha.reservarCancha("2025-10-15", "18:00", "Carlos Gómez");
        cancha.mostrarReservas();

        // Imprimir identidad codificada solo al final
        System.out.println("La indentidad del estudiante en Base64 es: " + identidad.getNombreCodificado());
        System.out.println("\n El Patrón de diseño utilizado: " + cancha.getPatron());
    }
    public static void imprimirEncabezado() {
        System.out.println("=============================================");
        System.out.println(" 👷         BIENVENIDO A LA UCC      👷     ");
        System.out.println("           Recreacion - Singlleton           ");
        System.out.println("=============================================");
        System.out.println("Ejecutado por: Luis Fernando Caicedo Solis"   );
        System.out.println("Patrones de Diseño Orientado a Odjeto        ");
        System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
        System.out.println("=============================================");
        System.out.println();
    }
}
