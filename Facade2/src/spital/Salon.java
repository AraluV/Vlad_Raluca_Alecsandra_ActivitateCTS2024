package spital;

public class Salon {

    private int paturiDisponibile;

    public Salon(int paturiDisponibile) {
        this.paturiDisponibile = paturiDisponibile;
    }

    public boolean isDisponibil(){
        return paturiDisponibile>0;
        }

        public void isOcupat(){
            paturiDisponibile=0;
    }
}
