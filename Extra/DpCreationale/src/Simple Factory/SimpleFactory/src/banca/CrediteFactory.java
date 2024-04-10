package banca;

public class CrediteFactory {
    public static Credit creeazaCredit(String tip){
        switch(tip){
            case "ipotecar":
                return new CreditIpotecar();
            case "nevoi personale":
                return new CreditNevPers();
            default:
                return null;
        }
    }
}
