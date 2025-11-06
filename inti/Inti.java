package inti;
import core.Priceable;

public abstract class Inti implements Priceable {
    protected int price;
    protected String type;

    public Inti(int price, String type) {
        this.price = price;
        this.type = type;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public abstract String getType();
}
