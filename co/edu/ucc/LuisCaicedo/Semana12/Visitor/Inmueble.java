package ucc.LuisCaicedo.Semana12.Visitor;

// Interfaz del Visitor
interface ActivoVisitor {
    void visitar(Inmueble i);
    void visitar(Vehiculo v);
}
 
// Interfaz del elemento visitable
interface Activo {
    void aceptar(ActivoVisitor visitor);
}
 
// Elemento 1
class Inmueble implements Activo {
    public void aceptar(ActivoVisitor visitor) {
        visitor.visitar(this);
    }
 
    public double calcularValorFiscal() {
        return 100000;
    }
    public static String getPatron() {
        return "Patrón Visitor";
    }
}

