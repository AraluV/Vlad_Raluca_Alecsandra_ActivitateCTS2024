package restaurant;
public class Restaurant {
    private boolean esteLiber;
    private boolean esteDebarasata;
    private boolean auServeteleNoi;

    public Restaurant(boolean esteLiber, boolean esteDebarasata, boolean auServeteleNoi) {
        this.esteLiber = esteLiber;
        this.esteDebarasata = esteDebarasata;
        this.auServeteleNoi = auServeteleNoi;
    }

    public boolean isMasaLibera(){
        return esteLiber;
    }
    public boolean isMasaDebarasata(){
        return esteDebarasata;
    }

    public boolean isServetele(){
        return auServeteleNoi;
    }
}
