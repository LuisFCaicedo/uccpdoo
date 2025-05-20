package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia2;

public class FabricaViaje {
    public static SolicitudViaje crearSolicitud(String tipo, String origen, String destino, String metodoPago) {
        return switch (tipo.toLowerCase()) {
            case "economico" -> new ViajeEconomico(origen, destino, metodoPago);
            case "ejecutivo" -> new ViajeEjecutivo(origen, destino, metodoPago);
            case "compartido" -> new ViajeCompartido(origen, destino, metodoPago);
            default -> throw new IllegalArgumentException("Tipo de viaje no válido: " + tipo);
        };
    }
}

