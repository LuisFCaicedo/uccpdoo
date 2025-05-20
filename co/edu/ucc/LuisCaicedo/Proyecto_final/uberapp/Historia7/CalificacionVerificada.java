package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia7;

public class CalificacionVerificada extends CalificacionDecorator {
    public CalificacionVerificada(Calificacion decorada) {
        super(decorada);
    }

    @Override
    public void mostrar() {
        decorada.mostrar();
        System.out.println("✅ Calificación verificada");
    }
}