package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia2;

import ucc.LuisCaicedo.Proyecto_final.uberapp.Historia2.FabricaViaje;
import ucc.LuisCaicedo.Proyecto_final.uberapp.Historia2.SolicitudViaje;
import ucc.LuisCaicedo.Proyecto_final.uberapp.comun.BaseDatosViajes;
import ucc.LuisCaicedo.Proyecto_final.uberapp.Historia2.*;
import ucc.LuisCaicedo.Proyecto_final.uberapp.comun.BaseDatosViajes;

import java.util.Scanner;

public class MainHistoria2 {
    
    public static void ejecutar(Scanner scanner) {
    System.out.println("\n=== Historia 2: Solicitud de Viaje ===");

    System.out.print("Origen: ");
    String origen = scanner.nextLine();

    System.out.print("Destino: ");
    String destino = scanner.nextLine();

    System.out.print("Tipo de vehículo (economico, ejecutivo, compartido): ");
    String tipo = scanner.nextLine();

    System.out.print("Método de pago (efectivo, tarjeta, transferencia): ");
    String metodoPago = scanner.nextLine();

    SolicitudViaje solicitud = FabricaViaje.crearSolicitud(tipo, origen, destino, metodoPago);
    BaseDatosViajes.guardarViaje(solicitud);

    System.out.print("¿Desea ejecutar (e) o cancelar (c) la solicitud?: ");
    String opcion = scanner.nextLine();

    InvocadorSolicitud invocador = new InvocadorSolicitud();

    if (opcion.equalsIgnoreCase("e")) {
        invocador.setComando(new EjecutarSolicitud(solicitud));
    } else {
        invocador.setComando(new CancelarSolicitud());
    }

    invocador.procesar();
}

}