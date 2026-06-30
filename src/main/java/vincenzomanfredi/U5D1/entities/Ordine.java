package vincenzomanfredi.U5D1.entities;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Ordine {
    private List<ElementoMenu> elementiOrdini;
    private Tavolo tavolo;
    private int numeroOrdine;
    private StatoOrdine stato;
    private int numCoperti;
    private LocalTime oraAcquisizione;

    public Ordine(List<ElementoMenu> elementiOrdini, Tavolo tavolo, int numeroOrdine, StatoOrdine stato, int numCoperti, LocalTime oraAcquisizione) {
        this.elementiOrdini = new ArrayList<>();
        this.tavolo = tavolo;
        this.numeroOrdine = numeroOrdine;
        this.stato = stato.INCORSO;
        this.numCoperti = numCoperti;
        this.oraAcquisizione = LocalTime.now();
    }

    public void aggiungiElemento(ElementoMenu elemento) {
        this.elementiOrdini.add(elemento);
    }

    public double calcolaTotale(double costoCoperto) {
        double totale = 0.0;
        for (ElementoMenu elemento : elementiOrdini) {
            totale += elemento.getPrezzo();
        }
        totale += (this.numCoperti * costoCoperto);
        return totale;
    }
}
