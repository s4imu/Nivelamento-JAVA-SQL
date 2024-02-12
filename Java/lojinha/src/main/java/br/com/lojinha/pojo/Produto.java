package br.com.lojinha.pojo;

public class Produto {
    private String nome;
    private String marca;
    private Double valor;
    private String itensInclusos;
    private String tamanho;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getItensInclusos() {
        return this.itensInclusos;
    }

    public void setItensInclusos(String itensInclusos) {
        this.itensInclusos = itensInclusos;
    }

    public String getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
