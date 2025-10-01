package com.jovanaajankovic.poslasticarnica;

public class TipPoslastice {
	
	 private Long tipPoslasticeID;
	 private String naziv;
	 
	 
	 public TipPoslastice(Long tipPoslasticeID, String naziv) {
		 setTipPoslasticeID(tipPoslasticeID);
		 setNaziv(naziv);
		 
	 }
	 
	 
	 public TipPoslastice() {
		 
	 }


	 public Long getTipPoslasticeID() {
		 return tipPoslasticeID;
	 }

	 public void setTipPoslasticeID(Long tipPoslasticeID) {
		 if (tipPoslasticeID == null)
				throw new NullPointerException("ID ne sme biti null.");
			
		if (tipPoslasticeID <= 0)
		        throw new IllegalArgumentException("ID mora biti pozitivan broj.");
		
		 this.tipPoslasticeID = tipPoslasticeID;
		 
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
		return naziv;
	 }
	 

}
