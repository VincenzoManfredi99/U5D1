package vincenzomanfredi.U5D1.entities;

import java.util.List;

public class Menu {
    private List<Pizza> pizze;
    private List<Topping> toppings;
    private List<Drink> drinks;

    public Menu(List<Pizza> pizze, List<Topping> toppings, List<Drink> drinks) {
        this.pizze = pizze;
        this.toppings = toppings;
        this.drinks = drinks;
    }

    public void stampaMenu() {

        System.out.println("--- LE NOSTRE PIZZE ---");
        pizze.forEach(p -> System.out.println(p.getName() + " - " + p.getCalorie() + " - " + p.getPrezzo() + " €"));

        System.out.println("\n--- I NOSTRI TOPPING ---");
        toppings.forEach(t -> System.out.println(t.getName() + " - " + t.getCalorie() + " - " + t.getPrezzo() + " €"));

        System.out.println("\n--- I NOSTRI DRINK ---");
        drinks.forEach(d -> System.out.println(d.getName() + " - " + d.getCalorie() + " - " + d.getPrezzo() + " €"));
    }
}
