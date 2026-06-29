package vincenzomanfredi.U5D1.entities;

public class Topping extends ElementoMenu {

    public Topping(String name, int calorie, double prezzo) {
        super(name, calorie, prezzo);
    }

    @Override
    public String toString() {
        return "Topping{" +
                "name='" + name + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
