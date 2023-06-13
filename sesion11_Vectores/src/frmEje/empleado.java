package frmEje;
/**
 * @author QUISPE OLANO, MARLON YBER
 */
public class empleado {
        // ATRIBUTOS
    String code, name, area, seguro;
    Double $base;
    int hExtras;
    
    // CONSTRUCTOR
    public empleado(String code, String name, String area, String seguro, Double $base, int hExtras) {
        this.code = code;
        this.name = name;
        this.area = area;
        this.seguro = seguro;
        this.$base = $base;
        this.hExtras = hExtras;
    }
    
    // CALCULA LAS HORAS EXTRAS
    public double montHextra() {
        return ($base * hExtras) / 240;
    }
    
    // CALCULA EL MONTO SEGURO
    public double montSeguro() {
        if (seguro.equalsIgnoreCase("AFP")) {
            return ($base * 17)/100;
        } else {
            if (seguro.equalsIgnoreCase("SNP")) {
                return ($base * 5)/100;
            }
        }
        return(0);
    }
    
    // CALCULA EL MONTO DE ESSALUD
    public double montEssalud() {
        return ($base * 3) / 100;
    }
                                                                                
    // CALCULA EL MONTO DE DESCUENTO
    public double montDsct() {
        return montSeguro() + montEssalud();
    }
    
    // CALCULA EM MONTO DEL SUELDO BRUTO
    public double mont$Bruto() {
        return $base + montHextra();
    }
    
    // CALCULA EL SUELDO NETO
    public double mont$Neto() {
        return mont$Bruto() - montDsct();
    }
}
//{Yb.M};