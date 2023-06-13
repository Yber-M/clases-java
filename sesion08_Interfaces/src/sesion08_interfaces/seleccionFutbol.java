package sesion08_interfaces;
//Marlon Yber Quispe Olano

public abstract class seleccionFutbol implements inteSeleccFut {
    
    //VARIABLES
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;
    
    //Método
    public seleccionFutbol() {}
    
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
    public abstract void viajar ();
    /*MÉTODO ABSTRACTO NO SE IMPLEMENTA EN LA 
    CLASE ABSTRACTA PERO SI EN LAS SUBCLASES*/
    
    public abstract void concentrarse ();
    /*MÉTODO ABSTRACTO NO SE IMPLEMENTA EN LA 
    CLASE ABSTRACTA PERO SI EN LAS SUBCLASES*/
    
    public abstract void entrenamiento ();
    /*MÉTODO ABSTRACTO NO SE IMPLEMENTA EN LA 
    CLASE ABSTRACTA PERO SI EN LAS SUBCLASES*/
    
    public abstract void partidoFutbol ();
    /*MÉTODO ABSTRACTO NO SE IMPLEMENTA EN LA 
    CLASE ABSTRACTA PERO SI EN LAS SUBCLASES*/

}
//@uthor: {Yb.M};