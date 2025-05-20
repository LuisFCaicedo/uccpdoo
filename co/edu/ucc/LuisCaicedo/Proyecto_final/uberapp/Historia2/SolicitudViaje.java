package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia2;

public abstract class SolicitudViaje {
    protected String origen;
    protected String destino;
    protected String metodoPago;

    public SolicitudViaje(String origen, String destino, String metodoPago) {
        this.origen = origen;
        this.destino = destino;
        this.metodoPago = metodoPago;
    }

    public abstract void mostrarDetalles();
}

