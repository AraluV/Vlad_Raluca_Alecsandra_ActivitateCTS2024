package mainProgram;

import spital.RetetaMedicament;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Integer> cantitatiSolutii=new HashMap<>();
        cantitatiSolutii.put("Solutie",10);
        RetetaMedicament retetaInitiala=new RetetaMedicament("NVKJEHFV",cantitatiSolutii);
        retetaInitiala.produce();

      RetetaMedicament retetaClone=(RetetaMedicament) retetaInitiala.clone();
      retetaClone.setNume("vjerhi");
      retetaClone.produce();
    }
}
