package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia7;

public abstract class CalificacionDecorator implements Calificacion {
    protected Calificacion decorada;

    public CalificacionDecorator(Calificacion decorada) {
        this.decorada = decorada;
    }
}