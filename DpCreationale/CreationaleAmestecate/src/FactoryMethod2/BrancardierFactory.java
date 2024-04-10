package FactoryMethod2;

public class BrancardierFactory extends PersonalSpitalFactory{
    @Override
    public PersonalSpital creaza() {
        return new Brancardier();
    }
}
