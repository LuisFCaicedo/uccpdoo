package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia6;

import ucc.LuisCaicedo.Proyecto_final.uberapp.Historia2.SolicitudViaje;

public abstract class GeneradorFactura {

    public final Factura generarFactura(SolicitudViaje viaje) {
        double base = calcularTarifa(viaje);
        double impuestos = aplicarImpuestos(base);
        double descuentos = aplicarDescuentos(viaje);
        return emitirFactura(viaje, base, impuestos, descuentos);
    }

    protected abstract double calcularTarifa(SolicitudViaje viaje);

    protected double aplicarImpuestos(double base) {
        return base * 0.12; // 12% por defecto
    }

    protected double aplicarDescuentos(SolicitudViaje viaje) {
        return 0; // por defecto, sin descuento
    }

    protected abstract Factura emitirFactura(SolicitudViaje viaje, double base, double impuestos, double descuentos);
}