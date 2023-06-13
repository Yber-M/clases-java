package sesion07_tarea;
//Marlon Yber Quispe Olano

public class futbolista extends seleccionFutbol {
    //VARIABLES
    private int dorsal;
    private String desmarcacion;
    
    //CONSTRUCTOR
    public futbolista(int dorsal, String desmarcacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.desmarcacion = desmarcacion;
    }
    
    //GETTER Y SETTER
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDesmarcacion() {
        return desmarcacion;
    }

    public void setDesmarcacion(String desmarcacion) {
        this.desmarcacion = desmarcacion;
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
    public void viajar () {
        System.out.println("(classFutbolista) Viaja junto al team :D");
    }
    
    @Override
    public void concentrarse () {
        System.out.println("(classFutbolista) Se concentra XD");
    }
    
    @Override
    public void entrenamiento() {
        System.out.println("(classFutbolista) Entrenamiento de fubol");
    }
    
    @Override
    public void partidoFutbol () {
        System.out.println("(classFutbolista) No puedo tengo fubo ");
    }
    
    public void entrevista () {
        System.out.println("Realiza un Entrevista ");
    }
    
}
//@uthor: {Yb.M};