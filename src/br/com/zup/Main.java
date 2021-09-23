package br.com.zup;

public class Main {

    public static void main(String[] args) {

        //Instanciando Fornecedor
        Fornecedor fornecedor1 = new Fornecedor("Joao","Rua x ", "99999999",1000,200);

        //Teste Fornecedor
        System.out.println(fornecedor1.getNome());
        System.out.println(fornecedor1.getEndereco());
        System.out.println(fornecedor1.getTelefone());
        System.out.println(fornecedor1.getValorCredito());
        System.out.println(fornecedor1.getValorDivida());
        System.out.println(fornecedor1.obterSaldo());

    }

}
