package co.edu.ucc.LuisCaicedo.Semana3.FactoryMethod;

interface Vehiculo {
    void conducir();
}
 
class CarroElectrico implements Vehiculo {
    public void conducir() {
        System.out.println("Conduciendo un carro eléctrico");
    }
}
 
class CarroGasolina implements Vehiculo {
    public void conducir() {
        System.out.println("Conduciendo un carro a gasolina");
    }
}
 
class FabricaVehiculos {
    public static Vehiculo crearVehiculo(String tipo) {
        if (tipo.equalsIgnoreCase("electrico")) return new CarroElectrico();
        else if (tipo.equalsIgnoreCase("gasolina")) return new CarroGasolina();
        return null;
    }
    public void getPatron() {
        System.out.println("El patrón de diseño utilizado es: Factory Method");
    }
}