package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia4;

public class GPSOpenStreetAdapter implements IGPSViaje {
    private GPSExternoGoogle gpsGoogle = new GPSExternoGoogle();

    public String obtenerUbicacionActual() {
        return gpsGoogle.getPosicion();
    }
}