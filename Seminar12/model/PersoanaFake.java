package acs.ase.clase.model;

public class PersoanaFake implements IPersoana{
    private String valoareSex;
    private int valoareVarsta;
    private boolean valoareCNPCheck;
    @Override
    public String getSex() {
        return null;
    }

    @Override
    public int getVarsta() {
        return valoareVarsta;
    }

    @Override
    public boolean checkCNP() {
        return false;
    }

    public void setValoareSex(String valoareSex){
        this.valoareSex=valoareSex;
    }

    public void setValoareVarsta(int valoareVarsta){
        this.valoareVarsta=valoareVarsta;
    }
    public void setValoareCNPCheck(boolean valoareCNPCheck){
        this.valoareCNPCheck=valoareCNPCheck;
    }
}
