package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia3;

import java.util.List;
import ucc.LuisCaicedo.Proyecto_final.uberapp.Historia3.Conductor;

public abstract class FiltroConductor {
    protected FiltroConductor siguiente;

    public void setSiguiente(FiltroConductor siguiente) {
        this.siguiente = siguiente;
    }

    public List<Conductor> filtrar(List<Conductor> conductores) {
        List<Conductor> filtrados = aplicarFiltro(conductores);
        return (siguiente != null) ? siguiente.filtrar(filtrados) : filtrados;
    }

    protected abstract List<Conductor> aplicarFiltro(List<Conductor> conductores);
}

