package ucc.LuisCaicedo.Semana12.State;

// Estado: sin tarjeta
class SinTarjeta implements EstadoCajero {
    private Cajero cajero;
 
    public SinTarjeta(Cajero cajero) {
        this.cajero = cajero;
    }
 
    public void insertarTarjeta() {
        System.out.println("Tarjeta insertada.");
        cajero.setEstado(new ConTarjeta(cajero));
    }
 
    public void ingresarPin(int pin) {
        System.out.println("Primero inserte una tarjeta.");
    }
 
    public void retirarDinero(double monto) {
        System.out.println("Primero inserte una tarjeta.");
    }
}
