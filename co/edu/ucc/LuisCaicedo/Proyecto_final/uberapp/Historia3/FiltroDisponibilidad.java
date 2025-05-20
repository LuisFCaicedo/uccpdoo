package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia3;

import ucc.LuisCaicedo.Proyecto_final.uberapp.Historia3.Conductor;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroDisponibilidad extends FiltroConductor {
    protected List<Conductor> aplicarFiltro(List<Conductor> conductores) {
        return conductores.stream()
                .filter(Conductor::isDisponible)
                .collect(Collectors.toList());
    }
}

