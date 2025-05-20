package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia7;

public class VehiculoElemento implements ElementoCalificable {
    private String placa;

    public VehiculoElemento(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public void aceptar(VisitanteCalificacion visitante) {
        visitante.visitar(this);
    }
}