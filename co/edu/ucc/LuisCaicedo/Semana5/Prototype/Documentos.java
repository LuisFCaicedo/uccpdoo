package ucc.LuisCaicedo.Semana5.Prototype;

 class Documento implements Cloneable {
         private String contenido;
      
         public Documento(String contenido) {
             this.contenido = contenido;
         }
      
         public void mostrar() {
             System.out.println("Contenido del documento: " + contenido);
        }
     
        @Override
        protected Documento clone() throws CloneNotSupportedException {
            return (Documento) super.clone();
        }
        public void getPatron() {
            System.out.println("El patrón de diseño utilizado es: Prototype");
        }
    }
   
