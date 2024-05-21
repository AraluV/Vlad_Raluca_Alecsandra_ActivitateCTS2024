package autobuz;

public class FacadeAutobuz{
    private Autobuz autobuz;

    public FacadeAutobuz(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    public void modLiber(){
        this.autobuz.modLiberFata();
        this.autobuz.modLiberMijloc();
        this.autobuz.modLiberSpate();
    }

    public void modDeschidere(){
        this.autobuz.modDeschidereFata();
        this.autobuz.modDeschidereMijloc();
        this.autobuz.modDeschidereSpate();
    }
}
