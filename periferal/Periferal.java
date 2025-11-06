package periferal;

import core.Priceable;

public abstract class Periferal implements Priceable {
    protected int price;
    protected String connectionType;

    public Periferal(int price, String connectionType) {
        this.price = price;
        this.connectionType = connectionType;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public abstract String getConnectionType();
}
