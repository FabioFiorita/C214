package br.inatel.c214.serie.impl;

import br.inatel.c214.serie.interfaces.iObservador;
import br.inatel.c214.serie.interfaces.iObservavel;

import java.util.ArrayList;
import java.util.List;

public class Observavel implements iObservavel {

    private String frase;
    private List<Observador> observadores;

    public Observavel() {
        observadores = new ArrayList<Observador>();
    }

    @Override
    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void removerObservador(Observador observador) {
        if(observadores.contains(observador)) {
            observadores.remove(observador);
        }
    }

    @Override
    public void notificarObservadores() {
        for(Observador observador : observadores) {
            observador.update(this);
        }
    }

    public int contarPalavras(String frase) {
        this.frase = frase;
        return frase.split(" ").length;
    }

    public int contarPalavrasPares(String frase) {
        this.frase = frase;
        int contador = 0;
        for(String palavra : frase.split(" ")) {
            if(palavra.length() % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    public int contarPalavrasMaiusculas(String frase) {
        this.frase = frase;
        int contador = 0;
        for(String palavra : frase.split(" ")) {
            if(palavra.charAt(0) >= 'A' && palavra.charAt(0) <= 'Z') {
                contador++;
            }
        }
        return contador;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public List<Observador> getObservadores() {
        return observadores;
    }

    public void setObservadores(List<Observador> observadores) {
        this.observadores = observadores;
    }
}
