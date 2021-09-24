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


    }

}
