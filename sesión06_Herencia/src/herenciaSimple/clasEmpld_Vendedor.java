package herenciaSimple;

//Marlon Yber Quipe Olano

import java.text.DecimalFormat;

public class clasEmpld_Vendedor extends classEmpleado {
    double montVendido;
    double tasaComis;
    
    public clasEmpld_Vendedor(String DNI, String Apellidos, String Nombres, 
                              double monvend, double tasacom) {
        super(DNI, Apellidos, Nombres);
        this.montVendido = monvend;
        this.tasaComis = tasacom;
    }
    public double calIngresos() {
        return montVendido * tasaComis;
    }
    public double calBonificacion() {
        if (montVendido < 1000) 
            return 0;
        
        else if (montVendido < 5000) 
            return calIngresos()*0.05;
        
        else
            return calIngresos()*0.10;
        
    }
    public double calDsct () {
        if (calIngresos() < 1000)
            return calIngresos()*0.11;
        else
            return calIngresos()*0.15;
    }
    public double cal$neto () {
        return calIngresos() + calBonificacion() - calDsct();
    }
    
    public String mostrarInfo() {
        DecimalFormat df = new DecimalFormat("###0.00");
        return "          DATOS DEL EMPLEADO VENDEDOR\n" + super.mostrarInfo() + "\n" +
               "Dinero de Ingresos\t         : " + "S/" + df.format(calIngresos()) + "\n" +
               "Dinero de Bonificaciones\t : " + "S/" + df.format(calBonificacion()) + "\n" +
               "Cantidad de Dsct\t         : " + "S/" + df.format(calDsct()) + "\n" +
               "Sueldo Total\t                 : " + "S/" + df.format(cal$neto()) + "\n";
                
    }
}
