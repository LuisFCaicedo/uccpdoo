package ucc.LuisCaicedo.Semana12.Chain_of_Responsibility;

public class Main {
    public static void main(String[] args) {

        imprimirEncabezado();
        Identidad identidad = new Identidad("Luis Caicedo");

        Aprobador supervisor = new Supervisor();
        Aprobador jefe = new JefeDepartamento();
        Aprobador director = new DirectorFinanciero();
 
        supervisor.setSiguiente(jefe);
        jefe.setSiguiente(director);
 
        supervisor.procesarSolicitud(300);   // Supervisor
        supervisor.procesarSolicitud(3000);  // Jefe de Departamento
        supervisor.procesarSolicitud(15000); // Director Financiero

        System.out.println("La indentidad del estudiante en Base64 es: " + identidad.getNombreCodificado());
        System.out.println("Este es un ejemplo del: " + Supervisor.getPatron());
    }
    public static void imprimirEncabezado() {
        System.out.println("=============================================");
        System.out.println(" 👷         BIENVENIDO A LA UCC      👷     ");
        System.out.println("        Patron Chain of Responsibility       ");
        System.out.println("=============================================");
        System.out.println("Ejecutado por: Luis Fernando Caicedo Solis"   );
        System.out.println("Patrones de Diseño Orientado a Odjeto        ");
        System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
        System.out.println("=============================================");
        System.out.println();
    }
}



