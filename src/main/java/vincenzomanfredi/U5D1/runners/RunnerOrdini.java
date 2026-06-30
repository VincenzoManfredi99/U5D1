package vincenzomanfredi.U5D1.runners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import vincenzomanfredi.U5D1.entities.*;

import java.util.ArrayList;
import java.util.List;

@Component
public class RunnerOrdini implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(RunnerOrdini.class);

    private Menu menu;

    @Value("${pizzeria.costo-coperto:2.50}")
    private double costoCoperto;

    public RunnerOrdini(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("--- 🍕 PIZZERIA APERTA 🍕 ---");

        this.menu.stampaMenu();

        Tavolo tavolo1 = new Tavolo(1, 4, StatoTavolo.LIBERO);

        List<ElementoMenu> listaElementi = new ArrayList<>();

        Ordine ordine1 = new Ordine(
                listaElementi,
                tavolo1,
                1,
                StatoOrdine.INCORSO,
                3,
                java.time.LocalTime.now()
        );

        Topping salame = new Topping("Salame", 100, 0.80);
        Topping cipolle = new Topping("Cipolle", 40, 0.40);
        Topping formaggio = new Topping("Formaggio", 60, 1.00);
        Pizza margherita = new Pizza("Salami Pizza", 1160, 5.99, List.of(salame, cipolle, formaggio));
        Drink cocaCola = new Drink("Coca Cola", 250, 1.50);


        ordine1.aggiungiElemento(margherita);
        ordine1.aggiungiElemento(cocaCola);

        double totaleOrdine = ordine1.calcolaTotale(this.costoCoperto);

        logger.info("--- 📄 RIEPILOGO ORDINE N. " + 1 + " ---");
        logger.info("Tavolo associato: " + tavolo1.getNumero()); // Assicurati di avere i getter in Tavolo
        logger.info("Numero Coperti: 3");
        logger.info("Costo Coperto Singolo (da properties): " + this.costoCoperto + " €");
        logger.info("TOTALE CONTO: " + totaleOrdine + " €");
    }
}
