package com.jovanaajankovic.poslasticarnica;

/**
 * Predstavlja tip poslastice u poslasticarnici.
 * Tip poslastice se identifikuje pomocu ID-a i naziva (npr. torta, kolac, sladoled).
 *
 * @author Jovana Jankovic
 */
public class TipPoslastice {
	
	/** ID tipa poslastice kao long*/
	 private Long tipPoslasticeID;
	 
	 /** Naziv poslastice kao String*/
	 private String naziv;
	 
	 /**
	  * Inicijalizuje objekat klase TipPoslastice sa svim parametrima.
	  *
	  * @param tipPoslasticeID Jedinstveni ID tipa poslastice. Ne sme biti null i mora biti veci od nule.
	  * @param naziv Naziv tipa poslastice. Ne sme biti null niti prazan string.
	  */
	 public TipPoslastice(Long tipPoslasticeID, String naziv) {
		 setTipPoslasticeID(tipPoslasticeID);
		 setNaziv(naziv);
		 
	 }
	 
	 /**
	  * Inicijalizuje objekat klase TipPoslastice sa atributima koji imaju default vrednosti.
	  */
	 public TipPoslastice() {
		 
	 }

	 /**
	  * Vraca jedinstveni ID tipa poslastice.
	  *
	  * @return ID tipa poslastice
	  */
	 public Long getTipPoslasticeID() {
		 return tipPoslasticeID;
	 }
	 
	 /**
	  * Postavlja jedinstveni ID tipa poslastice.
	  * ID tipa poslastice ne sme biti null i mora biti veci od nule.
	  *
	  * @param tipPoslasticeID ID tipa poslastice
	  * @throws java.lang.NullPointerException ako je tipPoslasticeID null
	  * @throws java.lang.IllegalArgumentException ako je tipPoslasticeID manji ili jednak nuli
	  */
	 public void setTipPoslasticeID(Long tipPoslasticeID) {
		if (tipPoslasticeID == null)
				throw new NullPointerException("ID ne sme biti null.");
			
		if (tipPoslasticeID <= 0)
		        throw new IllegalArgumentException("ID mora biti pozitivan broj.");
		
		 this.tipPoslasticeID = tipPoslasticeID;
		 
	 }

	 /**
	  * Vraca naziv tipa poslastice.
	  *
	  * @return naziv tipa poslastice
	  */
	 public String getNaziv() {
		 return naziv;
	 }

	 /**
	  * Postavlja naziv tipa poslastice.
	  * Naziv tipa poslastice ne sme biti null niti prazan string.
	  * 
	  * @param naziv Naziv tipa poslastice
	  * @throws java.lang.NullPointerException ako je naziv null
	  * @throws java.lang.IllegalArgumentException ako je naziv prazan string
	  */
	 public void setNaziv(String naziv) {
		 if (naziv == null)
				throw new NullPointerException("Naziv ne sme biti null.");
			
		if (naziv.isEmpty())
				throw new IllegalArgumentException("Naziv ne sme biti prazan.");
			
		 this.naziv = naziv;
		 
	 }

	 /**
	  * Vraca tekstualni prikaz tipa poslastice.
	  * 
	  * @return naziv tipa poslastice
	  */
	 @Override
	 public String toString() {
		return naziv;
	 }
	 

}
