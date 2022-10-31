package br.inatel.c214;

import br.inatel.c214.estrategia.InsertionSort;

public class OrdenaInsertionSort extends Ordenacao {
    
    public OrdenaInsertionSort() {
        this.estrategia = new InsertionSort();
    }
}
