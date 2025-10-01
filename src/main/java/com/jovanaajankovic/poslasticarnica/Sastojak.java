package com.jovanaajankovic.poslasticarnica;

public class Sastojak {
	
	 private transient Poslastica poslastica;
	 private int rb;
	 private String naziv;

	 public Sastojak(Poslastica poslastica, int rb, String naziv) {
		 setPoslastica(poslastica);
		 setRb(rb);
		 setNaziv(naziv);
		 
	 }
	 
	 
	 public Sastojak() {
		 
	 }


	 public Poslastica getPoslastica() {
		 return poslastica;
	 }

	 public void setPoslastica(Poslastica poslastica) {
		 if (poslastica == null)
		        throw new NullPointerException("Poslastica ne sme biti null.");
		   
		 this.poslastica = poslastica;
		 
	 }


	 public int getRb() {
		 return rb;
	 }

	 public void setRb(int rb) {
		 if (rb <= 0)
		        throw new IllegalArgumentException("Redni broj mora biti pozitivan broj.");
		 
		 this.rb = rb;
		 
	 }


	 public String getNaziv() {
		 return naziv;
	 }

	 public void setNaziv(String naziv) {
		 if (naziv == null)
				throw new NullPointerException("Naziv ne sme biti null.");
			
		 if (naziv.trim().isEmpty())
				throw new IllegalArgumentException("Naziv ne sme biti prazan.");
			
		 this.naziv = naziv;
		 
	 }


	 @Override
	 public String toString() {
		 return rb + ". " + naziv;
	 }

 
}
