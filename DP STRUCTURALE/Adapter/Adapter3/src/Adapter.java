public class Adapter implements Leasing{
    private Credit credit;

    public Adapter(Credit credit) {
        this.credit = credit;
    }

    @Override
    public void acordaLeasing() {
        credit.acordaCredit();
        Leasing leasing=new LeasingNou();
        leasing.acordaLeasing();
    }
}
