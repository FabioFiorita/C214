package br.inatel.c214.estrategia;

import java.util.List;

import br.inatel.c214.Estrategia;

public class InsertionSort implements Estrategia {

    @Override
    public List<Integer> ordena(List<Integer> dados) {
        int i;
        int j;
        int aux;

        for(j = 1; j < dados.size(); j++) {
            aux = dados.get(j);
            for(i = j - 1; (i >= 0) && (dados.get(i) > aux); i--) {
                dados.set(i + 1, dados.get(i));
            }
            dados.set(i + 1, aux);
        }
        return dados;
    }
    

}
    
