package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia7;

public class ConductorElemento implements ElementoCalificable {
    private String nombre;

    public ConductorElemento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void aceptar(VisitanteCalificacion visitante) {
        visitante.visitar(this);
    }
}

