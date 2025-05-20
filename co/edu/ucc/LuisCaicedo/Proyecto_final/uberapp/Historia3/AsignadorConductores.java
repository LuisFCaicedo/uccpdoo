package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia3;

import java.util.List;

public class AsignadorConductores {
    private EstrategiaAsignacion estrategia;

    public AsignadorConductores(EstrategiaAsignacion estrategia) {
        this.estrategia = estrategia;
    }

    public Conductor asignarConductor(List<Conductor> conductores, String tipoVehiculo) {
        // Cadena de filtros
        FiltroConductor f1 = new FiltroDisponibilidad();
        FiltroConductor f2 = new FiltroVehiculo(tipoVehiculo);
        FiltroConductor f3 = new FiltroSeguro();
        FiltroConductor f4 = new FiltroReputacion();

        f1.setSiguiente(f2);
        f2.setSiguiente(f3);
        f3.setSiguiente(f4);

        List<Conductor> filtrados = f1.filtrar(conductores);
        return estrategia.asignar(filtrados);
    }
}

