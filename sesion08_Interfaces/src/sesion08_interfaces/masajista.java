package sesion08_interfaces;
//Marlon Yber Quispe Olano

public class masajista extends seleccionFutbol{
    //VARIABLES
    private String titulacion;
    private int añosExperiencia;
    
    //Método
    public masajista() {super();}
    
    //CONSTRUCTOR
    public masajista(String titulacion, int añosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }
    
    //GETTER Y SETTER
    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

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
    public void entrenamiento() {
        System.out.println("(classMasajista) Entrenamiento de fubol");
    }
    
    @Override
    public void concentrarse () {
        System.out.println("(classMasajista) Se concentra XD");
    }
    
    @Override
    public void viajar() {
        System.out.println("(classMasajista) Viaja junto al team");
    }
    @Override
    public void partidoFutbol () {
        System.out.println("(classMasajista) No puedo tengo fubo");
    }
    public void darMasaje () {
        System.out.println("Masajea :v");
    }
    
}
//@uthor: {Yb.M};