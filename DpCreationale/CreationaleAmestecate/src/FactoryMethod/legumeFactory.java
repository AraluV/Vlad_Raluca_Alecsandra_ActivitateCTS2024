package FactoryMethod;

public class legumeFactory extends SupaFactory{
    @Override
    public Supa creaza() {
        return new supaLegume();
    }
}
