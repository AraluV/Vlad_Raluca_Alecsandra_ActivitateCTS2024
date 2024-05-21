public class Main {
    public static void main(String[] args) {
//        Leasing leasing=new LeasingNou();
//        leasing.acordaLeasing();
        Credit credit=new CreditExistent();
        Leasing leasing=new Adapter(credit);
        leasing.acordaLeasing();
    }
}