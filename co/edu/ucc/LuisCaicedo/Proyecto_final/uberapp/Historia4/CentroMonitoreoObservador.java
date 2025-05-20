package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia4;

public class CentroMonitoreoObservador implements Observador {
    public void actualizar(String ubicacion) {
        System.out.println("🖥️ Centro de Monitoreo: Conductor ahora está en → " + ubicacion);
    }
}
