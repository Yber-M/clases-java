package sesion07_tarea;
//Marlon Yber Quispe Olano
public class polimorfismo {

    public static void main(String[] args) {
        seleccionFutbol stheCurry = new entrenador(1, 23999, "Sthepen", "Curry", 30);
        futbolista lioMessi = new futbolista(10, "Delantero", 1230, "Lionel", "Messi", 25);
        masajista deliaFlor = new masajista("Fisioterapeuta", 10, 3499, "Delia", "Flor", 34);
        
        //PLANIFICAR ENTRENAMIENTO
        System.out.println("----- Planificación del Entrenamiento -----" + "\nENTRENADOR (ENCARGADO)\n");
        System.out.println("Identificador : " + stheCurry.getId() + "\nEdad : " + stheCurry.getEdad());
        System.out.println("Nombre y Apellido : " + stheCurry.getNombre() + " " + stheCurry.getApellidos());
        ((entrenador)stheCurry).planificarEntrenamiento(); System.out.println("\n");
        
        //ENTRENAMIENTO
        System.out.println("-------------- Entrenamiento --------------" + "\nCONFORMADO POR TODOS LOS INTEGRANTES\n");
        System.out.println("<DATOS DEL ENTRENADOR>");
        System.out.println("ID: " + stheCurry.getId() + "\nEdad : " + stheCurry.getEdad());
        System.out.println("Nombre y Apellido : " + stheCurry.getNombre() + " " + stheCurry.getApellidos() + "\n");
        
        System.out.println("<DATOS DEL FUTBOLISTA>");
        System.out.println("ID : " + lioMessi.getId() + "\nDesmarcación : " + lioMessi.getDesmarcacion());
        System.out.println("Nombre y Apellidos : " + lioMessi.getNombre() + " " + lioMessi.getApellidos());
        System.out.println("Dorsal : " + lioMessi.getDorsal() + "\nAños : " + lioMessi.getEdad() + "\n");
        
        System.out.println("<DATOS DEL MASAJISTA>");
        System.out.println("ID: " + deliaFlor.getId() + "\nTitulación : " + deliaFlor.getTitulacion());
        System.out.println("Nombre y Apellidos : " + deliaFlor.getNombre() + " " + deliaFlor.getApellidos());
        System.out.println("Edad: " + deliaFlor.getEdad() + "\nExperiencia : " + deliaFlor.getAñosExperiencia() + " años" + "\n");
        
        //MASAJE
        System.out.println("------------- REALIZAR MASAJE -------------" + "\nMASAJISTA (ENCARGADO)\n");
        System.out.println("ID: " + deliaFlor.getId() + "\nTitulación : " + deliaFlor.getTitulacion());
        System.out.println("Nombre y Apellidos : " + deliaFlor.getNombre() + " " + deliaFlor.getApellidos());
        System.out.println("Edad: " + deliaFlor.getEdad() + "\nExperiencia : " + deliaFlor.getAñosExperiencia() + " años");
        ((masajista) deliaFlor).darMasaje(); System.out.println("\n");
        
        //VIAJE
        System.out.println("------------------ VIAJAN -----------------" + "\nCONFORMADO POR TODOS LOS INTEGRANTES\n");
        System.out.println("Nombre y Apellido : " + stheCurry.getNombre() + " " + stheCurry.getApellidos()); stheCurry.viajar();
        System.out.println("Nombre y Apellidos : " + deliaFlor.getNombre() + " " + deliaFlor.getApellidos()); deliaFlor.viajar();
        System.out.println("Nombre y Apellidos : " + lioMessi.getNombre() + " " + lioMessi.getApellidos()); lioMessi.viajar(); 
        System.out.println("\n");
        
        //CONCENTRACIÓN
        System.out.println("-------------- CONCENTRARSE --------------" + "\nCONFORMADO POR TODOS LOS INTEGRANTES\n");
        System.out.println("Nombre y Apellido : " + stheCurry.getNombre() + " " + stheCurry.getApellidos());stheCurry.concentrarse();
        System.out.println("Nombre y Apellidos : " + deliaFlor.getNombre() + " " + deliaFlor.getApellidos());deliaFlor.concentrarse();
        System.out.println("Nombre y Apellidos : " + lioMessi.getNombre() + " " + lioMessi.getApellidos());lioMessi.concentrarse();
        System.out.println("\n");
        
        //PARTIDO DE FUTBOL
        System.out.println("------------ PARTIDO DE FUTBOL -----------" + "\nCONFORMADO POR TODOS LOS INTEGRANTES\n");
        System.out.println("Nombre y Apellido : " + stheCurry.getNombre() + " " + stheCurry.getApellidos());stheCurry.partidoFutbol();
        System.out.println("Nombre y Apellidos : " + deliaFlor.getNombre() + " " + deliaFlor.getApellidos());deliaFlor.partidoFutbol();
        System.out.println("Nombre y Apellidos : " + lioMessi.getNombre() + " " + lioMessi.getApellidos());lioMessi.partidoFutbol();
        System.out.println("\n");
        
        //ENTREVISTA
        System.out.println("--------------- ENTREVISTA ---------------" + "\nFUTBOLISTA (ENCARGADO)\n");
        System.out.println("Nombre y Apellidos : " + lioMessi.getNombre() + " " + lioMessi.getApellidos());
        ((futbolista)lioMessi).entrevista();
        System.out.println("");
    }
    
}
//@uthor: {Yb.M};