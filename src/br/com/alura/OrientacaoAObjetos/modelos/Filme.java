package br.com.alura.OrientacaoAObjetos.modelos;

import br.com.alura.OrientacaoAObjetos.calculos.Classificacao;

public class Filme extends Titulo implements Classificacao {
    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegadorDeMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ") ";
    }
}
