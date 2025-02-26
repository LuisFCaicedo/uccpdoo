package co.edu.ucc.LuisCaicedo.Semana3.Singleton;

class Database {
    private static Database instance;
    private Database() { System.out.println("Conectando a la base de datos..."); }
    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }
    public void ejecutarConsulta(String consulta) {
        System.out.println("Ejecutando: " + consulta);
    }
}

