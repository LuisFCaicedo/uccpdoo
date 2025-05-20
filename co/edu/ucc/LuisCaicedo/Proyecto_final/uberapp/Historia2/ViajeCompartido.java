package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia2;

public class ViajeCompartido extends SolicitudViaje {
    public ViajeCompartido(String origen, String destino, String metodoPago) {
        super(origen, destino, metodoPago);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Viaje Compartido de " + origen + " a " + destino + " usando " + metodoPago);
    }
}
