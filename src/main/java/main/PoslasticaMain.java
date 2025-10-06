package main;

import java.io.FileWriter;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jovanaajankovic.poslasticarnica.Poslastica;
import com.jovanaajankovic.poslasticarnica.Sastojak;
import com.jovanaajankovic.poslasticarnica.TipPoslastice;

/**
 * Demonstrira rad sa klasama Poslastica, TipPoslastice i Sastojak.
 * U ovom primeru kreira se objekat poslastice sa sastojcima i serijalizuje u JSON format
 * pomoću Gson biblioteke.
 *
 * JSON se snima u fajl poslastica.json.
 *
 * @author Jovana Jankovic
 */
public class PoslasticaMain {

	/**
     * Glavna metoda koja se izvrsava pri pokretanju programa.
     * Kreira se tip poslastice, zatim poslastica sa sastojcima,
     * i cuva se u JSON fajl koriscenjem Gson-a.
     *
     * @param args argumenti komandne linije (ne koriste se u ovom primeru)
     */
	public static void main(String[] args) {
		TipPoslastice tip = new TipPoslastice(1L, "Torta");
		
		ArrayList<Sastojak> sastojci = new ArrayList<>();
		Poslastica p = new Poslastica();
		Sastojak s1 = new Sastojak(p, 1, "Kakao");
        Sastojak s2 = new Sastojak(p, 2, "Secer");
		sastojci.add(s1);
		sastojci.add(s2);
		
        p = new Poslastica(101L, "Cokoladna torta", 500, "Ukusna cokoladna torta", tip, sastojci);

       
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try (FileWriter writer = new FileWriter("poslastica.json")) {
            gson.toJson(p, writer);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Poslastica je snimljena u poslastica.json");
    }

}


