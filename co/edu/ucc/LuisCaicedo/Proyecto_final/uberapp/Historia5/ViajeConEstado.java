package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia5;

import ucc.LuisCaicedo.Proyecto_final.uberapp.Historia2.SolicitudViaje;

public class ViajeConEstado {
    private EstadoViaje estadoActual;
    private MediadorSistema mediador;
    private SolicitudViaje solicitud; // ✅ Referencia al viaje real

    public ViajeConEstado(MediadorSistema mediador, SolicitudViaje solicitud) {
        this.estadoActual = new SolicitadoState(); // Estado inicial
        this.mediador = mediador;
        this.solicitud = solicitud;
    }

    public void asignar() {
        estadoActual.asignar(this);
    }

    public void iniciar() {
        estadoActual.iniciar(this);
    }

    public void completar() {
        estadoActual.completar(this);
    }

    public void cancelar() {
        estadoActual.cancelar(this);
    }

    public void setEstado(EstadoViaje nuevoEstado) {
        this.estadoActual = nuevoEstado;
        String nombreEstado = nuevoEstado.getNombreEstado();
        solicitud.setEstado(nombreEstado);          // ✅ Sincroniza con SolicitudViaje
        mediador.notificarCambioEstado(nombreEstado); // ✅ Notifica Mediador
    }

    public String getEstadoActual() {
        return estadoActual.getNombreEstado();
    }

    public SolicitudViaje getSolicitud() {
        return solicitud;
    }
}