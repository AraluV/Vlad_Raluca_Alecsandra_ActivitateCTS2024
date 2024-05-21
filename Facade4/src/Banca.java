public class Banca {
    private int varsta;
    private boolean urmaritDePolitie;
    private boolean areCreate;

    public Banca(int varsta, boolean urmaritDePolitie, boolean areCreate) {
        this.varsta = varsta;
        this.urmaritDePolitie = urmaritDePolitie;
        this.areCreate = areCreate;
    }

    public boolean verificaVarsta(){
        return varsta>=14;
    }

    public boolean verificaUrmarire(){
        return false;
    }
    public boolean areCreante(){
        return false;
    }
}
