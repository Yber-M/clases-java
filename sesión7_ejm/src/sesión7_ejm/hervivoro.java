package sesión7_ejm;

public class hervivoro extends seresVivos {
    public hervivoro (String tipo, int edad) {
        super(tipo, edad);
    }
    
    public hervivoro (int edad, int a) {
        super(edad, a);
    }
    
    
    public void comer () {
        System.out.println("Come Hiervas");
    }
    
}
