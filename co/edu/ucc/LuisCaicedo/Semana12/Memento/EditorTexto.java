package ucc.LuisCaicedo.Semana12.Memento;

// Originador
class EditorTexto {
    private String contenido = "";
 
    public void escribir(String texto) {
        contenido += texto;
    }
 
    public String getContenido() {
        return contenido;
    }
 
    public Memento guardar() {
        return new Memento(contenido);
    }
 
    public void restaurar(Memento memento) {
        this.contenido = memento.getEstado();
    }
 
    // Memento interno
    public static class Memento {
        private final String estado;
 
        private Memento(String estado) {
            this.estado = estado;
        }
 
        private String getEstado() {
            return estado;
        }
    }
}

