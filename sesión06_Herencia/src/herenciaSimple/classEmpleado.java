package herenciaSimple;

//Marlon Yber Quipe Olano

public class classEmpleado {
    protected String DNI;
    protected String Apellidos;
    protected String Nombres;
    
    public classEmpleado(){
    }

    public classEmpleado(String DNI, String Apellidos, String Nombres) {
        this.DNI = DNI;
        this.Apellidos = Apellidos;
        this.Nombres = Nombres;
    }
    public String mostrarInfo() {
        return  "DNI       : " + DNI + "\n" +
                "Nombres   : " + Nombres + "\n" +
                "Apellidos : " + Apellidos + "\n";
                
        
                
    }
}
