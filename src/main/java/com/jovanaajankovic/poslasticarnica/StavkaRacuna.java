package com.jovanaajankovic.poslasticarnica;

public class StavkaRacuna {
	
	 private Racun racun;
	 private int rb;
	 private int kolicina;
	 private double cena;
	 private Poslastica poslastica;

	 
	 public StavkaRacuna(Racun racun, int rb, int kolicina, double cena, Poslastica poslastica) {
		 setRacun(racun);
		 setRb(rb);
		 setKolicina(kolicina);
		 setCena(cena);
		 setPoslastica(poslastica);
		 
	 }
	 

	 public StavkaRacuna() {
		 
	 }


	 public Racun getRacun() {
		 return racun;
	 }

	 public void setRacun(Racun racun) {
		 if (racun == null) 
		        throw new NullPointerException("Racun ne sme biti null.");
		    
		 this.racun = racun;
		 
	 }


	 public int getRb() {
		 return rb;
	 }

	 public void setRb(int rb) {
		 if (rb <= 0)
		        throw new IllegalArgumentException("Redni broj mora biti pozitivan broj.");
		 
		 this.rb = rb;
		 
	 }
	 

	 public int getKolicina() {
		 return kolicina;
	 }

	 public void setKolicina(int kolicina) {
		 if (kolicina <= 0)
		        throw new IllegalArgumentException("Kolicina mora biti veca od nule.");
		 
		 this.kolicina = kolicina;
		 
	 }


	 public double getCena() {
		 return cena;
	 }

	 public void setCena(double cena) {
		 if (cena <= 0)
		        throw new IllegalArgumentException("Cena mora biti veca od nule.");
		 
		 this.cena = cena;
		 
	 }


	 public Poslastica getPoslastica() {
		 return poslastica;
	 }

	 public void setPoslastica(Poslastica poslastica) {
		 if (poslastica == null) 
		        throw new NullPointerException("Poslastica ne sme biti null.");
		    
		 this.poslastica = poslastica;
		 
	 }
	 

}
