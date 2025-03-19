package ucc.LuisCaicedo.Sector_Recreacion;
import java.util.HashMap;
import java.util.Map;

class CanchaReserva {
    private static final CanchaReserva instancia = new CanchaReserva(); // Única instancia
    private Map<String, String> reservas = new HashMap<>();

    // Constructor privado para evitar que se creen nuevas instancias
    private CanchaReserva() {}

    public static CanchaReserva getInstancia() {
        return instancia; // Siempre retorna la misma instancia
    }

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
    public String getPatron() {
        return "Singleton";
    }
}
