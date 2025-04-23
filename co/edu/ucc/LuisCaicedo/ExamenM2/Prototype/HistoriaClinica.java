package ucc.LuisCaicedo.ExamenM2.Prototype;

class HistoriaClinica implements Cloneable {
    String nombre;
    String nota;

    public HistoriaClinica(String nombre, String nota) {
        this.nombre = nombre;
        this.nota = nota;
    }
    public HistoriaClinica clonar() {
        try {
            return (HistoriaClinica) this.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
    public void mostrar() {
        System.out.println("Paciente: " + nombre + " | Nota: " + nota);
    }
}
