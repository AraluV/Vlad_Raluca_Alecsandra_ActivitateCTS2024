import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
     List<Observer> observatori;
     public abstract void anuntareMesaj();

    public Subject() {
        this.observatori = new ArrayList<>();
    }

    public void abonareClient(Client client){
        observatori.add(client);
    }
}
