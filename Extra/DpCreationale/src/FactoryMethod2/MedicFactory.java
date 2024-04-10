package FactoryMethod2;

public class MedicFactory extends PersonalSpitalFactory{
    @Override
    public PersonalSpital creaza() {
        return new Medic();
    }
}
