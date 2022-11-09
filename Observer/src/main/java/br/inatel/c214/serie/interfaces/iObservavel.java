package br.inatel.c214.serie.interfaces;

import br.inatel.c214.serie.impl.Observador;

public interface iObservavel {
    public void adicionarObservador(Observador observador);
    public void removerObservador(Observador observador);
    public void notificarObservadores();
}
