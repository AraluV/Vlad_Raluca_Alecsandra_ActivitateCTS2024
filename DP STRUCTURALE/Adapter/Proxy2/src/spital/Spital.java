package spital;

public class Spital implements Internare{
    private boolean areAsigurare;

    public Spital(boolean areAsigurare) {
        this.areAsigurare = areAsigurare;
    }

    @Override
    public void interneaza() {
        System.out.println("Pacientul se poate interna!");
    }

    @Override
    public boolean areAsigurare() {
        return areAsigurare;
    }
}
