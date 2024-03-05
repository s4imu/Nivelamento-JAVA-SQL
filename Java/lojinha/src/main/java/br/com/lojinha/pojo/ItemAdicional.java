package br.com.lojinha.pojo;

public class ItemAdicional {

    private String nome;
    private Integer quantidade;

    public ItemAdicional(String nomeInicial, Integer quantidadeInicial){
        this.setNome(nomeInicial);
        this.setQuantidade(quantidadeInicial);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public Integer getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(Integer novaQuantidade) {
        this.quantidade = novaQuantidade;
    }
}

