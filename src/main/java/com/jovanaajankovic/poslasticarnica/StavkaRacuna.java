package com.jovanaajankovic.poslasticarnica;

public class StavkaRacuna {
	
	 private Racun racun;
	 private int rb;
	 private int kolicina;
	 private double cena;
	 private Poslastica poslastica;

	 
	 public StavkaRacuna(Racun racun, int rb, int kolicina, double cena, Poslastica poslastica) {
		 this.racun = racun;
		 this.rb = rb;
		 this.kolicina = kolicina;
		 this.cena = cena;
		 this.poslastica = poslastica;	        
	 }
	 

	 public StavkaRacuna() {
		 
	 }


	 public Racun getRacun() {
		 return racun;
	 }

	 public void setRacun(Racun racun) {
		 this.racun = racun;
	 }


	 public int getRb() {
		 return rb;
	 }

	 public void setRb(int rb) {
		 this.rb = rb;
	 }
	 

	 public int getKolicina() {
		 return kolicina;
	 }

	 public void setKolicina(int kolicina) {
		 this.kolicina = kolicina;
	 }


	 public double getCena() {
		 return cena;
	 }

	 public void setCena(double cena) {
		 this.cena = cena;
	 }


	 public Poslastica getPoslastica() {
		 return poslastica;
	 }

	 public void setPoslastica(Poslastica poslastica) {
		 this.poslastica = poslastica;
	 }
	 

}
