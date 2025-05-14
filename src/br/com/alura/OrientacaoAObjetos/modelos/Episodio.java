package br.com.alura.OrientacaoAObjetos.modelos;

import br.com.alura.OrientacaoAObjetos.calculos.Classificacao;

public class Episodio implements Classificacao {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisualizacao;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVisualizacao() {
        return totalVisualizacao;
    }

    public void setTotalVisualizacao(int totalVisualizacao) {
        this.totalVisualizacao = totalVisualizacao;
    }

    @Override
    public int getClassificacao() {
        if(totalVisualizacao > 100){
            return 4;
        } else {
            return 2;
        }
    }
}
