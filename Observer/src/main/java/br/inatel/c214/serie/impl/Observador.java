package br.inatel.c214.serie.impl;

import br.inatel.c214.serie.interfaces.iObservador;

public class Observador implements iObservador {

    int id;

    public Observador(int id) {
        this.id = id;
    }

    @Override
    public void update(Observavel observavel) {
        System.out.println("Observador " + id + " foi notificado");
        System.out.println("Contando todas as palavras: " + observavel.contarPalavras(observavel.getFrase()));
        System.out.println("Contando palavras pares: " + observavel.contarPalavrasPares(observavel.getFrase()));
        System.out.println("Contando palavras maiúsculas: " + observavel.contarPalavrasMaiusculas(observavel.getFrase()));

    }
}
