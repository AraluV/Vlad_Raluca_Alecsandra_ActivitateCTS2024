package Builder2;

public class AutobuzLine implements Build{
    private String model;
    private String sofer;
    private boolean oprire;
    private boolean deschideUsa;

    public AutobuzLine(){
        this.model=null;
        this.sofer=null;
        this.oprire=false;
        this.deschideUsa=false;
    }

    public AutobuzLine setModel(String model){
        this.model=model;
        return this;
    }

    public AutobuzLine setSofer(String sofer){
        this.sofer=sofer;
        return this;
    }

    public AutobuzLine setOprire(boolean oprire){
        this.oprire= oprire;
        return this;
    }
    public AutobuzLine setDeschideUsa(boolean deschideUsa){
        this.deschideUsa=deschideUsa;
        return this;
    }


    @Override
    public Autobuz build() {
        return new Autobuz(model,sofer,oprire,deschideUsa);
    }
}
