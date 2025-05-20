package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia2;

public abstract class SolicitudViaje {
    protected String origen;
    protected String destino;
    protected String metodoPago;
    protected String estado;  // ✅ Nuevo campo para sincronizar estado

    public SolicitudViaje(String origen, String destino, String metodoPago) {
        this.origen = origen;
        this.destino = destino;
        this.metodoPago = metodoPago;
        this.estado = "Solicitado"; // Estado inicial
    }

    public String getOrigen() { return origen; }
    public String getDestino() { return destino; }
    public String getMetodoPago() { return metodoPago; }

    // ✅ Métodos de estado
    public String getEstado() {
        return estado;
    }

    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public abstract void mostrarDetalles();
}


