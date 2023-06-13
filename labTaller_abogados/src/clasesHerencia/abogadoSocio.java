package clasesHerencia;
//Marlon Yber Quispe Olano
public class abogadoSocio extends abogado {

    public abogadoSocio(String tipoAbogado, String name, int cantHjs, int yearsExp,
                        double $ldFijo, int cantCssAcargo, double bonoCssAcargo) {
        super(tipoAbogado, name, cantHjs, yearsExp, $ldFijo, cantCssAcargo, bonoCssAcargo);
    }
    
    @Override
    public double obtnSueldoF () {
        //return $ldFijo + bonoCssAcargo * cantCssAcargo;
        return 10000 + 10000 * cantCssAcargo;
    }
    
    public String mensaje() {
        return super.mensaje() + obtnSueldoF();
    }
    
}
/**
 * @author Yber-M
 */