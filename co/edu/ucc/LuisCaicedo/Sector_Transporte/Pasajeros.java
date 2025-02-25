package co.edu.ucc.LuisCaicedo.Sector_Transporte;

class Boleto {
    private String viaje;
    private String pasajero;

    public Boleto(String viaje, String pasajero) {
        this.viaje = viaje;
        this.pasajero = pasajero;
    }

    public void mostrarBoleto() {
        System.out.println("Viaje: " + viaje + ", Pasajero: " + pasajero);
    }
}

class Autobus {
    public Boleto comprarBoleto(String viaje, String pasajero) {
        return new Boleto(viaje, pasajero);
    }
    public void getPatron() {
        System.out.println("El patrón de diseño utilizado es: Factory Method");
        }
}

