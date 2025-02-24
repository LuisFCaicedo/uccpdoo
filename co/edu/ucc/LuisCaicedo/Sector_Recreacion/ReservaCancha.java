package co.edu.ucc.LuisCaicedo.Sector_Recreacion;
import java.util.HashMap;
import java.util.Map;

class CanchaReserva {
    private Map<String, String> reservas = new HashMap<>();

    public boolean reservarCancha(String fecha, String hora, String usuario) {
        String clave = fecha + " " + hora;
        if (reservas.containsKey(clave)) {
            return false; // Ya está reservada
        }
        reservas.put(clave, usuario);
        return true;
    }

    public void mostrarReservas() {
        System.out.println("Reservas registradas:");
        for (Map.Entry<String, String> entry : reservas.entrySet()) {
            System.out.println("Fecha y Hora: " + entry.getKey() + ", Usuario: " + entry.getValue());
        }
    }
}
// Implementación del Singleton
class SingletonCancha {
    private static final CanchaReserva instancia = new CanchaReserva();

    public static CanchaReserva getInstancia() {
        return instancia;
    }
}
