package frmlab4;
/**
 *
 * @author Yber-M
 */
public class estudiantes {
    /*MARLON YBER QUISPE OLANO
      {Yb.M};
    */    
    //variables
    String estudiante;
    double nota1;
    double crdt1;
    double nota2;
    double crdt2;
    double nota3;
    double crdt3;

    public estudiantes(String estudiante, double nota1, double crdt1, double nota2, double crdt2, double nota3, double crdt3) {
        this.estudiante = estudiante;
        this.nota1 = nota1;
        this.crdt1 = crdt1;
        this.nota2 = nota2;
        this.crdt2 = crdt2;
        this.nota3 = nota3;
        this.crdt3 = crdt3;
    }
    public double promedio(){
        return(nota1 + nota2 + nota3)/3;
    }
    public double poderado() {
        return(nota1*crdt1 + nota2*crdt2 + nota3*crdt3) / (crdt1+crdt2+crdt3);
    }
    
}
