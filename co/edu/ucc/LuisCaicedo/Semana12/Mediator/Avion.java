package ucc.LuisCaicedo.Semana12.Mediator;
// Participante concreto: Avión
class Avion extends Participante {
    public Avion(String nombre, TorreControl torre) {
        super(nombre, torre);
    }
 
    public void recibir(String mensaje) {
        System.out.println("Avión " + nombre + " recibe: " + mensaje);
    }
}
 
// Participante concreto: Controlador
class Controlador extends Participante {
    public Controlador(String nombre, TorreControl torre) {
        super(nombre, torre);
    }
 
    public void recibir(String mensaje) {
        System.out.println("Controlador " + nombre + " recibe: " + mensaje);
    }
}
