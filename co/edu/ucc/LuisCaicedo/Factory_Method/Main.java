package co.edu.ucc.LuisCaicedo.Factory_Method;

// Uso
public class Main {
        public static void main(String[] args) {
            imprimirEncabezado();

        Identidad identidad = new Identidad("Luis Caicedo");

        Farmacia farmaciaAnalgesico = new FarmaciaAnalgesico();
        farmaciaAnalgesico.recetarMedicamento();

        Farmacia farmaciaAntibiotico = new FarmaciaAntibiotico();
        farmaciaAntibiotico.recetarMedicamento();

        // Imprimir identidad codificada solo al final
        System.out.println("La indentidad del estudiante en Base64 es: " + identidad.getNombreCodificado());
    }
    public static void imprimirEncabezado() {
        System.out.println("=============================================");
        System.out.println(" 👷         BIENVENIDO A LA UCC      👷     ");
        System.out.println("         Farmacia - Factory Method           ");
        System.out.println("=============================================");
        System.out.println("Ejecutado por: Luis Fernando Caicedo Solis"   );
        System.out.println("Patrones de Diseño Orientado a Odjeto        ");
        System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
        System.out.println("=============================================");
        System.out.println();
    }

}
