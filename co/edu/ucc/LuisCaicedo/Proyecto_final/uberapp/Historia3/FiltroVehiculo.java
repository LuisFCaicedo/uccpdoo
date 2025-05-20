package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia3;

import ucc.LuisCaicedo.Proyecto_final.uberapp.Historia3.Conductor;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroVehiculo extends FiltroConductor {
    private String tipoSolicitado;

    public FiltroVehiculo(String tipoSolicitado) {
        this.tipoSolicitado = tipoSolicitado;
    }

    protected List<Conductor> aplicarFiltro(List<Conductor> conductores) {
        return conductores.stream()
                .filter(c -> c.getTipoVehiculo().equalsIgnoreCase(tipoSolicitado))
                .collect(Collectors.toList());
    }
}
