package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia7;

import java.util.Scanner;

public class VisitanteRegistroCalificacion implements VisitanteCalificacion {

    private final Scanner scanner;

    public VisitanteRegistroCalificacion(Scanner scanner) {
        this.scanner = scanner;
    }

    private Calificacion pedirCalificacion(String tipo) {
        System.out.println("\n📌 Calificando " + tipo);
        System.out.print("Puntaje (1-5): ");
        int puntaje = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Comentario: ");
        String comentario = scanner.nextLine();

        Calificacion calificacion = new CalificacionBasica(puntaje, comentario);

        System.out.print("¿Marcar como comentario destacado? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            calificacion = new ComentarioDestacado(calificacion);
        }

        System.out.print("¿Verificar esta calificación? (s/n): ");
        if (scanner.nextLine().equalsIgnoreCase("s")) {
            calificacion = new CalificacionVerificada(calificacion);
        }

        return calificacion;
    }

    @Override
    public void visitar(ConductorElemento conductor) {
        Calificacion c = pedirCalificacion("Conductor " + conductor.getNombre());
        c.mostrar();
    }

    @Override
    public void visitar(PasajeroElemento pasajero) {
        Calificacion c = pedirCalificacion("Pasajero " + pasajero.getNombre());
        c.mostrar();
    }

    @Override
    public void visitar(VehiculoElemento vehiculo) {
        Calificacion c = pedirCalificacion("Vehículo " + vehiculo.getPlaca());
        c.mostrar();
    }
}