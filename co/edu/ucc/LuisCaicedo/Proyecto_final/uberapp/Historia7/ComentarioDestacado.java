package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia7;

public class ComentarioDestacado extends CalificacionDecorator {
    public ComentarioDestacado(Calificacion decorada) {
        super(decorada);
    }

    @Override
    public void mostrar() {
        decorada.mostrar();
        System.out.println("📌 Comentario destacado");
    }
}