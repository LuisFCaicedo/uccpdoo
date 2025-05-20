package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia4;

public class GPSGoogleAdapter implements IGPSViaje {
    private GPSExternoGoogle gpsGoogle = new GPSExternoGoogle();

    public String obtenerUbicacionActual() {
        return gpsGoogle.getPosicion();
    }
}
