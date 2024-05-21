package spital;

public class FacadeSpital {
    private Medic medic;
    private Salon salon;
    private Pacient pacient;

    public FacadeSpital(Medic medic, Salon salon, Pacient pacient) {
        this.medic = medic;
        this.salon = salon;
        this.pacient = pacient;
    }

    public boolean verificaPacient(){
        return this.pacient.getStare().equals("Grava");
    }

    public boolean verificaPatDisponibil(){
        return this.salon.isDisponibil();
    }
    public boolean verificaConfirmareMedic(){
        return this.medic.confirmareInternare();
    }

    public void internarePacient(){
        if(verificaConfirmareMedic()&& verificaPacient()&&verificaPatDisponibil()){
            System.out.println("Pacientul a fost internat cu succes!");
        }else{
            salon.isOcupat();
            System.out.println("Pacientul nu se poate interna!");
        }
    }
}
