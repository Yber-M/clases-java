package sesion12_matrices;
/**
 * @author Yb.M
 */
public class Sesion12_Matrices {

    public static void main(String[] args) {
        empleado e;
        empleado[][] empleados = new empleado[2][3];
        
        //PRIMERA FILA
        e = new empleado("3490", "uno", "Marketing", "SNP", 4589.5, 5);
        empleados [0][0] = e;
        
        e = new empleado("2300", "dos", "Sistemas", "SNP", 7450.6, 20);
        empleados [0][1] = e;
        
        e = new empleado("5467", "tres", "Sistemas", "AFP", 7650.8, 23);
        empleados [0][2] = e;
        
        //SEGUNDA FILA
        e = new empleado("3490", "uno", "Marketing", "SNP", 4589.5, 10);
        empleados [1][0] = e;
        
        e = new empleado("2300", "dos", "Sistemas", "SNP", 7450.6, 20);
        empleados [1][1] = e;
        
        e = new empleado("5467", "tres", "Sistemas", "AFP", 7650.8, 23);
        empleados [1][2] = e;
        
        
        for (int i = 0; i <= empleados[0].length; i++) {
            for (int j = 0; j < empleados[0].length; j++)
                
                System.out.print(empleados[i][j].name + ", ");
                System.out.println("");
        }
        
    }
    
}