package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia5;

public class SolicitadoState implements EstadoViaje {

    @Override
    public void asignar(ViajeConEstado viaje) {
        viaje.setEstado(new AsignadoState());
    }

    @Override
    public void iniciar(ViajeConEstado viaje) {
        System.out.println("❌ No se puede iniciar. El viaje aún no ha sido asignado.");
    }

    @Override
    public void completar(ViajeConEstado viaje) {
        System.out.println("❌ No se puede completar. El viaje ni siquiera ha comenzado.");
    }

    @Override
    public void cancelar(ViajeConEstado viaje) {
        viaje.setEstado(new CanceladoState());
    }

    @Override
    public String getNombreEstado() {
        return "Solicitado";
    }
}