package br.inatel.c214.estrategia;

import java.util.List;

import br.inatel.c214.Estrategia;

public class SelectionSort implements Estrategia {

    @Override
    public List<Integer> ordena(List<Integer> dados) {
        for(int fixo = 0; fixo < dados.size() - 1; fixo++) {
            int menor = fixo;
            for(int i = menor + 1; i < dados.size(); i++) {
                if(dados.get(i) < dados.get(menor)) {
                    menor = i;
                }
            }
            if(fixo != menor) {
                int t = dados.get(fixo);
                dados.set(fixo, dados.get(menor));
                dados.set(menor, t);
            }
        }
        return dados;
    }

}
