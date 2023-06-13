package exmprcl01;

public class cliente {
    //MARLON QUISPE OLANO
    String codigo;
    String nombre;
    String genero;
    double peso;
    double talla;

    public cliente(String codigo, String nombre, String genero, double peso, double talla) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.genero = genero;
        this.peso = peso;
        this.talla = talla;
    }
    
    public double ObtenerEstadoPeso() {
        return peso/(talla * talla);
    }
    public double getTalla () {
        return talla;
    }
    public double getPeso () {
        return peso;
    }
    
}
