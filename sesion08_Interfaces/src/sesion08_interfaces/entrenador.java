package sesion08_interfaces;
//Marlon Yber Quispe Olano

public class entrenador extends seleccionFutbol {
    //VARIABLES
    private int idFederacion;
    
    //Método
    public entrenador() {super();}
    
    //CONSTRUCTOR
    public entrenador(int idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }
    
    //GETTER Y SETTER
    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellidos() {
        return apellidos;
    }

    @Override
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public int getEdad() {
        return edad;
    }
    
    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //MÉTODOS
    @Override
    public void entrenamiento() {
        System.out.println("(classEntrenador) Entrenamiento de fubol");
    }
    @Override
    public void viajar() {
        System.out.println("(classEntrenador) Viaja junto al team");
    }
    @Override
    public void concentrarse () {
        System.out.println("(classEntrenador) Se concentra XD");
    }
    @Override
    public void partidoFutbol () {
        System.out.println("(classEntrenador) No puedo tengo fubo ");
    }
    
    public void planificarEntrenamiento () {
        System.out.println("Planifica el entrenamiento *Tamo' Redy* ");
    }
}
//@uthor: {Yb.M};