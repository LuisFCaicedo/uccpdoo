package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia5;

public class CanceladoState implements EstadoViaje {

    @Override
    public void asignar(ViajeConEstado viaje) {
        System.out.println("❌ No se puede asignar. El viaje ha sido cancelado.");
    }

    @Override
    public void iniciar(ViajeConEstado viaje) {
        System.out.println("❌ No se puede iniciar. El viaje ha sido cancelado.");
    }

    @Override
    public void completar(ViajeConEstado viaje) {
        System.out.println("❌ No se puede completar. El viaje ha sido cancelado.");
    }

    @Override
    public void cancelar(ViajeConEstado viaje) {
        System.out.println("🔄 El viaje ya está cancelado.");
    }

    @Override
    public String getNombreEstado() {
        return "Cancelado";
    }
}