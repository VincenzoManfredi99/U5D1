package vincenzomanfredi.U5D1.entities;

public class Drink extends ElementoMenu {

    public Drink(String name, int calorie, double prezzo) {
        super(name, calorie, prezzo);
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
