package br.com.zup;

public class Main {

    public static void main(String[] args) {

        //Instanciando Fornecedor
        Fornecedor fornecedor = new Fornecedor("Joao","Rua x ", "99999999",1000,200);

        //Teste Fornecedor
        fornecedor.exibirDados();


        //Instanciando Colaborador
        Colaborador colaborador = new Colaborador("Marcia", "Rua Z", "555555555", 275,1500,200);

        //Teste Colaborador
        colaborador.exibirDados();


        //Instanciando Administrador
        Administrador administrador = new Administrador("Joana", "Rua D", "55555555", 145263,2000,350,500);

        //Teste Administrador
        administrador.exibirDados();


    }

}
