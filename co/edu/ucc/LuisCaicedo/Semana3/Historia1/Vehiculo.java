package ucc.LuisCaicedo.Semana3.Historia1;

// Definición de la clase base Vehiculo
abstract class Vehiculo {
    public abstract void encender();

    public String getPatron() {
        return "Factory Method";
    }
}

// Implementaciones concretas de Vehiculo
class CarroElectrico extends Vehiculo {
    
    public void encender() {
        System.out.println("El carro eléctrico se ha encendido.");
    }
}

class CarroGasolina extends Vehiculo {
    
    public void encender() {
        System.out.println("El carro de gasolina se ha encendido.");
    }
}

// Definición de la fábrica de vehículos (Factory Method)
abstract class VehiculoFactory {
    public abstract Vehiculo crearVehiculo();
}

// Implementaciones concretas de la fábrica
class CarroElectricoFactory extends VehiculoFactory {
    
    public Vehiculo crearVehiculo() {
        return new CarroElectrico();
    }
}

class CarroGasolinaFactory extends VehiculoFactory {
    
    public Vehiculo crearVehiculo() {
        return new CarroGasolina();
    }
}

