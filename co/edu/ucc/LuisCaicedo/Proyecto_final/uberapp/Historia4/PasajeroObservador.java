package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia4;

public class PasajeroObservador implements Observador {
    public void actualizar(String ubicacion) {
        System.out.println("📱 Pasajero: Nueva ubicación → " + ubicacion);
    }
}
