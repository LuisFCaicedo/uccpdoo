package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia_Especial;

import java.util.HashMap;
import java.util.Map;

public class FabricaFlyweight {
    private static final Map<String, String> vehiculos = new HashMap<>();
    private static final Map<String, String> pagos = new HashMap<>();

    public static String getTipoVehiculo(String tipo) {
        return vehiculos.computeIfAbsent(tipo, k -> tipo);
    }

    public static String getMetodoPago(String metodo) {
        return pagos.computeIfAbsent(metodo, k -> metodo);
    }
}

