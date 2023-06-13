package sesión7_ejm;

public class carnivoro extends seresVivos{

    public carnivoro(String tipo, int edad) {
        super(tipo, edad);
    }

    public carnivoro(int edad, int a) {
        super(edad, a);
    }
    
    
    @Override
    public void comer () {
        System.out.println("Come Carne");
    }
    
}
