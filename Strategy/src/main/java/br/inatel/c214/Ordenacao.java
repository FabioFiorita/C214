package br.inatel.c214;

import java.util.List;

public class Ordenacao {
    
    protected Estrategia estrategia;

    public List<Integer> ordena(List<Integer> dados) {
        return estrategia.ordena(dados);
    }

    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    public Estrategia getEstrategia() {
        return estrategia;
    }

}
