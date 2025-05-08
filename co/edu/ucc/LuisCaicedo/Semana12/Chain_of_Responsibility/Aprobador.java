package ucc.LuisCaicedo.Semana12.Chain_of_Responsibility;

// Interfaz manejador
abstract class Aprobador {
    protected Aprobador siguiente;
 
    public void setSiguiente(Aprobador siguiente) {
        this.siguiente = siguiente;
    }
 
    public abstract void procesarSolicitud(double monto);
}
