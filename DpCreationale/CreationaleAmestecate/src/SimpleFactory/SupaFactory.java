package SimpleFactory;

public class SupaFactory {
    public static Supe getSupa(TipSupa tip){
        switch (tip){
            case SUPA_LEGUME:
                return new supaLegume();
            case SUPA_VITA:
                return new supaVita();
            default:
                throw new IllegalArgumentException("Supa inexistenta!");
        }
    }
}
