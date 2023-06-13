package exmprcl01;

public class cuentaBancaria {
    int  numCount;
    String titular;
    double retiro, deposito;
    private double saldo;

    public cuentaBancaria(int numCount, String titular, double retiro, double deposito, double saldo) {
        this.numCount = numCount;
        this.titular = titular;
        this.retiro = retiro;
        this.deposito = deposito;
        this.saldo = saldo;
    }
    
    public double retiro () {
        return(saldo - retiro);
    }
    public double deposito () {
        return(saldo + deposito);
    }
    
    public double getSaldo () {
        return saldo;
    }
}
