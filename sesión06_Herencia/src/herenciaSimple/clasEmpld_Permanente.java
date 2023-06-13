package herenciaSimple;

//Marlon Yber Quipe Olano

import java.text.DecimalFormat;

public class clasEmpld_Permanente extends classEmpleado{
    
    double sueldobase;
    String afiliacion;
    
    public clasEmpld_Permanente (String DNI, String Apellidos, String Nombres,
                                    double sueldobase, String afiliacion) {
        super(DNI, Apellidos, Nombres);
        this.sueldobase = sueldobase;
        this.afiliacion = afiliacion;
        
    }
    public double ingresos() { return sueldobase; }
    
    public double descuentos () {
        if (afiliacion.equalsIgnoreCase("AFP")) return sueldobase*0.15;
        else return sueldobase*0.11;
    }
    
    public double sueldo () { return ingresos() - descuentos(); }
    
    public String mostrarInfo() {
        DecimalFormat df = new DecimalFormat("###0.00");
        return "          DATOS DEL EMPLEADO PERMANENTE\n" + super.mostrarInfo() + "\n" +
               "Dinero de Ingresos\t         : " + "S/" + df.format(ingresos()) + "\n" +
               "Cantidad de Dsct\t         : " + "S/" + df.format(descuentos()) + "\n" +
               "Sueldo Total\t                 : " + "S/" + df.format(sueldo()) + "\n";
    }
}
