package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia_Especial;

import java.util.ArrayList;
import java.util.List;

public class ViajeSimulado {
    private String id;
    private String estado;
    private String tipoVehiculo;
    private String metodoPago;
    private final List<ObservadorViaje> observadores = new ArrayList<>();

    public ViajeSimulado(String id, String tipoVehiculo, String metodoPago) {
        this.id = id;
        this.tipoVehiculo = tipoVehiculo;
        this.metodoPago = metodoPago;
        this.estado = "Solicitado";
    }

    public void agregarObservador(ObservadorViaje o) {
        observadores.add(o);
    }

    public void notificar() {
        for (ObservadorViaje o : observadores) {
            o.actualizar(id, estado);
        }
    }

    public void setEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notificar();
    }

    public String getEstado() {
        return estado;
    }

    public String getId() {
        return id;
    }

    public ViajeEstado guardarEstado() {
        return new ViajeEstado(estado);
    }

    public void restaurarEstado(ViajeEstado memento) {
        this.estado = memento.getEstado();
        notificar();
    }
}