//9. Să se implementeze structura ierarhică a agențiilor băncii știindu-se faptul că o sucursală deține
//        mai multe agenții, iar o agenție deține mai multe filiale.

public class Main {
    public static void main(String[] args) {
        Detalii sucursala=new Sucursala("VEV");
        sucursala.adaugaAgentie(new Agentie("JNCUIEJ"));
        sucursala.adaugaFiliala(new Filiala("VEFV"));
        sucursala.afiseaza();
    }
}