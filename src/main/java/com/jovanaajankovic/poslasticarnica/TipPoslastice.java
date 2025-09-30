package com.jovanaajankovic.poslasticarnica;

public class TipPoslastice {
	
	 private Long tipPoslasticeID;
	 private String naziv;
	 
	 
	 public TipPoslastice(Long tipPoslasticeID, String naziv) {
		 this.tipPoslasticeID = tipPoslasticeID;
		 this.naziv = naziv;
	 }
	 
	 
	 public TipPoslastice() {
		 
	 }


	 public Long getTipPoslasticeID() {
		 return tipPoslasticeID;
	 }

	 public void setTipPoslasticeID(Long tipPoslasticeID) {
		 this.tipPoslasticeID = tipPoslasticeID;
	 }


	 public String getNaziv() {
		 return naziv;
	 }

	 public void setNaziv(String naziv) {
		 this.naziv = naziv;
	 }


	 @Override
	 public String toString() {
		return naziv;
	 }
	 

}
