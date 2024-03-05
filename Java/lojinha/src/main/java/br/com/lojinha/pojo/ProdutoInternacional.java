package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

public class ProdutoInternacional extends Produto{

    private double taxaImportacao;
    public ProdutoInternacional(String marcaInicial, Tamanho tamanhoInicial) {
        super(marcaInicial, tamanhoInicial);
    }

    public double getTaxaImportacao(){
        return this.taxaImportacao;
    }

    public void setTaxaImportacao(double novaTaxaImportacao){
        this.taxaImportacao = novaTaxaImportacao;
    }

}
