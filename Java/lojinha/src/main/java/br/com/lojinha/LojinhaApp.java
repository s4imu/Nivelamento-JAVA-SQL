package br.com.lojinha;

import br.com.lojinha.pojo.Produto;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto novoProduto = new Produto();

        novoProduto.nome = "Playstation 5";
        novoProduto.valor = 3499.99;
        novoProduto.tamanho = "Médio";
        novoProduto.marca = "Sony";
        novoProduto.itensInclusos = "2 controles e 3 jogos";

        System.out.println(novoProduto.nome);


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
