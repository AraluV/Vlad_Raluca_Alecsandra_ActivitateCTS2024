package acs.ase.clase.suite;

import acs.ase.clase.mock.cuMock;
import acs.ase.clase.mock.faraMock;
import acs.ase.clase.model.IPersoana;
import acs.ase.clase.model.PachetTuristic;
import acs.ase.clase.model.Persoana;
import acs.ase.clase.model.PersoanaFake;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

public class PachetTuristicTest {

    @Test
    @Category(faraMock.class)
    public void testDiscount(){
        IPersoana client=new Persoana("Maria","1234567891");
        PachetTuristic pachetTuristic=new PachetTuristic(client,"Roma",20.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(18.0,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(faraMock.class)
    public void testBoundary(){
        IPersoana client=new Persoana("Maria","2345678912");
        PachetTuristic pachetTuristic=new PachetTuristic(client,"Rooma",20.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(18.0,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(cuMock.class)
    public void valoareAplicaDiscountFake(){
        PersoanaFake client=new PersoanaFake();
        PachetTuristic pachetTuristic=new PachetTuristic(client,"Roma",20.0);
        client.setValoareVarsta(65);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(18.0,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(cuMock.class)
    public void valoareNuApliaDiscountFake(){
        PersoanaFake client=new PersoanaFake();
        PachetTuristic pachetTuristic=new PachetTuristic(client,"Roma",20.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(20.0,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(cuMock.class)
    public void valoareAplicaDiscount150(){
        PersoanaFake client=new PersoanaFake();
        client.setValoareVarsta(150);
        PachetTuristic pachetTuristic=new PachetTuristic(client,"Roma",20.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(18.0,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(cuMock.class)
    public void valoareAplicaDiscount0(){
        PersoanaFake client=new PersoanaFake();
        client.setValoareVarsta(150);
        PachetTuristic pachetTuristic=new PachetTuristic(client,"Roma",20.0);
        pachetTuristic.aplicaDiscountVarstnici(0);
        assertEquals(20.0, pachetTuristic.getPret(),0.01);
    }

}