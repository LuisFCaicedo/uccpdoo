package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia4;

public class GPSWazeAdapter implements IGPSViaje {
    private GPSExternoGoogle gpsGoogle = new GPSExternoGoogle();

    public String obtenerUbicacionActual() {
        return gpsGoogle.getPosicion();
    }
}
