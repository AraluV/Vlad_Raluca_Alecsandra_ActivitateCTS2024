package restaurant;

public class Customer {
    private static Customer instance=null;
    private String nume;
    private String email;
    private String nr;

    private Customer(String nume, String email, String nr) {
        this.nume = nume;
        this.email = email;
        this.nr = nr;
    }

    public static Customer getInstance(String nume, String email, String nr){
        if(instance==null||!instance.getNume().equals(nume)||!instance.getEmail().equals(email)||!instance.getNr().equals(nr)){
            instance=new Customer(nume,email,nr);
        }
        return instance;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }

    public void afisareInfo(){
        System.out.println("Nume:"+nume);
        System.out.println("Email:"+email);
        System.out.println("Telefon:"+nr);
    }
}
