package Sesion14_txt;


public class Empleados {
   
    String codigo;
    String nombre;
    String area;
    double sueldobase;
    double horasExtras;
    String tipoSeg;
    

    public Empleados(String codigo, String nombre, String area, double sueldobase,
            double horasExtras, String seguro) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.area = area;
        this.sueldobase = sueldobase;
        this.horasExtras = horasExtras;
        this.tipoSeg = seguro;
    }
    
    public double montoHExtras(){
        return sueldobase * horasExtras / 240;
    }
    
    public double montoSeguro(){
        
        if (tipoSeg.equalsIgnoreCase("AFP"))
            return sueldobase * 0.17;
        if (tipoSeg.equalsIgnoreCase("SNP"))
            return sueldobase * 0.05;
        return 0;
    }
    
    public double montoEssalud(){
        return sueldobase * 0.03;
    }
    
    public double montoDescuento(){
        return montoSeguro() + montoEssalud();
    }
    
    public double sueldoBruto(){
        return sueldobase + montoHExtras();
    }
    
    public double sueldoNeto(){
        return sueldoBruto() - montoDescuento();
    }
    
}
