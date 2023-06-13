package sesion07_tarea;
//Marlon Yber Quispe Olano

public abstract class seleccionFutbol {
    
    //VARIABLES
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;
    
    //CONSTRUCTOR
    public seleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    //GETTER Y SETTER
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //MÉTODOS
    public void viajar () {
        System.out.println("(classPADRE) Viaja junto al team :D");
    }
    
    public void concentrarse () {
        System.out.println("(classPADRE) Se concentra XD");
    }
    
    public abstract void entrenamiento ();
    /*MÉTODO ABSTRACTO NO SE IMPLEMENTA EN LA 
    CLASE ABSTRACTA PERO SI EN LAS SUBCLASES*/
    
    public void partidoFutbol () {
        System.out.println("(classPADRE) No puedo tengo fubo");
    }

}
//@uthor: {Yb.M};