package br.com.alura.OrientacaoAObjetos.Principal;

import br.com.alura.OrientacaoAObjetos.calculos.CalculadoraDeTempo;
import br.com.alura.OrientacaoAObjetos.calculos.FiltroRecomendacao;
import br.com.alura.OrientacaoAObjetos.modelos.Episodio;
import br.com.alura.OrientacaoAObjetos.modelos.Filme;
import br.com.alura.OrientacaoAObjetos.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibirFichaTecnica();
        meuFilme.avaliar(8);
        meuFilme.avaliar(5);
        meuFilme.avaliar(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacao());
        System.out.println(meuFilme.pegadorDeMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.exibirFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração da serie: " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(meuFilme);
        System.out.println(calculadoraDeTempo.getTempoTotal());

        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtro(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacao(300);
        filtroRecomendacao.filtro(episodio);

        Filme filme = new Filme("Dogville", 2003);
        filme.setDuracaoEmMinutos(200);
        filme.avaliar(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme);
        listaDeFilmes.add(meuFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println("toSting do filme " + listaDeFilmes.get(0).toString());

    }
}