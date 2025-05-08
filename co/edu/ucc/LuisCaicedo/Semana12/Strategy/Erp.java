package ucc.LuisCaicedo.Semana12.Strategy;

// Estrategia
interface EstrategiaImpuesto {
    double calcular(double monto);
}
 
// Implementación para Colombia
class ImpuestoColombia implements EstrategiaImpuesto {
    public double calcular(double monto) {
        return monto * 0.19;
    }
}
 
// Implementación para Argentina
class ImpuestoArgentina implements EstrategiaImpuesto {
    public double calcular(double monto) {
        return monto * 0.21;
    }
}
 
// Implementación para Ecuador
class ImpuestoEcuador implements EstrategiaImpuesto {
    public double calcular(double monto) {
        return 0.0;
    }
}
 
// Contexto
class CalculadoraImpuesto {
    private EstrategiaImpuesto estrategia;
 
    public void setEstrategia(EstrategiaImpuesto estrategia) {
        this.estrategia = estrategia;
    }
 
    public double calcularImpuesto(double monto) {
        return estrategia.calcular(monto);
    }
    public static String getPatron() {
        return "Patrón Proxy";
    }
}
