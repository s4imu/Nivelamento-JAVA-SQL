package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

public class ProdutoInternacional extends Produto{

    private double taxaImportacao;
    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public void setValor(Double novoValor) {
        if (novoValor > -100) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maior que -100");
        }
    }

    public double getTaxaImportacao(){
        return this.taxaImportacao;
    }

    public void setTaxaImportacao(double novaTaxaImportacao){
        this.taxaImportacao = novaTaxaImportacao;
    }

}
