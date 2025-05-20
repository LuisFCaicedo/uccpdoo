package ucc.LuisCaicedo.Proyecto_final.uberapp.comun;

import java.util.ArrayList;
import java.util.List;
import ucc.LuisCaicedo.Proyecto_final.uberapp.Historia3.Conductor;

public class BaseDatosConductores {
    private static final List<Conductor> conductores = new ArrayList<>();

    public static void agregarConductor(Conductor conductor) {
        conductores.add(conductor);
    }

    public static List<Conductor> obtenerConductores() {
        return new ArrayList<>(conductores); // copia para evitar modificaciones externas
    }
}