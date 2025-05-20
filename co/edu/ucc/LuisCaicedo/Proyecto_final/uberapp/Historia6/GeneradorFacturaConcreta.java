package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia6;

import ucc.LuisCaicedo.Proyecto_final.uberapp.Historia2.SolicitudViaje;

public class GeneradorFacturaConcreta extends GeneradorFactura {

    @Override
    protected double calcularTarifa(SolicitudViaje viaje) {
        return switch (viaje.getClass().getSimpleName()) {
            case "ViajeEjecutivo" -> 80.0;
            case "ViajeCompartido" -> 30.0;
            default -> 50.0; // ViajeEconomico u otro
        };
    }

    @Override
    protected double aplicarDescuentos(SolicitudViaje viaje) {
        if (viaje.getMetodoPago().equalsIgnoreCase("tarjeta")) {
            return 5.0;
        }
        return 0;
    }

    @Override
    protected Factura emitirFactura(SolicitudViaje viaje, double base, double impuestos, double descuentos) {
        return new Factura(
            "PasajeroX", // puedes integrar el nombre real más adelante
            viaje.getOrigen(),
            viaje.getDestino(),
            viaje.getMetodoPago(),
            base, impuestos, descuentos
        );
    }
}