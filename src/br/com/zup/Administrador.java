package br.com.zup;

import javax.annotation.processing.Generated;

public class Administrador extends Colaborador {

    //atributos
    private double ajudaDeCusto;


    //construtor
    public Administrador(){

    }

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }


    //Getters e Setters
    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }


    //Métodos
    @Override
    public double calcularSalario(){
        double salarioLiquido = (getSalarioBase() - getImposto()) + ajudaDeCusto;
        return salarioLiquido;
    }

    @Override
    public void exibirDados(){

        System.out.println("\n==================================");
        System.out.println("Nome Administrador: " + getNome());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Código Setor: " + getCodigoSetor());
        System.out.printf("Salário Base: R$ %.2f%n", getSalarioBase());
        System.out.printf("Imposto: R$ %.2f%n", getImposto());
        System.out.printf("Ajuda de Custo: R$ %.2f%n",getAjudaDeCusto());
        System.out.printf("Salário Liquido: R$%.2f%n",calcularSalario());

    }

}
