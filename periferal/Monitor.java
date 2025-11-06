package periferal;

public class Monitor extends Periferal {
    public Monitor(int price, String connectionType) {
        super(price, connectionType);
    }

    @Override
    public String getConnectionType() {
        return connectionType;
    }
}
