package ucc.LuisCaicedo.Semana5.Builder;

class Usuario {
    private String nombre;
    private int edad;
    private String direccion;
    private String telefono;
    
    private Usuario(UsuarioBuilder builder) {
        this.nombre = builder.nombre;
        this.edad = builder.edad;
        this.direccion = builder.direccion;
        this.telefono = builder.telefono;
    }
    
    public static class UsuarioBuilder {
        private String nombre;
        private int edad;
        private String direccion;
        private String telefono;
        
        public UsuarioBuilder(String nombre) {
            this.nombre = nombre;
        }
        
        public UsuarioBuilder setEdad(int edad) {
            this.edad = edad;
            return this;
        }
        
        public UsuarioBuilder setDireccion(String direccion) {
            this.direccion = direccion;
            return this;
        }
        
        public UsuarioBuilder setTelefono(String telefono) {
            this.telefono = telefono;
            return this;
        }
        
        public Usuario build() {
            return new Usuario(this);
        }
    }
    
    public String toString() {
        return "Usuario: " + nombre + ", Edad: " + edad + ", Dirección: " + direccion + ", Teléfono: " + telefono;
    }
    public void getPatron() {
        System.out.println("El patrón de diseño utilizado es: Abstract Factory");
    }
}

