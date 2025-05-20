package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia5;

public interface EstadoViaje {
    void asignar(ViajeConEstado viaje);
    void iniciar(ViajeConEstado viaje);
    void completar(ViajeConEstado viaje);
    void cancelar(ViajeConEstado viaje);
    String getNombreEstado();
}
