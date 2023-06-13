package clasesHerencia;
//MARLON YBER QUISPE OLANO
public class hijoMenor extends intgrtsHogar {

    public hijoMenor(String name, double sueldo) {
        super(name, sueldo);
    }

    public hijoMenor() {super();}

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
        return sueldo = 100;
    }
}
