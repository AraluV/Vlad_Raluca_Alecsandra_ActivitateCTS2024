package spital;

public class ProxySpital implements Internare{
    Internare pacient;

    public ProxySpital(Internare pacient) {
        this.pacient = pacient;
    }

    @Override
    public void interneaza() {
        if(pacient.areAsigurare()){
            pacient.interneaza();
        }else{
            System.out.println("Pacientul nu se poate interna!");
        }
    }
    @Override
    public boolean areAsigurare() {
        return areAsigurare();
    }
}
