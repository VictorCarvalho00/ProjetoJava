package br.com.alura.OrientacaoAObjetos.calculos;

public class FiltroRecomendacao {

    public void filtro(Classificacao classificacao) {
        if(classificacao.getClassificacao() >= 4){
            System.out.println("Um dos proferidos do momento");
        } else if (classificacao.getClassificacao() >= 2){
            System.out.println("Muito bem avaliado no momento!");
        } else {
            System.out.println("Coloque na lista para assisitir depois");
        }
    }
}
