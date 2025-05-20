package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia5;

public class CompletadoState implements EstadoViaje {

    @Override
    public void asignar(ViajeConEstado viaje) {
        System.out.println("✅ El viaje ya fue completado. No se puede asignar.");
    }

    @Override
    public void iniciar(ViajeConEstado viaje) {
        System.out.println("✅ El viaje ya fue completado.");
    }

    @Override
    public void completar(ViajeConEstado viaje) {
        System.out.println("🔄 El viaje ya está marcado como completado.");
    }

    @Override
    public void cancelar(ViajeConEstado viaje) {
        System.out.println("❌ No se puede cancelar. El viaje ya fue completado.");
    }

    @Override
    public String getNombreEstado() {
        return "Completado";
    }
}