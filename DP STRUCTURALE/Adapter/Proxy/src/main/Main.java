package main;

//8. Pentru autobuzele de noapte se doreste ca oprirea in statie sa se faca doar daca exista persoane
//        in autobuz. In caz contrar autobuzul se retrage la autobaza fara sa mai realizeze opriri. Sa se
//        implementeze modul care va permite oprirea in statie a autobuzelor doar daca exista calatori in
//        autobuz.


import stb.Autobuz;
import stb.AutobuzDeNoapte;
import stb.Oprire;

public class Main {
    public static void main(String[] args) {
        Oprire autobuz=new Autobuz(3);
        Oprire noapte=new AutobuzDeNoapte(autobuz);
        noapte.opreste();

        Oprire autobuz2=new Autobuz(0);
        Oprire noapte2=new AutobuzDeNoapte(autobuz2);
        noapte2.opreste();
    }
}