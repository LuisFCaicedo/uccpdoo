package ucc.LuisCaicedo.Semana12.State;

// Interfaz de Estado
interface EstadoCajero {
    void insertarTarjeta();
    void ingresarPin(int pin);
    void retirarDinero(double monto);
}
