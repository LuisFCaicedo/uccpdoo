package ucc.LuisCaicedo.Sector_Manufactura_Acero;

public class Main {
    public static void main(String[] args) {

        imprimirEncabezado();

        Identidad identidad = new Identidad("Luis Caicedo");

        Turno turno = new Turno();
        Maquina maquina1 = new Maquina("Máquina 1");
        Maquina maquina2 = new Maquina("Máquina 2");

        maquina1.producirAcero(5.3);
        maquina2.producirAcero(7.8);

        turno.agregarMaquina(maquina1);
        turno.agregarMaquina(maquina2);

        turno.mostrarProduccion();
        turno.getPatron();

        System.out.println("La indentidad del estudiante en Base64 es: " + identidad.getNombreCodificado());

    }
    public static void imprimirEncabezado() {
        System.out.println("=============================================");
        System.out.println(" 👷         BIENVENIDO A LA UCC      👷     ");
        System.out.println("           Maquina - Factory Method           ");
        System.out.println("=============================================");
        System.out.println("Ejecutado por: Luis Fernando Caicedo Solis"   );
        System.out.println("Patrones de Diseño Orientado a Odjeto        ");
        System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
        System.out.println("=============================================");
        System.out.println();
    }
}
