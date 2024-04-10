package SimpleFactory2;

public class TransportFactory {
    public static Transport getTransport(TipTransport tip){
        switch (tip){
            case AUTOBUZ:
                return new Autobuz();
            case TRAMVAI:
                return new Tramvai();
            case TROLEIBUZ:
                return new Troleibuz();
            default:
                throw new IllegalArgumentException("Transport nwcunoscut!");
        }
    }
}
