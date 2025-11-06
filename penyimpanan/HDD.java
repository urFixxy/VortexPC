package penyimpanan;

public class HDD extends Penyimpanan {
    public HDD(int price, String readSpeed) {
        super(price, readSpeed);
    }

    @Override
    public String getReadSpeed() {
        return readSpeed;
    }
}
