package br.com.zup;

public class Main {

    public static void main(String[] args) {

        //Instanciando Fornecedor
        Fornecedor fornecedor = new Fornecedor("Joao","Rua x ", "99999999",1000,200);


        //Teste Fornecedor
        System.out.println("\n==================================");
        System.out.println("Nome Fornecedor: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.printf("Valor Crédito: R$ %.2f%n",fornecedor.getValorCredito());
        System.out.printf("Valor Divida: R$ %.2f%n",fornecedor.getValorDivida());
        System.out.printf("Valor Saldo: R$ %.2f%n",fornecedor.obterSaldo());


        //Instanciando Colaborador
        Colaborador colaborador = new Colaborador("Marcia", "Rua Z", "555555555", 275,1500,200);

        System.out.println("\n==================================");
        System.out.println("Nome Colaborador: " + colaborador.getNome());
        System.out.println("Endereço: " + colaborador.getEndereco());
        System.out.println("Telefone: " + colaborador.getTelefone());
        System.out.println("Código Setor: " + colaborador.getCodigoSetor());
        System.out.printf("Salário Base: R$ %.2f%n", colaborador.getSalarioBase());
        System.out.printf("Imposto: R$ %.2f%n", colaborador.getImposto());
        System.out.printf("Salário Liquido: R$%.2f%n",colaborador.calcularSalario());


        //Instanciando Administrador
        Administrador administrador = new Administrador("Joana", "Rua D", "55555555", 145263,2000,350,500);


        //Teste Administrador
        System.out.println("\n==================================");
        System.out.println("Nome Administrador: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Código Setor: " + administrador.getCodigoSetor());
        System.out.printf("Salário Base: R$ %.2f%n", administrador.getSalarioBase());
        System.out.printf("Imposto: R$ %.2f%n", administrador.getImposto());
        System.out.printf("Salário Liquido: R$%.2f%n",administrador.calcularSalario());

    }

}
