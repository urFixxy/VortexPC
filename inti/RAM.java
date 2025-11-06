package inti;

public class RAM extends Inti {
    public RAM(int price, String type) {
        super(price, type);
    }

    @Override
    public String getType() {
        return type;
    }
}