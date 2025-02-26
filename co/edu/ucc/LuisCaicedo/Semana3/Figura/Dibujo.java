package co.edu.ucc.LuisCaicedo.Semana3.Figura;

interface Figura {
    void dibujar();
}
 
class Circulo implements Figura {
    public void dibujar() {
        System.out.println("Dibujando un círculo");
    }
}
 
class Cuadrado implements Figura {
    public void dibujar() {
        System.out.println("Dibujando un cuadrado");
    }
}

 
class FiguraFactory {
    public static Figura crearFigura(String tipo) {
        if (tipo.equalsIgnoreCase("circulo")) return new Circulo();
        else if (tipo.equalsIgnoreCase("cuadrado")) return new Cuadrado();
        return null;
    }
    public void getPatron() {
        System.out.println("El patrón de diseño utilizado es: Factory Method");
    }
}