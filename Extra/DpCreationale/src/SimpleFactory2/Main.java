package SimpleFactory2;

public class Main {
    public static void main(String[] args){
        Transport autobuz=TransportFactory.getTransport(TipTransport.AUTOBUZ);
        autobuz.creaza();
        Transport tramvai=TransportFactory.getTransport(TipTransport.TRAMVAI);
        tramvai.creaza();
        Transport troleibuz=TransportFactory.getTransport(TipTransport.TROLEIBUZ);
        troleibuz.creaza();
    }
}
