package ucc.LuisCaicedo.Semana12.Strategy;

public class Main {
    public static void main(String[] args) {

        imprimirEncabezado();
        Identidad identidad = new Identidad("Luis Caicedo");


        CalculadoraImpuesto calculadora = new CalculadoraImpuesto();
 
        calculadora.setEstrategia(new ImpuestoColombia());
        System.out.println("Colombia: " + calculadora.calcularImpuesto(100000));
 
        calculadora.setEstrategia(new ImpuestoArgentina());
        System.out.println("Argentina: " + calculadora.calcularImpuesto(100000));
 
        calculadora.setEstrategia(new ImpuestoEcuador());
        System.out.println("Ecuador: " + calculadora.calcularImpuesto(100000));

        System.out.println("La indentidad del estudiante en Base64 es: " + identidad.getNombreCodificado());
        System.out.println("Este es un ejemplo del: " + CalculadoraImpuesto.getPatron());
    }
    public static void imprimirEncabezado() {
        System.out.println("=============================================");
        System.out.println(" 👷         BIENVENIDO A LA UCC      👷     ");
        System.out.println("               Patron Strategy               ");
        System.out.println("=============================================");
        System.out.println("Ejecutado por: Luis Fernando Caicedo Solis"   );
        System.out.println("Patrones de Diseño Orientado a Odjeto        ");
        System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
        System.out.println("=============================================");
        System.out.println();
    }
}
