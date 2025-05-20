package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia3;

import java.util.Comparator;
import java.util.List;
import ucc.LuisCaicedo.Proyecto_final.uberapp.Historia3.Conductor;

public class AsignacionPorCercania implements EstrategiaAsignacion {
    public Conductor asignar(List<Conductor> conductores) {
        return conductores.stream()
                .min(Comparator.comparingDouble(Conductor::getDistancia))
                .orElse(null);
    }
}

