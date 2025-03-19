package ucc.LuisCaicedo.Examen.Boleto;

public class Main {
    public static void main(String[] args) {

        imprimirEncabezado();

        Identidad identidad = new Identidad("Luis Caicedo");

        Boleto boleto = new Boleto.BoletoBuilder("Primera Clase")
                .agregarEquipajeExtra()
                .seleccionarAsiento()
                .agregarComidaEspecial()
                .build();

        boleto.mostrarDetalles();

        boleto.getPatron(); 


        System.out.println("La indentidad del estudiante en Base64 es: " + identidad.getNombreCodificado());
    }

    public static void imprimirEncabezado() {
        System.out.println("=============================================");
        System.out.println(" 👷         BIENVENIDO A LA UCC      👷     ");
        System.out.println("             Prestamos - Builder             ");
        System.out.println("=============================================");
        System.out.println("Ejecutado por: Luis Fernando Caicedo Solis"   );
        System.out.println("Patrones de Diseño Orientado a Odjeto        ");
        System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
        System.out.println("=============================================");
        System.out.println();
    }
}
