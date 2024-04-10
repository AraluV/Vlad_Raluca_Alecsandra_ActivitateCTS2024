package Build;

public class Main {
    public static void main(String[] args){
        RezervareBuild rez=new RezervareBuild().setDecorare();
        Rezervare rezervare=rez.build();
        System.out.println(rezervare);
    }
}
