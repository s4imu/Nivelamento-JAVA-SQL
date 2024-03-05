package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

import java.util.List;

public class Produto {
    private String nome;
    private String marca;
    private Double valor;
    private List<ItemAdicional> itensInclusos;
    private Tamanho tamanho;

public Produto(String marcaInicial, Tamanho tamanhoInicial) {
    this.marca = marcaInicial;
    this.tamanho = tamanhoInicial;
}

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double novoValor) {
        if (novoValor > 0) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maior que 0");
        }
    }

    public List<ItemAdicional> getItensInclusos() {
        return this.itensInclusos;
    }

    public void setItensInclusos(List<ItemAdicional> novosItensInclusos) {
        this.itensInclusos = novosItensInclusos;
    }

    public Tamanho getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(Tamanho novoTamanho) {
        this.tamanho = novoTamanho;
    }
}
