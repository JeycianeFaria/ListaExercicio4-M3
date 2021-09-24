package br.com.zup;

public class Colaborador extends Pessoa {

    //atributos
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    //construtor
    public Colaborador(){

    }

    public Colaborador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }


    //Getters e Setters

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }


    //Métodos
    //Calcular Salario
    public double calcularSalario(){
        double salarioLiquido = salarioBase - imposto;
        return salarioLiquido;
    }


    //Para exibir dados
    @Override
    public void exibirDados(){
        System.out.println("\n==================================");
        System.out.println("Nome Colaborador: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Código Setor: " + getCodigoSetor());
        System.out.printf("Salário Base: R$ %.2f%n", getSalarioBase());
        System.out.printf("Imposto: R$ %.2f%n",getImposto());
        System.out.printf("Salário Liquido: R$%.2f%n",calcularSalario());

    }

}
