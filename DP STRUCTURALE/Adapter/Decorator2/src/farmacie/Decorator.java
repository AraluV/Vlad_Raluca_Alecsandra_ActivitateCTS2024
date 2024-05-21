package farmacie;

public class Decorator implements Printabil{
    private BonDeCasa bonDeCasa;

    public Decorator(BonDeCasa bonDeCasa) {
        this.bonDeCasa = bonDeCasa;
    }

    @Override
    public void printeaza() {
        bonDeCasa.printeaza();
        System.out.println("La multi ani!");
    }
}
