package ucc.LuisCaicedo.ExamenM2.Builder;

public class Main {
    public static void main(String[] args) {
        //Modelo Clasico
        ProduccionAutomotriz clasico = ProduccionAutomotriz.construir(a -> a.motorElectrico().audioPremium().conSensores());
        clasico.mostrar();

        // Modelo economico
        ProduccionAutomotriz economico = ProduccionAutomotriz.construir(a -> a.motorGasolina().audioEstandar());
        economico.mostrar();
    }
}
