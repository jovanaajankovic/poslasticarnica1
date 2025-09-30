package main;

import java.io.FileReader;

import com.google.gson.Gson;
import com.jovanaajankovic.poslasticarnica.Poslastica;
import com.jovanaajankovic.poslasticarnica.Sastojak;

public class PoslasticaMain2 {

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
