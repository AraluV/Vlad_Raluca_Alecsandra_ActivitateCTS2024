package agentie;

public class AgentieRezervare implements Rezervare{
    @Override
    public void anuleaza() {
        System.out.println("Rezervarea poate fi anulata!");
    }
}
