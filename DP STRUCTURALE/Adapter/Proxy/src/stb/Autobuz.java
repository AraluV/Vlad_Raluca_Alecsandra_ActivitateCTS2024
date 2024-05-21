package stb;

public class Autobuz implements Oprire{
    private int parageri;

    public Autobuz(int parageri) {
        this.parageri = parageri;
    }

    public int getParageri() {
        return parageri;
    }

    @Override
    public void opreste() {
        System.out.println("Autobuzul a oprit in statie!");
    }

    @Override
    public int getPasageri() {
        return parageri;
    }
}
