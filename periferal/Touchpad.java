package periferal;

public class Touchpad extends Periferal {
    public Touchpad(int price, String connectionType) {
        super(price, connectionType);
    }

    @Override
    public String getConnectionType() {
        return connectionType;
    }
}