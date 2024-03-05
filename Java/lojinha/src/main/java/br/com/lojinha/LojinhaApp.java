package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ItemAdicional;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto novoProduto = new Produto("Sony", Tamanho.MEDIO);
        ItemAdicional novoItemAdicional1 = new ItemAdicional("Controle", 2);
        ItemAdicional novoItemAdicional2 = new ItemAdicional("Jogos", 3);
        ItemAdicional novoItemAdicional3 = new ItemAdicional("Fonte de Energia", 1);

        novoProduto.setNome("Playstation 5");
        novoProduto.setValor(3499.99);
        List<ItemAdicional> itensInclusos = new ArrayList<>();
        itensInclusos.add(novoItemAdicional1);
        itensInclusos.add(novoItemAdicional2);
        itensInclusos.add(novoItemAdicional3);
        novoProduto.setItensInclusos(itensInclusos);

        List<ItemAdicional> itensInclusosProdutos = novoProduto.getItensInclusos();

        for (ItemAdicional item : itensInclusosProdutos) {
            // Acessando atributos usando getters
            String nomeDoItem = item.getNome();
            Integer quantidadeDoItem = item.getQuantidade();

            // Faça algo com nomeDoItem e valorDoItem
            System.out.println("Nome: " + nomeDoItem + ", Quantidade: " + quantidadeDoItem);
        }


        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Samsung", Tamanho.MEDIO);
        meuProdutoNacional.setImpostoNacional(0.55789);
        System.out.println(meuProdutoNacional.getImpostoNacional());

        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Xiaomi", Tamanho.MEDIO);
        meuProdutoInternacional.setTaxaImportacao(0.22);
        System.out.println(meuProdutoInternacional.getTaxaImportacao());

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
