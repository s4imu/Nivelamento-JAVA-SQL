package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto novoProduto = new Produto("Sony", Tamanho.MEDIO);

        novoProduto.setNome("Playstation 5");
        novoProduto.setValor(3499.99);
        List<String> itensInclusos = new ArrayList<>();
        itensInclusos.add("2 controles");
        itensInclusos.add("3 jogos");
        itensInclusos.add("1 fonte de energia");
        novoProduto.setItensInclusos(itensInclusos);

        System.out.println(novoProduto.getMarca());
        System.out.println(novoProduto.getTamanho());

        novoProduto.setMarca("JBL");

        System.out.println(novoProduto.getMarca());


//        System.out.println(novoProduto.getNome());


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
