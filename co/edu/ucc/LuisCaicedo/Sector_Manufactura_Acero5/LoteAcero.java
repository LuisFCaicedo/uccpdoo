package co.edu.ucc.LuisCaicedo.Sector_Manufactura_Acero5;

class LoteAcero {
    private double cantidad; // en toneladas
    private double costoPorTonelada;

    public LoteAcero(double cantidad, double costoPorTonelada) {
        this.cantidad = cantidad;
        this.costoPorTonelada = costoPorTonelada;
    }

    public double calcularCostoTotal() {
        return cantidad * costoPorTonelada;
    }
    public void getPatron() {
        System.out.println("El patrón de diseño utilizado es: Factory Method");
    }
}

