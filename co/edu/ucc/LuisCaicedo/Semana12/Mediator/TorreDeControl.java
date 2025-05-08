package ucc.LuisCaicedo.Semana12.Mediator;
import java.util.List;
import java.util.ArrayList;

// Mediador concreto
class TorreDeControl implements TorreControl {
    private List<Participante> participantes = new ArrayList<>();
 
    public void registrarParticipante(Participante p) {
        participantes.add(p);
    }
 
    public void enviarMensaje(String mensaje, Participante emisor) {
        for (Participante p : participantes) {
            if (p != emisor) {
                p.recibir(mensaje + " (de " + emisor.getNombre() + ")");
            }
        }
    }
}
