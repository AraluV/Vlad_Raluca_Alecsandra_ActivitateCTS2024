package Builder2;

public class Main {
    public static void main(String[]args){
        Autobuz autobuz=new AutobuzLine().setModel("Audi").setSofer("Mirel").setOprire(true).setDeschideUsa(false).build();
        System.out.println(autobuz);
    }
}
