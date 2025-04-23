package ucc.LuisCaicedo.ExamenM2.Prototype;

public class Main {
    public static void main(String[] args) {
        HistoriaClinica original = new HistoriaClinica("Luis Caicedo", "Consulta 20/04");
        HistoriaClinica copia = original.clonar();
        copia.nota = "Consulta 22/04 con receta";

        original.mostrar();
        copia.mostrar();
    }
}
