package FactoryMethod2;

public class AsistentFactory extends PersonalSpitalFactory{
    @Override
    public PersonalSpital creaza() {
        return new Asistent();
    }
}
