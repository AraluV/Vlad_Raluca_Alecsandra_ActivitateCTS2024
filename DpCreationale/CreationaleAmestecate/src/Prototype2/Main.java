package Prototype2;

public class Main {
    public static void main(String[] args){
        Autobuz autobuz=new Autobuz("Audi",33);
        autobuz.afisare();

        Autobuz autobuzClone=(Autobuz) autobuz.clonare();
        autobuzClone.setMarca("BMW");
        autobuzClone.afisare();
    }
}
