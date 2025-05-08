package ucc.LuisCaicedo.Semana12.Visitor;

// Elemento 2
class Vehiculo implements Activo {
    public void aceptar(ActivoVisitor visitor) {
        visitor.visitar(this);
    }
 
    public double calcularValorFiscal() {
        return 35000;
    }
}
