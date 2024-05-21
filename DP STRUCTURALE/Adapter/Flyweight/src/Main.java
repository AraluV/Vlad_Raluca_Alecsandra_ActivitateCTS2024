public class Main {
    public static void main(String[] args) {
        Banca banca=new Banca("BCR","FERV");
        Cont cont=new Cont(23,44.5);
        banca.getClient("Mihai","fervge").afisareDetalii(cont);


    }
}