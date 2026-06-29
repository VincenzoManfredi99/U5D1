package vincenzomanfredi.U5D1.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import vincenzomanfredi.U5D1.entities.Drink;
import vincenzomanfredi.U5D1.entities.Menu;
import vincenzomanfredi.U5D1.entities.Pizza;
import vincenzomanfredi.U5D1.entities.Topping;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ConfigClass {

    //Drink
    @Bean
    public Drink acqua() {
        return new Drink("Acqua", 0, 1.29);
    }

    @Bean
    public Drink limonata() {
        return new Drink("Limonata", 128, 1.29);
    }

    @Bean
    public Drink vino() {
        return new Drink("Vino", 607, 7.49);
    }

    //Topping
    @Bean
    public Topping formaggio() {
        return new Topping("Formaggio", 92, 0.69);
    }

    @Bean
    public Topping mortadella() {
        return new Topping("Mortadella", 35, 0.99);
    }

    @Bean
    public Topping cipolle() {
        return new Topping("Cipolle", 22, 0.69);
    }

    @Bean
    public Topping ananas() {
        return new Topping("Ananas", 24, 0.79);
    }

    @Bean
    public Topping salame() {
        return new Topping("Salame", 86, 0.99);
    }

    // Pizze
    @Bean
    public Pizza margherita() {
        return new Pizza("Margherita", 1104, 4.99, new ArrayList<>());
    }

    @Bean
    public Pizza hawaiana(Topping mortadella, Topping ananas) {
        return new Pizza("Hawaiana", 1024, 6.49, List.of(mortadella, ananas));
    }

    @Bean
    public Pizza salamePizza(Topping salame, Topping cipolle, Topping formaggio) {
        return new Pizza("Salami Pizza", 1160, 5.99, List.of(salame, cipolle, formaggio));
    }

    @Bean
    public Menu menuCompleto(List<Pizza> pizze, List<Topping> toppings, List<Drink> drinks) {
        return new Menu(pizze, toppings, drinks);
    }
}
