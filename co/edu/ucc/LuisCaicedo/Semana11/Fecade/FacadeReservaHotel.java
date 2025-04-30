package ucc.LuisCaicedo.Semana11.Fecade;

public class FacadeReservaHotel {
    private ISistemaReservas reservas;
    private ISistemaPagos pagos;
    private ISistemaFacturacion facturacion;
 
    public FacadeReservaHotel() {
        this.reservas = new SistemaReservas();
        this.pagos = new SistemaPagos();
        this.facturacion = new SistemaFacturacion();
    }
 
    public void reservar() {
        reservas.verificarDisponibilidad();
        pagos.procesarPago();
        facturacion.generarFactura();
        System.out.println("Reserva completada.");
    }
    public static String getPatron() {
        return "Patrón Fecade";
    }
}
