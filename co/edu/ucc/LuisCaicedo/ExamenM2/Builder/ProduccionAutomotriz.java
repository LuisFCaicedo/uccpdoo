package ucc.LuisCaicedo.ExamenM2.Builder;

import java.util.function.Consumer;

public class ProduccionAutomotriz {
    private String tipoMotor;
    private String sistemaAudio;
    private boolean sensoresProximidad;

    private ProduccionAutomotriz() {}

    public static ProduccionAutomotriz construir(Consumer<ProduccionAutomotriz> configuracion) {
        ProduccionAutomotriz ProduccionAutomotriz = new ProduccionAutomotriz();
        configuracion.accept(ProduccionAutomotriz);
        return ProduccionAutomotriz;

    }
    public ProduccionAutomotriz motorElectrico() {
        this.tipoMotor = "Electrico";
        return this;
    }
    public ProduccionAutomotriz motorGasolina() {
        this.tipoMotor = "Gasolina";
        return this;
    }
    public ProduccionAutomotriz audioEstandar() {
        this.sistemaAudio = "Estandar";
        return this;
    }
    public ProduccionAutomotriz audioPremium() {
        this.sistemaAudio = "Premium";
        return this;
    }
    public ProduccionAutomotriz conSensores() {
        this.sensoresProximidad = true;
        return this;
    }
    public void mostrar() {
        System.out.println("Motor: " + tipoMotor);
        System.out.println("Audio: " + sistemaAudio);
        System.out.println("Sensores de Proximidad: " + (sensoresProximidad ? "Si" : "No"));
        System.out.println("----------------------------------------");
    }

}
