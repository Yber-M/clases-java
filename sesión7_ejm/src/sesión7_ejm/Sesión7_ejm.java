package sesión7_ejm;

public class Sesión7_ejm {

    public static void main(String[] args) {
//        seresVivos a = new seresVivos("Carnivoro", 12);  
        carnivoro b = new carnivoro("Carnivoro", 13);
        hervivoro a = new hervivoro("Herbivoro", 5); 
        a.comer();
        b.comer();
        
    }

}
