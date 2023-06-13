package clasesHerencia;
//MARLON YBER QUISPE OLANO
public class hijoMayor extends intgrtsHogar{

    public hijoMayor(String name, double sueldo) {
        super(name, sueldo);
    }

    public hijoMayor() {super();}

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
    
    
    @Override
    public double cantAporte() {
        return (sueldo * 0.10);
    }

    
}
