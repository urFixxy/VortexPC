package inti;

public class CPU extends Inti {
    public CPU(int price, String type) {
        super(price, type);
    }

    @Override
    public String getType() {
        return type;
    }
}