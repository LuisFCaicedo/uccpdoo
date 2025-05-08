package ucc.LuisCaicedo.Semana12.Mediator;

// Interfaz del Mediador
interface TorreControl {
    void enviarMensaje(String mensaje, Participante emisor);
    void registrarParticipante(Participante p);
}
 
// Participantes abstractos
abstract class Participante {
    protected TorreControl torre;
    protected String nombre;
 
    public Participante(String nombre, TorreControl torre) {
        this.nombre = nombre;
        this.torre = torre;
        torre.registrarParticipante(this);
    }
 
    public abstract void recibir(String mensaje);
    public void enviar(String mensaje) {
        torre.enviarMensaje(mensaje, this);
    }
 
    public String getNombre() {
        return nombre;
    }
}
