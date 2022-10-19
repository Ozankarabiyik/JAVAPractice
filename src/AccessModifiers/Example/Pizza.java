package AccessModifiers.Example;

public class Pizza {
    PizzaSize size;

    public Pizza(PizzaSize size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                '}';
    }
}
