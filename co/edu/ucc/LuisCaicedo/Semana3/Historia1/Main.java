package co.edu.ucc.LuisCaicedo.Semana3.Historia1;

// Clase principal con el método main para ejecutar el programa
public class Main {
    public static void main(String[] args) {
        // Crear vehículos usando el Factory Method
        VehiculoFactory factory1 = new CarroElectricoFactory();
        Vehiculo v1 = factory1.crearVehiculo();
        v1.encender();

        VehiculoFactory factory2 = new CarroGasolinaFactory();
        Vehiculo v2 = factory2.crearVehiculo();
        v2.encender();

        System.out.println("Patrón utilizado: " + getPatron());
    }
}