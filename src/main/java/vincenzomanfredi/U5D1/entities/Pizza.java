package vincenzomanfredi.U5D1.entities;

import java.util.List;

public class Pizza extends ElementoMenu {
    List<Topping> topping;

    public Pizza(String name, int calorie, double prezzo, List<Topping> topping) {
        super(name, calorie, prezzo);
        this.topping = topping;
    }

    public List<Topping> getTopping() {
        return topping;
    }

    public void setTopping(List<Topping> topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "topping=" + topping +
                ", name='" + name + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
