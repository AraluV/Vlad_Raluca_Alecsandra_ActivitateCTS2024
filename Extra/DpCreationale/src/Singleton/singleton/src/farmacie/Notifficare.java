package farmacie;

import java.util.ArrayList;
import java.util.List;

public class Notifficare {
    private static Notifficare instance=null;
    private List<Client> abonati;

    public Notifficare() {
        abonati = new ArrayList<>();
    }

    public static Notifficare getInstance(){
        if(instance==null){
            instance=new Notifficare();
        }
        return instance;
    }

    public void abonare(Client client){
        abonati.add(client);
    }

    public void dezabonare(Client client){
        abonati.remove(client);
    }

    public void trimitereNotificare(String mesaj){
        for(Client clienti:abonati){
            clienti.primireNotificare(mesaj);
        }
    }
}
