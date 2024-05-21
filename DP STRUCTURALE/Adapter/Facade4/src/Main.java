public class Main {
    public static void main(String[] args) {
        Banca banca=new Banca(44,false,false);
        Facade facade=new Facade(banca);
        facade.verificareClient();
    }
}