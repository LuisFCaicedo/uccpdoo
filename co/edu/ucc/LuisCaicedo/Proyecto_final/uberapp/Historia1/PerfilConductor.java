package ucc.LuisCaicedo.Proyecto_final.uberapp.Historia1;

public class PerfilConductor implements Cloneable {
    private final String nombre;
    private final String documentoIdentidad;
    private final String tipoLicencia;
    private final String seguroVehiculo;
    private final String antecedentes;

    // Constructor privado: solo accesible mediante el Builder
    private PerfilConductor(Builder builder) {
        this.nombre = builder.nombre;
        this.documentoIdentidad = builder.documentoIdentidad;
        this.tipoLicencia = builder.tipoLicencia;
        this.seguroVehiculo = builder.seguroVehiculo;
        this.antecedentes = builder.antecedentes;
    }

    // Builder interno (puede ser público o estático externo también)
    public static class Builder {
        private final String nombre;
        private final String documentoIdentidad;
        private final String tipoLicencia;
        private String seguroVehiculo;
        private String antecedentes;

        public Builder(String nombre, String documentoIdentidad, String tipoLicencia) {
            this.nombre = nombre;
            this.documentoIdentidad = documentoIdentidad;
            this.tipoLicencia = tipoLicencia;
        }

        public Builder conSeguroVehiculo(String seguroVehiculo) {
            this.seguroVehiculo = seguroVehiculo;
            return this;
        }

        public Builder conAntecedentes(String antecedentes) {
            this.antecedentes = antecedentes;
            return this;
        }

        public PerfilConductor construir() {
            return new PerfilConductor(this);
        }
    }

    // Implementación del patrón Prototype
    @Override
    public PerfilConductor clone() {
        try {
            return (PerfilConductor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("No se pudo clonar el perfil", e);
        }
    }
    public String getNombre() {
        return nombre;
    }
    
    public String getTipoLicencia() {
        return tipoLicencia;
    }
    
    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }
    
    public boolean tieneSeguro() {
        return seguroVehiculo != null && !seguroVehiculo.isEmpty();
    }
    
    public String getAntecedentes() {
        return antecedentes;
    }
    
    // Método para imprimir los datos del conductor
    public void mostrarPerfil() {
        System.out.println("Perfil del Conductor:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Documento: " + documentoIdentidad);
        System.out.println("Tipo de Licencia: " + tipoLicencia);
        System.out.println("Seguro del Vehículo: " + (seguroVehiculo != null ? seguroVehiculo : "N/A"));
        System.out.println("Antecedentes: " + (antecedentes != null ? antecedentes : "N/A"));
        System.out.println("-------------------------------");
    }
}


