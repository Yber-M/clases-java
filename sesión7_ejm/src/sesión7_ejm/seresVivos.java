package sesión7_ejm;

public class seresVivos {
    String tipo;
    int edad;

        public seresVivos (String tipo, int edad) {
            this.tipo = tipo;
            this.edad = edad;
        }
        
        public seresVivos (int edad, int a) {
            this.tipo = tipo;
        }
    
    
    public void comer () {
        System.out.println("Come según el tipo");
    }
}
