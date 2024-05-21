public class Facade {
    private Banca banca;

    public Facade(Banca banca) {
        this.banca = banca;
    }

    public void varstaClient(){
        this.banca.verificaVarsta();
    }
    public void politie(){
        this.banca.verificaUrmarire();
    }
    public void creante(){
        this.banca.areCreante();
    }

    public void verificareClient(){
        if(banca.areCreante()&&banca.verificaVarsta()&&banca.verificaUrmarire()){
            System.out.println("Clientul poate sa creeze cont!");
        }else{
            System.out.println("Clientul nu poate sa creeze cont!");
        }
    }
}
