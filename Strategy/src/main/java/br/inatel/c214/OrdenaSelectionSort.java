package br.inatel.c214;

import br.inatel.c214.estrategia.SelectionSort;

public class OrdenaSelectionSort extends Ordenacao {
    
    public OrdenaSelectionSort() {
        this.estrategia = new SelectionSort();
    }
}
