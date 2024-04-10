package FactoryMethod;

public class vitaFactory extends SupaFactory{
    @Override
    public Supa creaza() {
        return new supaVita();
    }
}
