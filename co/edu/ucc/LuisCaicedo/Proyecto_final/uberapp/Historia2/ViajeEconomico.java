package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia2;

public class ViajeEconomico extends SolicitudViaje {
    public ViajeEconomico(String origen, String destino, String metodoPago) {
        super(origen, destino, metodoPago);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Viaje Económico de " + origen + " a " + destino + " usando " + metodoPago);
    }
}

