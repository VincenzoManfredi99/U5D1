package vincenzomanfredi.U5D1.entities;

public class Tavolo {
    int numero;
    int numMassimo;
    StatoTavolo stato;

    public Tavolo(int numero, int numMassimo, StatoTavolo stato) {
        this.numero = numero;
        this.numMassimo = numMassimo;
        this.stato = stato;
    }

    public int getNumero() {
        return numero;
    }
}
