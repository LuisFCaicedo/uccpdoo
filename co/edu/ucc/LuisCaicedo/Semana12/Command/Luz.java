package ucc.LuisCaicedo.Semana12.Command;

// Interfaz comando
interface Comando {
    void ejecutar();
}
 
// Receptor 1: Luz
class Luz {
    public void encender() {
        System.out.println("Luz encendida.");
    }
}
 
// Receptor 2: Cortina
class Cortina {
    public void subir() {
        System.out.println("Cortina subida.");
    }
    public static String getPatron() {
        return "Patrón Command";
    }
}

