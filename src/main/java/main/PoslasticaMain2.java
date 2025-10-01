package main;

import java.io.FileReader;

import com.google.gson.Gson;
import com.jovanaajankovic.poslasticarnica.Poslastica;
import com.jovanaajankovic.poslasticarnica.Sastojak;

/**
 * Demonstrira ucitavanje (deserijalizaciju) objekta Poslastica
 * iz JSON fajla kreiranog pomocu Gson biblioteke.
 * 
 * Ova klasa cita fajl poslastica.json, ucitava poslasticu sa njenim sastojcima
 * i prikazuje ih na standardnom izlazu.
 * 
 * @author Jovana Jankovic
 */
public class PoslasticaMain2 {

	/**
     * Glavna metoda koja se izvrsava pri pokretanju programa.
     * Ucitava se JSON fajl poslastica.json, deserijalizuje u objekat tipa
     * Poslastica, a zatim se na konzoli ispisuju podaci o poslastici
     * i njenim sastojcima.
     *
     * @param args argumenti komandne linije (ne koriste se u ovom primeru)
     */
	public static void main(String[] args) {
		Gson gson = new Gson();

        try (FileReader reader = new FileReader("poslastica.json")) {
            Poslastica p = gson.fromJson(reader, Poslastica.class);
            
            System.out.println("Učitana poslastica:");
            System.out.println(p);

            System.out.println("Sastojci:");
            for (Sastojak s : p.getSastojci()) {
                System.out.println("- " + s);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

	}
	
}
