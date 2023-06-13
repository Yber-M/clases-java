package clasesHerencia;
//MARLON YBER QUISPE OLANO
public abstract class intgrtsHogar {
    String name;
    double sueldo;

    public intgrtsHogar(String name, double sueldo) {
        this.name = name;
        this.sueldo = sueldo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public intgrtsHogar () {}
    
    public abstract double cantAporte ();
    
}
