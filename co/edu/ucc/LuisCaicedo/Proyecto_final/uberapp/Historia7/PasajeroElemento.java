package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia7;

public class PasajeroElemento implements ElementoCalificable {
    private String nombre;

    public PasajeroElemento(String nombre) {
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