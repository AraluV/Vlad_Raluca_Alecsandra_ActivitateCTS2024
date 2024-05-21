import java.util.List;

public class ConcreteObserver extends Subject{

    @Override
    public void anuntareMesaj() {
        System.out.println("Mesaj anuntat!");
    }
}
