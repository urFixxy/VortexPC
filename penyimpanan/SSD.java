package penyimpanan;

public class SSD extends Penyimpanan {
    public SSD(int price, String readSpeed) {
        super(price, readSpeed);
    }

    @Override
    public String getReadSpeed() {
        return readSpeed;
    }
}