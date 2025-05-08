package ucc.LuisCaicedo.Semana12.Memento;

import java.util.Stack;

// Caretaker
class Historial {
    private Stack<EditorTexto.Memento> pila = new Stack<>();
 
    public void guardar(EditorTexto.Memento m) {
        pila.push(m);
    }
 
    public EditorTexto.Memento deshacer() {
        if (!pila.isEmpty()) {
            return pila.pop();
        }
        return null;
    }
    public static String getPatron() {
        return "Patrón Memento";
    }
}
