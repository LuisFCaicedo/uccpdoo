package ucc.LuisCaicedo.Proyecto_final.uberapp.comun;

import ucc.LuisCaicedo.Proyecto_final.uberapp.Historia2.SolicitudViaje;

public class BaseDatosViajes {
    private static SolicitudViaje ultimoViaje;

    public static void guardarViaje(SolicitudViaje viaje) {
        ultimoViaje = viaje;
    }

    public static SolicitudViaje obtenerUltimoViaje() {
        return ultimoViaje;
    }
}
