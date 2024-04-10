package sportiv;

public class AtacantFactory extends SportivFactory{
    @Override
    public Sportiv creeaza() {
        return new Atacant();
    }
}
