public class Client implements Observer{
    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println("Mesaj primt: "+mesaj);
    }
}
