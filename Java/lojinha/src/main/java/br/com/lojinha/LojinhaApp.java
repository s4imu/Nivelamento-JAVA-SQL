package br.com.lojinha;

import br.com.lojinha.pojo.Produto;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto novoProduto = new Produto();

        novoProduto.setNome("Playstation 5");
        novoProduto.setValor(3499.99);
        novoProduto.setTamanho("Médio");
        novoProduto.setMarca("Sony");
        novoProduto.setItensInclusos("2 controles e 3 jogos");

        System.out.println(novoProduto.getNome());


//        System.out.println("Lojinha App!!!");
//        String nome = "Tipo String";
//        Integer numero = 24;
//        Double decimal = 1.0;
//        Boolean verdadeiro = true;
//
//        System.out.println(nome);
//        System.out.println(numero);
//        System.out.println(decimal);
//        System.out.println(verdadeiro);

    }
}
