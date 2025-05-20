package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia2;

import ucc.LuisCaicedo.Proyecto_final.uberapp.Historia2.SolicitudViaje;

public class EjecutarSolicitud implements ComandoSolicitud {
    private final SolicitudViaje solicitud;

    public EjecutarSolicitud(SolicitudViaje solicitud) {
        this.solicitud = solicitud;
    }

    @Override
    public void ejecutar() {
        System.out.println("Ejecutando solicitud...");
        solicitud.mostrarDetalles();
    }
}

