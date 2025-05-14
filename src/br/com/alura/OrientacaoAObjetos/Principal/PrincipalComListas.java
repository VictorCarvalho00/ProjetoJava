package br.com.alura.OrientacaoAObjetos.Principal;

import br.com.alura.OrientacaoAObjetos.modelos.Filme;
import br.com.alura.OrientacaoAObjetos.modelos.Serie;
import br.com.alura.OrientacaoAObjetos.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
       meuFilme.avaliar(10);
        Filme filme = new Filme("Dogville", 2003);
        filme.avaliar(8);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filme);
        lista.add(meuFilme);
        lista.add(lost);
        for(Titulo item: lista){
            System.out.println(item.getNome());
            if(item instanceof Filme filme1){
                System.out.println("Classificação " + filme1.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtistas = new ArrayList<>();
        buscaPorArtistas.add("Adam Sandler");
        buscaPorArtistas.add("Klaus");
        buscaPorArtistas.add("Ana Maria");

        Collections.sort(buscaPorArtistas);
        System.out.println(buscaPorArtistas);

        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: ");
        System.out.println(lista);

    }
}
