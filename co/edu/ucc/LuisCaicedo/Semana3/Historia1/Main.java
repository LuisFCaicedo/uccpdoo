package ucc.LuisCaicedo.Semana3.Historia1;

// Clase principal con el método main para ejecutar el programa
public class Main {
    public static void main(String[] args) {

        imprimirEncabezado();

        Identidad identidad = new Identidad("Luis Caicedo");

        // Crear vehículos usando el Factory Method
        VehiculoFactory factory1 = new CarroElectricoFactory();
        Vehiculo v1 = factory1.crearVehiculo();
        v1.encender();

        VehiculoFactory factory2 = new CarroGasolinaFactory();
        Vehiculo v2 = factory2.crearVehiculo();
        v2.encender();

        System.out.println("Patrón utilizado: " + v1.getPatron());
        System.out.println("La indentidad del estudiante en Base64 es: " + identidad.getNombreCodificado());
    }
    public static void imprimirEncabezado() {
        System.out.println("=============================================");
        System.out.println(" 👷         BIENVENIDO A LA UCC      👷     ");
        System.out.println("         Vehiculo - Factory Method           ");
        System.out.println("=============================================");
        System.out.println("Ejecutado por: Luis Fernando Caicedo Solis"   );
        System.out.println("Patrones de Diseño Orientado a Odjeto        ");
        System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
        System.out.println("=============================================");
        System.out.println();
    }
}