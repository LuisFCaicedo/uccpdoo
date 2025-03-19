package ucc.LuisCaicedo.semana7.GestionCamillas;

import java.util.Queue;
import java.util.LinkedList;
 
class Camilla {
    private String id;
    
    public Camilla(String id) {
        this.id = id;
        System.out.println("Nueva camilla disponible: " + id);
    }
    
    public void asignarPaciente(String paciente) {
        System.out.println("Camilla " + id + " asignada a paciente " + paciente);
    }
}
 
class PoolCamillas {
    private Queue<Camilla> pool;
    @SuppressWarnings("unused")
    private int limite;
 
    public PoolCamillas(int limite) {
        this.limite = limite;
        this.pool = new LinkedList<>();
        for (int i = 0; i < limite; i++) {
            pool.add(new Camilla("Camilla-" + (i + 1)));
        }
    }
    
    public Camilla obtenerCamilla() {
        if (!pool.isEmpty()) {
            return pool.poll();
        } else {
            System.out.println("No hay camillas disponibles, espere...");
            return null;
        }
    }
    
    public void liberarCamilla(Camilla camilla) {
        pool.offer(camilla);
    }
}
 
public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {

        imprimirEncabezado();
        Identidad identidad = new Identidad("Luis Caicedo");

        PoolCamillas pool = new PoolCamillas(3);
        
        Camilla c1 = pool.obtenerCamilla();
        Camilla c2 = pool.obtenerCamilla();
        
        c1.asignarPaciente("María");
        pool.liberarCamilla(c1);
        
        Camilla c3 = pool.obtenerCamilla();
        c3.asignarPaciente("Pedro");

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
