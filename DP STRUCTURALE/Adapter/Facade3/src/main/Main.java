package main;

//        În momentul în care un client vine la restaurant pentru o masă, recepționistul trebuie să verifice
//        dacă are masă liberă, apoi să verifice dacă acea masă a fost debarasată de la plecarea ultimului
//        client, de asemenea trebuie să verifice dacă au fost puse șervețele noi pe masă. Managerul
//        restaurantului dorește realizarea unui modul care să simplifice munca recepționistului și să nu mai
//        fie nevoit să verifice în toate locurile ci doar într-un singur loc.

import restaurant.FacadeRestaurant;
import restaurant.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant=new Restaurant(true,false,true);
        FacadeRestaurant facade=new FacadeRestaurant(restaurant);
        facade.masaPregatita();
    }
}