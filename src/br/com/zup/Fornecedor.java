package br.com.zup;

public class Fornecedor extends Pessoa{

    //atributos
    private double valorCredito;
    private double valorDivida;


    //construtor
    public Fornecedor(){

    }

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    //getters e setters

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }


    //Métodos
    //Para obter o Saldo
    public double obterSaldo(){
        double saldoFornecedor = valorCredito - valorDivida;
        return saldoFornecedor;
    }
}
