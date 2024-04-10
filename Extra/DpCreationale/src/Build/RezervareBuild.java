package Build;

public class RezervareBuild implements Build{
    private boolean decorareMasa;
    private boolean muzica;

    public RezervareBuild(){
        this.decorareMasa=false;
        this.muzica=false;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(decorareMasa,muzica);
    }

    public RezervareBuild setDecorare(){
        this.decorareMasa= !this.decorareMasa;
        return this;
    }

    public RezervareBuild setMuzica(){
        this.muzica= !this.muzica;
        return this;
    }
}
