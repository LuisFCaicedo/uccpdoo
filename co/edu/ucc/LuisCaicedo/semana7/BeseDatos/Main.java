package ucc.LuisCaicedo.semana7.BeseDatos;

import java.util.Queue;
import java.util.LinkedList;
 
// Clase que representa una conexión a la base de datos
class ConexionDB {
    private String id;
    
    public ConexionDB(String id) {
        this.id = id;
        System.out.println("Nueva conexión creada: " + id);
    }
    
    public void ejecutarConsulta(String consulta) {
        System.out.println("Ejecutando consulta en " + id + ": " + consulta);
    }
}
 
// Implementación del Object Pool
class PoolConexiones {
    private Queue<ConexionDB> pool;
    @SuppressWarnings("unused")
    private int limite;
 
    public PoolConexiones(int limite) {
        this.limite = limite;
        this.pool = new LinkedList<>();
        for (int i = 0; i < limite; i++) {
            pool.add(new ConexionDB("Conexion-" + (i + 1)));
        }
    }
    
    public ConexionDB obtenerConexion() {
        if (!pool.isEmpty()) {
            return pool.poll();
        } else {
            System.out.println("No hay conexiones disponibles, espere...");
            return null;
        }
    }
    
    public void liberarConexion(ConexionDB conexion) {
        pool.offer(conexion);
    }
}
 
public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args) {


        imprimirEncabezado();
        Identidad identidad = new Identidad("Luis Caicedo");
        PoolConexiones pool = new PoolConexiones(2);
        
        ConexionDB c1 = pool.obtenerConexion();
        ConexionDB c2 = pool.obtenerConexion();
        ConexionDB c3 = pool.obtenerConexion(); // No hay conexiones disponibles
        
        c1.ejecutarConsulta("SELECT * FROM usuarios");
        pool.liberarConexion(c1);
        
        ConexionDB c4 = pool.obtenerConexion(); // Ahora sí hay conexión disponible
        c4.ejecutarConsulta("INSERT INTO transacciones VALUES (1, 100)");

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

