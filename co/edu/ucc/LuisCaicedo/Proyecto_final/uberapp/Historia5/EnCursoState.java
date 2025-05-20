package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia5;

public class EnCursoState implements EstadoViaje {

    @Override
    public void asignar(ViajeConEstado viaje) {
        System.out.println("❌ No se puede reasignar. El viaje ya está en curso.");
    }

    @Override
    public void iniciar(ViajeConEstado viaje) {
        System.out.println("🔄 El viaje ya está en curso.");
    }

    @Override
    public void completar(ViajeConEstado viaje) {
        viaje.setEstado(new CompletadoState());
    }

    @Override
    public void cancelar(ViajeConEstado viaje) {
        System.out.println("❌ No se puede cancelar. El viaje ya está en curso.");
    }

    @Override
    public String getNombreEstado() {
        return "En curso";
    }
}