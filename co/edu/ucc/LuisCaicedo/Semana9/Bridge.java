package ucc.LuisCaicedo.Semana9;

// Interfaz base para la visualización en diferentes dispositivos
interface InterfazRastreo {
    void mostrarUbicacion(String ubicacion);
}

// Implementaciones de la interfaz para escritorio y móvil

class PanelEscritorio implements InterfazRastreo {
    public void mostrarUbicacion(String ubicacion) {
        System.out.println("Interfaz Escritorio: Mostrando ubicación - " + ubicacion);
    }
}

class PanelMovil implements InterfazRastreo {
    public void mostrarUbicacion(String ubicacion) {
        System.out.println("Interfaz Móvil: Mostrando ubicación - " + ubicacion);
    }
}

// Clase abstracta para rastrear vehículos
abstract class RastreadorVehicular {
    protected InterfazRastreo panel;

    public RastreadorVehicular(InterfazRastreo panel) {
        this.panel = panel;
    }

    abstract void actualizarUbicacion(DispositivoGPS gps);
}

// Implementación concreta del sistema de rastreo
class SistemaRastreo extends RastreadorVehicular {

    public SistemaRastreo(InterfazRastreo panel) {
        super(panel);
    }

    public void actualizarUbicacion(DispositivoGPS gps) {
        String ubicacion = gps.obtenerUbicacion();
        panel.mostrarUbicacion(ubicacion);
    }
    public static String getPatron() {
        return "Patrón Bridge";
    }
}
