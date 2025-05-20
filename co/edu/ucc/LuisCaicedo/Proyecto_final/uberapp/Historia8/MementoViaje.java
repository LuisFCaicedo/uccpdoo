package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia8;

import ucc.LuisCaicedo.Proyecto_final.uberapp.Historia2.SolicitudViaje;

public class MementoViaje {
    private final String estado;

    public MementoViaje(SolicitudViaje viaje) {
        this.estado = viaje.getEstado();
    }

    public void restaurar(SolicitudViaje viaje) {
        viaje.setEstado(estado);
    }

    public String getEstadoGuardado() {
        return estado;
    }
}