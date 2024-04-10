package pacient;

import java.util.ArrayList;
import java.util.List;

public class ModulNotificare {
    private static ModulNotificare instance=null;

    private List<Pacient> abonati;
    //constructor private singleton
    private ModulNotificare(){
        abonati=new ArrayList<>();
    }

    //metoda abtinere instanta singleton
    public static ModulNotificare getInstance(){
        if(instance==null){
            instance=new ModulNotificare();
        }
        return instance;
    }
    public void aboneaza(Pacient pacient){
        abonati.add(pacient);
    }

    public void dezaboneaza(Pacient pacient){
        abonati.remove(pacient);
    }
    public void trimitereNotificare(String mesaj){
        for(Pacient pacient:abonati){
            pacient.primesteNotificare(mesaj);
        }
    }
}
