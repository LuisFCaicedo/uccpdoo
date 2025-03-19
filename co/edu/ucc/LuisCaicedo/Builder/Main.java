package ucc.LuisCaicedo.Builder;

public class Main {
    public static void main(String[] args) {
        imprimirEncabezado();

        Identidad identidad = new Identidad("Luis Caicedo"); 

        Medico medico = new Medico();
        PacienteBuilder pacienteGripeBuilder = new PacienteGripeBuilder();

        medico.setPacienteBuilder(pacienteGripeBuilder);
        medico.construirPaciente();

        Paciente paciente = medico.getPaciente();
        paciente.mostrarInfo();

        // Imprimir identidad codificada solo al final
        System.out.println("La indentidad del estudiante en Base64 es: " + identidad.getNombreCodificado());
    }
    public static void imprimirEncabezado() {
        System.out.println("=============================================");
        System.out.println(" 👷         BIENVENIDO A LA UCC      👷     ");
        System.out.println("             Paciente - Builder              ");
        System.out.println("=============================================");
        System.out.println("Ejecutado por: Luis Fernando Caicedo Solis"   );
        System.out.println("Patrones de Diseño Orientado a Odjeto        ");
        System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
        System.out.println("=============================================");
        System.out.println();
    }
}
