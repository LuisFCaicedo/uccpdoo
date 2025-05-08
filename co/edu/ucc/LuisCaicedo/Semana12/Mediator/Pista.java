package ucc.LuisCaicedo.Semana12.Mediator;

// Participante concreto: Pista
class Pista extends Participante {
    public Pista(String nombre, TorreControl torre) {
        super(nombre, torre);
    }
 
    public void recibir(String mensaje) {
        System.out.println("Pista " + nombre + " recibe: " + mensaje);
    }
    public static String getPatron() {
        return "Patrón Madiator";
    }
}
