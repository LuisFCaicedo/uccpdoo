package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia8;

import ucc.LuisCaicedo.Proyecto_final.uberapp.Historia2.SolicitudViaje;

public class GestionViajeReal implements OperacionCritica {

    private final SolicitudViaje viaje;

    public GestionViajeReal(SolicitudViaje viaje) {
        this.viaje = viaje;
    }
    public SolicitudViaje getViaje() {
    return viaje;
    }

    @Override
    public void cancelarViaje() {
        viaje.setEstado("Cancelado");
        System.out.println("🚫 El viaje ha sido cancelado.");
    }

    @Override
    public void ajustarPrecio(double nuevoValor) {
        System.out.println("💲 Se ha ajustado el precio a: $" + nuevoValor + " (solo simulado)");
    }
}