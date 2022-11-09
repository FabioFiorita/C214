package br.inatel.c214;

import br.inatel.c214.serie.impl.Observador;
import br.inatel.c214.serie.impl.Observavel;

public class Main {
    public static void main(String[] args) {
        Observavel observavel = new Observavel();

        Observador observador1 = new Observador(1);
        Observador observador2 = new Observador(2);
        Observador observador3 = new Observador(3);

        observavel.adicionarObservador(observador1);
        observavel.adicionarObservador(observador2);
        observavel.adicionarObservador(observador3);

        String frase = "A aula do Chris é nota 5";

        observavel.contarPalavras(frase);
        observavel.contarPalavrasPares(frase);
        observavel.contarPalavrasMaiusculas(frase);

        System.out.println("\n\nNotificando observadores");
        observavel.notificarObservadores();

        observavel.removerObservador(observador2);

        System.out.println("\n\nNotificando observadores");
        observavel.notificarObservadores();


    }
}