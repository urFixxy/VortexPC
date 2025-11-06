package inti;

public class Motherboard extends Inti {
    public Motherboard(int price, String type) {
        super(price, type);
    }

    @Override
    public String getType() {
        return type;
    }
}