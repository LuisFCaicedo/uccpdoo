package ucc.LuisCaicedo.Semana12.State;

// Estado: autenticado
class Autenticado implements EstadoCajero {
    private Cajero cajero;
 
    public Autenticado(Cajero cajero) {
        this.cajero = cajero;
    }
 
    public void insertarTarjeta() {
        System.out.println("Ya autenticado. No necesita reiniciar.");
    }
 
    public void ingresarPin(int pin) {
        System.out.println("Ya autenticado.");
    }
 
    public void retirarDinero(double monto) {
        System.out.println("Retirando $" + monto);
        cajero.setEstado(new SinTarjeta(cajero));
    }
    public static String getPatron() {
        return "Patrón State";
    }
}
