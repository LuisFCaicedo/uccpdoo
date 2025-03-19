package ucc.LuisCaicedo.Semana3.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        imprimirEncabezado();
        Identidad identidad = new Identidad("Luis Caicedo");

        Vehiculo v1 = FabricaVehiculos.crearVehiculo("electrico");
        v1.conducir();

        FabricaVehiculos fabrica = new FabricaVehiculos();
        fabrica.getPatron();

        // Imprimir identidad codificada solo al final
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


