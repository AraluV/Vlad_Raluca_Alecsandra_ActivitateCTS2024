package main;

import java.io.FileNotFoundException;
import java.util.List;

import clase.Angajat;
import clase.Aplicant;
import reader.AngajatReader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
			AngajatReader angajatReader=new AngajatReader();
			listaAngajati=angajatReader.read("angajati.txt");
			for(Aplicant aplicant:listaAngajati)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
