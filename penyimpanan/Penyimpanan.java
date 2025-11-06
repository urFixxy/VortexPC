package penyimpanan;
import core.Priceable;

public abstract class Penyimpanan implements Priceable {
    protected String readSpeed;
    protected int price;

    public Penyimpanan(int price, String readSpeed) {
        this.price = price;
        this.readSpeed = readSpeed;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public abstract String getReadSpeed();
}
