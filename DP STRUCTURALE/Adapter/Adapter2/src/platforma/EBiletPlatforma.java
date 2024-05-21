package platforma;

import java.sql.SQLOutput;

public class EBiletPlatforma implements EBilet{
    @Override
    public void vindeBilet() {
        System.out.println("Biletul la meci a fost vandut prin platforma EBilet!");
    }
}
