package com.jovanaajankovic.poslasticarnica;

/**
 * Predstavlja stavku racuna u poslasticarnici.
 * Svaka stavka pripada odredjenom racunu i sadrzi redni broj, kolicinu, cenu
 * i poslasticu na koju se odnosi.
 *
 * @author Jovana Jankovic
 */
public class StavkaRacuna {
	
	/** Racun kome stavka pripada*/
	 private Racun racun;
	 
	 /** Redni broj stavke kao int*/
	 private int rb;
	 
	 /** Kolicina stavke na racunu kao int*/
	 private int kolicina;
	 
	 /** Cena stavke kao double*/
	 private double cena;
	 
	 /**Poslastica na koju se stavka odnosi*/
	 private Poslastica poslastica;

	 /**
	  * Inicijalizuje objekat klase StavkaRacuna sa svim parametrima.
	  *
	  * @param racun Racun kojem stavka pripada. Ne sme biti null.
	  * @param rb Redni broj stavke. Mora biti pozitivan broj.
	  * @param kolicina Kolicina poslastica. Mora biti veca od nule.
	  * @param cena Cena stavke. Mora biti veca od nule.
	  * @param poslastica Poslastica koja se nalazi u stavci. Ne sme biti null.
	  */
	 public StavkaRacuna(Racun racun, int rb, int kolicina, double cena, Poslastica poslastica) {
		 setRacun(racun);
		 setRb(rb);
		 setKolicina(kolicina);
		 setCena(cena);
		 setPoslastica(poslastica);
		 
	 }
	 
	 /**
	  * Inicijalizuje objekat klase StavkaRacuna sa atributima koji imaju default vrednosti.
	  */
	 public StavkaRacuna() {
		 
	 }

	 /**
	  * Vraca racun kome stavka pripada.
	  *
	  * @return racun stavke
	  */
	 public Racun getRacun() {
		 return racun;
	 }
	 
	 /**
	  * Postavlja racun kome stavka pripada.
	  * Racun ne sme biti null.
	  *
	  * @param racun Racun kome stavka pripada
	  * @throws java.lang.NullPointerException ako je racun null
	  */
	 public void setRacun(Racun racun) {
		 if (racun == null) 
		        throw new NullPointerException("Racun ne sme biti null.");
		    
		 this.racun = racun;
		 
	 }

	 /**
	  * Vraca redni broj stavke.
	  *     *
	  * @return redni broj
	  */
	 public int getRb() {
		 return rb;
	 }
	 
	/**
	 * Postavlja redni broj stavke.
	 * Redni broj mora biti pozitivan.
	 *
	 * @param rb Redni broj stavke
	 * @throws java.lang.IllegalArgumentException ako redni broj nije pozitivan
	 */
	 public void setRb(int rb) {
		 if (rb <= 0)
		        throw new IllegalArgumentException("Redni broj mora biti pozitivan broj.");
		 
		 this.rb = rb;
		 
	 }
	 
	 /**
	  * Vraca kolicinu poslastica u stavci.
	  *
	  * @return kolicina
	  */
	 public int getKolicina() {
		 return kolicina;
	 }


	 /**
	  * Postavlja kolicinu poslastica u stavci.
	  * Kolicina mora biti veca od nule.
	  *
	  * @param kolicina Kolicina poslastica
	  * @throws java.lang.IllegalArgumentException ako je kolicina manja ili jednaka nuli
	  */
	 public void setKolicina(int kolicina) {
		 if (kolicina <= 0)
		        throw new IllegalArgumentException("Kolicina mora biti veca od nule.");
		 
		 this.kolicina = kolicina;
		 
	 }

	 /**
	  * Vraca cenu stavke racuna.
	  *
	  * @return cena stavke
	  */
	 public double getCena() {
		 return cena;
	 }
	 
	 /**
	  * Postavlja cenu stavke racuna.
	  * Cena mora biti veca od nule.
	  *
	  * @param cena Cena stavke racuna
	  * @throws java.lang.IllegalArgumentException ako je cena manja ili jednaka nuli
	  */
	 public void setCena(double cena) {
		 if (cena <= 0)
		        throw new IllegalArgumentException("Cena mora biti veca od nule.");
		 
		 this.cena = cena;
		 
	 }

	 /**
	  * Vraca poslasticu koja je deo stavke racuna.
	  *
	  * @return poslastica
	  */
	 public Poslastica getPoslastica() {
		 return poslastica;
	 }
	 
	 /**
	  * Postavlja poslasticu za stavku racuna.
	  * Poslastica ne sme biti null.
	  *
	  * @param poslastica Poslastica
	  * @throws java.lang.NullPointerException ako je poslastica null
	  */
	 public void setPoslastica(Poslastica poslastica) {
		 if (poslastica == null) 
		        throw new NullPointerException("Poslastica ne sme biti null.");
		    
		 this.poslastica = poslastica;
		 
	 }
	 

}
