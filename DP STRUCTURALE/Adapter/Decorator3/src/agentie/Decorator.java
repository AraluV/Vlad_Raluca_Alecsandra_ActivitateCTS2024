package agentie;

public class Decorator implements Rezervare{
    private Rezervare rezervare;
    private int perioada;

    public Decorator(Rezervare rezervare, int perioada) {
        this.rezervare = rezervare;
        this.perioada = perioada;
    }

    @Override
    public void anuleaza() {
        if(this.perioada>3){
            System.out.println("Rezervarea nu mai poate fi anulata!");
        }else{
            rezervare.anuleaza();
        }
    }
}
