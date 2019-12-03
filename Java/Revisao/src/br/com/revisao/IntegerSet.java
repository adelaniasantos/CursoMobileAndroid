package br.com.revisao;

import java.util.ArrayList;
import java.util.List;

public class IntegerSet {

    private List <Integer> conjuntoClasse = new ArrayList<>();


    public List<Integer> getConjuntoClasse() {
        return conjuntoClasse;
    }

    public void setConjuntoClasse(List<Integer> conjuntoClasse) {
        this.conjuntoClasse = conjuntoClasse;
    }

    public List<Integer> uniao (List<Integer>  conjuntoParam){
       List<Integer> listUniao = new ArrayList<>();

            listUniao.addAll(conjuntoParam);
            listUniao.addAll(conjuntoClasse);

        return  listUniao;
    }

    public List<Integer> intersecao (List<Integer> conjuntoParam){
        List<Integer> listIntersec = new ArrayList<>();

        for (int i = 0; i < conjuntoParam.size() ; i++) {
          if(conjuntoClasse.contains(conjuntoParam.get(i))){
               listIntersec.add(conjuntoParam.get(i));
          }
        }

        return listIntersec;
    }

    public List<Integer> diferenca (List<Integer> conjuntoParam){
        List<Integer> listIntersec = new ArrayList<>();
/*

        for (int i = 0; i < conjuntoParam.size() ; i++) {
            if(!conjuntoClasse.contains(conjuntoParam.get(i))){
                listIntersec.add(conjuntoParam.get(i));
            }
        }
*/
        for (int i = 0; i < conjuntoClasse.size() ; i++) {
            if(!conjuntoParam.contains(conjuntoClasse.get(i))){
                listIntersec.add(conjuntoClasse.get(i));
            }
        }

        for (Integer numeroConjutoNovo: conjuntoParam){

            if(!this.conjuntoClasse.contains(numeroConjutoNovo)){
                listIntersec.add(numeroConjutoNovo);
            }

        }

        return listIntersec;
    }

    public void inserir (ArrayList<Integer> conjuntoParam, int addVar){

        if(addVar >=0 && addVar <= 50){
            conjuntoParam.add(addVar);
        }
        else{
            System.out.println("O valor nao pode ser maior que 50.");
        }

    }

    public void excluir (ArrayList<Integer> conjuntoParam, int deleteVar){
       conjuntoParam.remove(deleteVar);
    }

    public void converte (List<Integer> conjuntoParam){
        System.out.println(conjuntoParam.toString());
    }

}
