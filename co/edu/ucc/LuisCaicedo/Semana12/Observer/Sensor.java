package ucc.LuisCaicedo.Semana12.Observer;

import java.util.List;
import java.util.ArrayList;
// Interfaz del observador
interface Observador {
    void actualizar(double temperatura);
}
 
// Sujeto (Sensor)
class Sensor {
    private List<Observador> observadores = new ArrayList<>();
    private double temperatura;
 
    public void agregarObservador(Observador o) {
        observadores.add(o);
    }
 
    public void removerObservador(Observador o) {
        observadores.remove(o);
    }
 
    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
        notificarObservadores();
    }
 
    private void notificarObservadores() {
        for (Observador o : observadores) {
            o.actualizar(temperatura);
        }
    }public static String getPatron() {
        return "Patrón Observer";
    }
}


