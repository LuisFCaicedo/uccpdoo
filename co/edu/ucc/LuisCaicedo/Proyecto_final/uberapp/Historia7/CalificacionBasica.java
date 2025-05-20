package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia7;

public class CalificacionBasica implements Calificacion {
    private int puntaje;
    private String comentario;

    public CalificacionBasica(int puntaje, String comentario) {
        this.puntaje = puntaje;
        this.comentario = comentario;
    }

    @Override
    public void mostrar() {
        System.out.println("⭐ Puntaje: " + puntaje + " | Comentario: " + comentario);
    }
}