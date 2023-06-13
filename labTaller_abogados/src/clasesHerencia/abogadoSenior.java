package clasesHerencia;
//Marlon Yber Quispe Olano
public class abogadoSenior extends abogado {

    public abogadoSenior(String tipoAbogado, String name, int cantHjs, int yearsExp, 
                         double $ldFijo, int cantCssAcargo, double bonoCssAcargo) {
        super(tipoAbogado, name, cantHjs, yearsExp, $ldFijo, cantCssAcargo, bonoCssAcargo);
    }
    
    @Override
    public double obtnSueldoF () {
        return $ldFijo + bonoCssAcargo * cantCssAcargo;
    }
    
    public String mensaje() {
        return super.mensaje() + obtnSueldoF();
    }
    
}
/**
 * @author Yber-M
 */