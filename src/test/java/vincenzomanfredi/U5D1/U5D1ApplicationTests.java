package vincenzomanfredi.U5D1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import vincenzomanfredi.U5D1.entities.*;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class U5D1ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testCalcoloTotaleOrdine() {

        Tavolo tavolo = new Tavolo(1, 4, StatoTavolo.OCCUPATO);
        List<ElementoMenu> elementi = new ArrayList<>();
        Ordine ordine = new Ordine(elementi, tavolo, 1, StatoOrdine.INCORSO, 2, LocalTime.now());

        Pizza pizza = new Pizza("Salami Pizza", 1160, 5.99, new ArrayList<>());
        Drink drink = new Drink("Coca Cola", 250, 1.50);
        ordine.aggiungiElemento(pizza);
        ordine.aggiungiElemento(drink);

        double costoCopertoSimulato = 2.00;

        double totaleOttenuto = ordine.calcolaTotale(costoCopertoSimulato);

        assertEquals(11.49, totaleOttenuto, 0.01);
    }
}
