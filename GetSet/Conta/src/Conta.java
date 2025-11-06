public class Conta {
    private int numero;
    private String titular;
    private double saldo;
    private String status;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Conta(int numero, String titular, double saldo, String status){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.status = status;
    }
    public void sacar(double valor){
        this.saldo -= valor;
        System.out.println("Saldo atual: " + this.saldo);
    }
    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Saldo atual: " + this.saldo);
    }
    public void info(){
        System.out.println("Numero: " + this.numero);
        System.out.println("Titular: " + this.titular);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Status: " + this.status);
    }

}
