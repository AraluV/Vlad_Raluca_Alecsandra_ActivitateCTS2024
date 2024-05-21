package restaurant;

public class FacadeRestaurant {
    private Restaurant restaurant;

    public FacadeRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void masaPregatita(){
        if(restaurant.isServetele()&& restaurant.isMasaDebarasata()&& restaurant.isMasaLibera()){
            System.out.println("Masa este gata pentru urmatorul client!");
        }else{
            System.out.println("Masa nu este gata pentru urmatorul client!");
        }
    }
}
