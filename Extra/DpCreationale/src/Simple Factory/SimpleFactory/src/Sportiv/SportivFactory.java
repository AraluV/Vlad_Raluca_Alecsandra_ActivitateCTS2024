package Sportiv;

public class SportivFactory {
    public static Sportiv creeazaSportiv(TipSportiv tip,String nume){
        switch (tip){
            case ATACANT :
                return new JucatorAtacant(nume);
            case PORTAR:
                return new JucatorPortar(nume);
            case FUNDAS:
                return new JucatorFundas(nume);
            default:
                try {
                    throw new Exception("Tipul de sportiv nu exista!");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
        }
    }
}
