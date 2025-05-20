package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia6;

public class Factura {
    private String pasajero;
    private String origen;
    private String destino;
    private String metodoPago;
    private double tarifaBase;
    private double impuestos;
    private double descuentos;
    private double total;

    public Factura(String pasajero, String origen, String destino, String metodoPago,
                   double tarifaBase, double impuestos, double descuentos) {
        this.pasajero = pasajero;
        this.origen = origen;
        this.destino = destino;
        this.metodoPago = metodoPago;
        this.tarifaBase = tarifaBase;
        this.impuestos = impuestos;
        this.descuentos = descuentos;
        this.total = tarifaBase + impuestos - descuentos;
    }

    public void mostrarFactura() {
        System.out.println("\n🧾 FACTURA DEL VIAJE");
        System.out.println("Pasajero: " + pasajero);
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("Método de pago: " + metodoPago);
        System.out.println("Tarifa base: $" + tarifaBase);
        System.out.println("Impuestos: $" + impuestos);
        System.out.println("Descuentos: -$" + descuentos);
        System.out.println("Total a pagar: $" + total);
    }
}