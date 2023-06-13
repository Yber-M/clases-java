package clasesHerencia;
//Marlon Yber Quispe Olano
public class abogadoJunior extends abogado {
    
    int cantCssApoyo;
    double bonoCssApoyo;

    public abogadoJunior(int cantCssApoyo, double bonoCssApoyo, String tipoAbogado, String name,int cantHjs, 
                         int yearsExp, double $ldFijo, int cantCssAcargo, double bonoCssAcargo) {
        super(tipoAbogado, name, cantHjs, yearsExp, $ldFijo, cantCssAcargo, bonoCssAcargo);
        this.cantCssApoyo = cantCssApoyo;
        this.bonoCssApoyo = bonoCssApoyo;
    }
    
    @Override
    public double obtnSueldoF () {
        return $ldFijo + bonoCssAcargo * cantCssAcargo + bonoCssApoyo * cantCssApoyo;
    }
    
    public String mensaje() {
        return super.mensaje() + obtnSueldoF();
    }
    
}
/**
 * @author Yber-M
 */