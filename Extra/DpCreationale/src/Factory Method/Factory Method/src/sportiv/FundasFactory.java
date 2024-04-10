package sportiv;

public class FundasFactory extends SportivFactory{
    @Override
    public Sportiv creeaza() {
        return new Fundas();
    }
}
