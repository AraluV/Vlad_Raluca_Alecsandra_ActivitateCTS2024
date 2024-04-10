package FactoryMethod;

public class Main {
    public static void main(String[] args){
        SupaFactory supaLegume=new legumeFactory();
        Supa s= supaLegume.creaza();
        s.serveste();

        SupaFactory supaVita=new vitaFactory();
        Supa v=supaVita.creaza();
        v.serveste();
    }
}
