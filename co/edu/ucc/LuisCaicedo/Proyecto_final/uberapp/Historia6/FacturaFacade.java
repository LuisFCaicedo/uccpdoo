package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia6;

import ucc.LuisCaicedo.Proyecto_final.uberapp.Historia2.SolicitudViaje;

public class FacturaFacade {
    private final GeneradorFactura generador;

    public FacturaFacade() {
        this.generador = new GeneradorFacturaConcreta();
    }

    public Factura generarYMostrarFactura(SolicitudViaje viaje) {
        Factura factura = generador.generarFactura(viaje);
        factura.mostrarFactura();
        return factura;
    }
}