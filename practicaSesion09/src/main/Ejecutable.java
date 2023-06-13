package main;
//Marlon Yber Quispe Olano
import clasesHerencia.hijoMayor;
import clasesHerencia.hijoMedio;
import clasesHerencia.hijoMenor;
import clasesHerencia.intgrtsHogar;

public class Ejecutable {
    public static void main(String[] args) {
        intgrtsHogar[] arrayFamily = new intgrtsHogar[3];
        hijoMayor hM = new hijoMayor("Gross Flor Americo", 3400);
        hijoMedio hMM = new hijoMedio("Franco Flor Americo", 1000);
        hijoMenor hmm = new hijoMenor("Richar Flor Americo", 100);
        arrayFamily[0] = hM;
        arrayFamily[1] = hMM;
        arrayFamily[2] = hmm;
        //mostrar datos
        for (int i = 0; i<3; i++) {
            System.out.println("Nombres Hijo : " + arrayFamily[i].getName());
            System.out.println("Aporte De Hijo : " + arrayFamily[i].cantAporte());
            System.out.println("\n");
        }
            System.out.println("Nombres Mamá: Delia Flor");
            System.out.println("Nombres Papá: Jaime Americo");
            System.out.println("Dirección: Av. Larco 399");
    }
    
}
//@uthor: {Yb.M};