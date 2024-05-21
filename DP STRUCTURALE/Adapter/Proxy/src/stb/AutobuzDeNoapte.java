package stb;

public class AutobuzDeNoapte implements Oprire{
    private Oprire autobuz;

    public AutobuzDeNoapte(Oprire autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opreste() {
        if(autobuz.getPasageri()>0){
            autobuz.opreste();
        }else{
            System.out.println("Autobuzul nu a oprit in statie pentru ca nu sunt pasageri!");
        }
    }

    @Override
    public int getPasageri() {
        return autobuz.getPasageri();
    }
}
