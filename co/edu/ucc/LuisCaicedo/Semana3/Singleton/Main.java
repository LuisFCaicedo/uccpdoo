package co.edu.ucc.LuisCaicedo.Semana3.Singleton;

public class Main {
    public static void main(String[] args) {
        Database db1 = Database.getInstance();
        db1.ejecutarConsulta("SELECT * FROM pedidos");
    }
}
