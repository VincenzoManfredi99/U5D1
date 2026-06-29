package vincenzomanfredi.U5D1.entities;

public class ElementoMenu {

    String name;
    int calorie;
    double prezzo;

    public ElementoMenu(String name, int calorie, double prezzo) {
        this.name = name;
        this.calorie = calorie;
        this.prezzo = prezzo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "ElementoMenu{" +
                "name='" + name + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}

