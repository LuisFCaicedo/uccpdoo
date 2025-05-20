package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia5;

public class AsignadoState implements EstadoViaje {

    @Override
    public void asignar(ViajeConEstado viaje) {
        System.out.println("🔄 El viaje ya está asignado.");
    }

    @Override
    public void iniciar(ViajeConEstado viaje) {
        viaje.setEstado(new EnCursoState());
    }

    @Override
    public void completar(ViajeConEstado viaje) {
        System.out.println("❌ No se puede completar. El viaje aún no ha iniciado.");
    }

    @Override
    public void cancelar(ViajeConEstado viaje) {
        viaje.setEstado(new CanceladoState());
    }

    @Override
    public String getNombreEstado() {
        return "Asignado";
    }
}