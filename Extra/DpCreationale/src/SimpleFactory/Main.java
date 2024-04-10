package SimpleFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Supe supaLegume= SupaFactory.getSupa(TipSupa.SUPA_LEGUME);
        supaLegume.serveste();

        Supe supaVita=SupaFactory.getSupa(TipSupa.SUPA_VITA);
        supaVita.serveste();
    }
}
