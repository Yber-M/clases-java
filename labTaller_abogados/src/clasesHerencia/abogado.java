package clasesHerencia;
//Marlon Yber Quispe Olano
public abstract class abogado {
    
    String tipoAbogado;
    String name;
    int cantHjs;
    int yearsExp;
    double $ldFijo;
    int cantCssAcargo;
    double bonoCssAcargo;

    public abogado(String tipoAbogado, String name, int cantHjs, int yearsExp, 
                   double $ldFijo, int cantCssAcargo, double bonoCssAcargo) {
        
        this.tipoAbogado = tipoAbogado;
        this.name = name;
        this.cantHjs = cantHjs;
        this.yearsExp = yearsExp;
        this.$ldFijo = $ldFijo;
        this.cantCssAcargo = cantCssAcargo;
        this.bonoCssAcargo = bonoCssAcargo;
    }
    
    public abstract double obtnSueldoF();
    
    //Es Juan Pérez, tiene 2 hijos, con 10 años de experiencia profesional. 
    //Es un abogado con el estatus de Senior con un total de pago a recibir este mes de S/.9,000
    public String mensaje() {
        return "                                         ------------------- IMPRESIÓN DE DATOS -------------------\n"+ 
                name + " tiene " + cantHjs + " hijos y cuanta con " + yearsExp +
               " años de experiencia profesional. El es un\nabogado con el estatus de " + tipoAbogado +
               ", el total de pago a recibir este mes sería S/";
    }
    
}
/**
 * @author Yber-M
 */