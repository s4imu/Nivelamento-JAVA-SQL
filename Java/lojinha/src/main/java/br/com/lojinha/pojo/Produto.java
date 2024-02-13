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

    public String getItensInclusos() {
        return this.itensInclusos;
    }

    public void setItensInclusos(String novosItensInclusos) {
        this.itensInclusos = novosItensInclusos;
    }

    public String getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(String novoTamanho) {
        this.tamanho = novoTamanho;
    }
}
