public class ContaBancaria {

    private String titular;
    private int numeroConta;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public static void main(String[] args) {
        ContaBancaria conta01 = new ContaBancaria("Andre", 12345);

        conta01.depositar(1500.0);

        System.out.println("Saldo da conta 01: " + conta01.consultarSaldo());
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito realizado com sucesso! Novo saldo: " + this.saldo);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso! Novo saldo: " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("Transferência realizada com sucesso! Novo saldo: " + this.saldo);
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    public double consultarSaldo() {
        return this.saldo;
    }
    
}