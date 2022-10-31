package br.inatel.c214;

import br.inatel.c214.estrategia.BubbleSort;

public class OrdenaBubbleSort extends Ordenacao {
    
    public OrdenaBubbleSort() {
        this.estrategia = new BubbleSort();
    }
}
