package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia2;

public class ViajeEjecutivo extends SolicitudViaje {
    public ViajeEjecutivo(String origen, String destino, String metodoPago) {
        super(origen, destino, metodoPago);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Viaje Ejecutivo de " + origen + " a " + destino + " usando " + metodoPago);
    }
}
