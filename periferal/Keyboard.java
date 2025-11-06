package periferal;

public class Keyboard extends Periferal {
    public Keyboard(int price, String connectionType) {
        super(price, connectionType);
    }

    @Override
    public String getConnectionType() {
        return connectionType;
    }
}
