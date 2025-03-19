package ucc.LuisCaicedo.semana7.GestionTransporte;

import java.util.Queue;
import java.util.LinkedList;
 
class VehiculoTuristico {
    private String id;
    
    public VehiculoTuristico(String id) {
        this.id = id;
        System.out.println("Nuevo vehículo disponible: " + id);
    }
    
    public void asignarRecorrido(String recorrido) {
        System.out.println("Vehículo " + id + " asignado a " + recorrido);
    }
}
 
class PoolVehiculos {
    private Queue<VehiculoTuristico> pool;
    @SuppressWarnings("unused")
    private int limite;
 
    public PoolVehiculos(int limite) {
        this.limite = limite;
        this.pool = new LinkedList<>();
        for (int i = 0; i < limite; i++) {
            pool.add(new VehiculoTuristico("Vehiculo-" + (i + 1)));
        }
    }
    
    public VehiculoTuristico obtenerVehiculo() {
        if (!pool.isEmpty()) {
            return pool.poll();
        } else {
            System.out.println("No hay vehículos disponibles, espere...");
            return null;
        }
    }
    
    public void liberarVehiculo(VehiculoTuristico vehiculo) {
        pool.offer(vehiculo);
    }
}
 
public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        imprimirEncabezado();
        Identidad identidad = new Identidad("Luis Caicedo");

        PoolVehiculos pool = new PoolVehiculos(2);
        
        VehiculoTuristico v1 = pool.obtenerVehiculo();
        VehiculoTuristico v2 = pool.obtenerVehiculo();
        VehiculoTuristico v3 = pool.obtenerVehiculo(); // No hay vehículos disponibles
        
        v1.asignarRecorrido("Tour por la ciudad");
        pool.liberarVehiculo(v1);
        
        VehiculoTuristico v4 = pool.obtenerVehiculo(); // Ahora hay uno disponible
        v4.asignarRecorrido("Visita a las montañas");
        
        // Imprimir identidad codificada solo al final
        System.out.println("La indentidad del estudiante en Base64 es: " + identidad.getNombreCodificado());
    }
    public static void imprimirEncabezado() {
        System.out.println("=============================================");
        System.out.println(" 👷         BIENVENIDO A LA UCC      👷     ");
        System.out.println("           Grafica - Object Pool             ");
        System.out.println("=============================================");
        System.out.println("Ejecutado por: Luis Fernando Caicedo Solis"   );
        System.out.println("Patrones de Diseño Orientado a Odjeto        ");
        System.out.println("Fecha de Creación: " + java.time.LocalDate.now());
        System.out.println("=============================================");
        System.out.println();
    }
}

