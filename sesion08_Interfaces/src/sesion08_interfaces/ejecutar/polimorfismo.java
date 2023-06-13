package sesion08_interfaces.ejecutar;

//Marlon Yber Quispe Olano

import sesion08_interfaces.entrenador;
import sesion08_interfaces.futbolista;
import sesion08_interfaces.masajista;
import sesion08_interfaces.seleccionFutbol;

public class polimorfismo {
    
    public static void main(String[] args) {
        
        seleccionFutbol[] arraySeleccFut = new seleccionFutbol[3];
        
        entrenador stheCurry = new entrenador(1, 23999, "Sthepen", "Curry", 30);
        futbolista lioMessi = new futbolista(10, "Delantero", 1230, "Lionel", "Messi", 25);
        masajista deliaFlor = new masajista("Fisioterapeuta", 10, 3499, "Delia", "Flor", 34);
        
        arraySeleccFut[0] = stheCurry;
        arraySeleccFut[1] = lioMessi;
        arraySeleccFut[2] = deliaFlor;
        
        //PLANIFICAR ENTRENAMIENTO
        System.out.println("\n----- Planificación del Entrenamiento -----" + "\nENTRENADOR (ENCARGADO)\n");
        System.out.println("Identificador : " + stheCurry.getId() + "\nEdad : " + stheCurry.getEdad());
        System.out.println("Nombre y Apellido : " + stheCurry.getNombre() + " " + stheCurry.getApellidos());
        ((entrenador)stheCurry).planificarEntrenamiento();
        
        //ENTRENAMIENTO
        System.out.println("\n-------------- Entrenamiento --------------" + "\nCONFORMADO POR TODOS LOS INTEGRANTES\n");
        for (int i = 0; i<3; i++) {
            System.out.println("ID : " + arraySeleccFut[i].getId() + "\nEdad : " + arraySeleccFut[i].getEdad()
            + "\nNombre y Apellidos : " + arraySeleccFut[i].getNombre() + " " + arraySeleccFut[i].getApellidos());
            arraySeleccFut[i].entrenamiento();
            System.out.println("\n");
        }
        
        //VIAJE
        System.out.println("------------------ VIAJAN -----------------" + "\nCONFORMADO POR TODOS LOS INTEGRANTES\n");
        for (int i = 0; i<3; i++) {
            System.out.println("Nombre y Apellidos : " + arraySeleccFut[i].getNombre() + " " + arraySeleccFut[i].getApellidos());
            arraySeleccFut[i].viajar(); System.out.println("\n");
        }
        
        //CONCENTRACIÓN
        System.out.println("-------------- CONCENTRARSE --------------" + "\nCONFORMADO POR TODOS LOS INTEGRANTES\n");
        for (int i = 0; i<3; i++) {
            System.out.println("Nombre y Apellidos : " + arraySeleccFut[i].getNombre() + " " + arraySeleccFut[i].getApellidos());
            arraySeleccFut[i].concentrarse(); System.out.println("\n");
        }
        
        //PARTIDO DE FUTBOL
        System.out.println("------------ PARTIDO DE FUTBOL -----------" + "\nCONFORMADO POR TODOS LOS INTEGRANTES\n");
        for (int i = 0; i<3; i++) {
            System.out.println("Nombre y Apellidos : " + arraySeleccFut[i].getNombre() + " " + arraySeleccFut[i].getApellidos());
            arraySeleccFut[i].partidoFutbol(); System.out.println("\n");
        }
        
        //ENTREVISTA
        System.out.println("--------------- ENTREVISTA ---------------" + "\nFUTBOLISTA (ENCARGADO)\n");
        System.out.println("Nombre y Apellidos : " + lioMessi.getNombre() + " " + lioMessi.getApellidos());
        System.out.println("Dorso : " + lioMessi.getDorsal());
        ((futbolista)lioMessi).entrevista();
        System.out.println("\n\t---- TERMINADO ----\n");
    }
    
}
//@uthor: {Yb.M};