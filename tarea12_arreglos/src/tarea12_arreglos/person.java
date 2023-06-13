package tarea12_arreglos;
/**
 * @author Yb.M
 */
public class person {
    String DNI, name, apellido;
    int edad;
    double sueldo, total;

    public person() {
    }
    
    public person(String DNI, String name, String apellido, int edad, double sueldo) {
        this.DNI = DNI;
        this.name = name;
        this.apellido = apellido;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public String mostrar() {
        return "\nNombres : " + name +"\nApellidos : " + apellido;
    }   
}
//@uthor: {Yb.M};