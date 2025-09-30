package com.jovanaajankovic.poslasticarnica;

public class Sastojak {
	
	 private Poslastica poslastica;
	 private int rb;
	 private String naziv;

	 public Sastojak(Poslastica poslastica, int rb, String naziv) {
		 this.poslastica = poslastica;
		 this.rb = rb;
		 this.naziv = naziv;	    
	 }
	 
	 
	 public Sastojak() {
		 
	 }


	 public Poslastica getPoslastica() {
		 return poslastica;
	 }

	 public void setPoslastica(Poslastica poslastica) {
		 this.poslastica = poslastica;
	 }


	 public int getRb() {
		 return rb;
	 }

	 public void setRb(int rb) {
		 this.rb = rb;
	 }


	 public String getNaziv() {
		 return naziv;
	 }

	 public void setNaziv(String naziv) {
		 this.naziv = naziv;
	 }
	 
	 
}
