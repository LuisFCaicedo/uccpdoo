package ucc.LuisCaicedo.Sector_Manufactura_Acero;

import java.util.ArrayList;
import java.util.List;

class Maquina {
    private String nombre;
    private double aceroProducido;

    public Maquina(String nombre) {
        this.nombre = nombre;
        this.aceroProducido = 0;
    }

    public void producirAcero(double cantidad) {
        this.aceroProducido += cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getAceroProducido() {
        return aceroProducido;
    }
}

class Turno {
    private List<Maquina> maquinas = new ArrayList<>();

    public void agregarMaquina(Maquina maquina) {
        maquinas.add(maquina);
    }

    public void mostrarProduccion() {
        for (Maquina maquina : maquinas) {
            System.out.println("Máquina: " + maquina.getNombre() + ", Acero Producido: " + maquina.getAceroProducido() + " toneladas");
        }
    }
    public void getPatron() {
        System.out.println("El patrón de diseño utilizado es: Factory Method");
    }
}

