package bilet;

public class DecoratorBilet implements Printabil{
    private Bilet bilet;

    public DecoratorBilet(Bilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printeaza() {
        bilet.printeaza();
        System.out.println("La multi ani!");
    }
}
