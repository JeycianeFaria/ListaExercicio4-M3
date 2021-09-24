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

}
