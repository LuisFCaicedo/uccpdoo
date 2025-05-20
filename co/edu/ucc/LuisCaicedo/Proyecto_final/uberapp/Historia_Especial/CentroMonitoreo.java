package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia_Especial;

public class CentroMonitoreo implements ObservadorViaje {
    @Override
    public void actualizar(String viajeId, String nuevoEstado) {
        System.out.println("📡 [" + viajeId + "] Estado → " + nuevoEstado);
    }
}

