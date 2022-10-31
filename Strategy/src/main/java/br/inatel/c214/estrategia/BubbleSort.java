package br.inatel.c214.estrategia;

import java.util.List;

import br.inatel.c214.Estrategia;

public class BubbleSort implements Estrategia {

    @Override
    public List<Integer> ordena(List<Integer> dados) {
        boolean troca = true;
        int aux;

        while (troca) {
            troca = false;
            for (int i = 0; i < dados.size() - 1; i++) {
                if (dados.get(i) > dados.get(i + 1)) {
                    aux = dados.get(i);
                    dados.set(i, dados.get(i + 1));
                    dados.set(i + 1, aux);
                    troca = true;
                }
            }
        }
        return dados;
    }

}
