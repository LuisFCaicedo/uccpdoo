package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia3;

import java.util.Comparator;
import java.util.List;
import ucc.LuisCaicedo.Proyecto_final.uberapp.Historia3.Conductor;

public class AsignacionPorDesempeno implements EstrategiaAsignacion {
    public Conductor asignar(List<Conductor> conductores) {
        return conductores.stream()
                .max(Comparator.comparingInt(Conductor::getViajesRecientes))
                .orElse(null);
    }
}
