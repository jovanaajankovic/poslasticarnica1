package com.jovanaajankovic.poslasticarnica;

import java.util.ArrayList;

public class Poslastica {
	
	private Long poslasticaID;
    private String naziv;
    private double cenaPoKomadu;
    private String opis;
    private TipPoslastice tipPoslastice;
    private ArrayList<Sastojak> sastojci;

  
    public Poslastica(Long poslasticaID, String naziv, double cenaPoKomadu, String opis, TipPoslastice tipPoslastice, ArrayList<Sastojak> sastojci) {
        setPoslasticaID(poslasticaID);
        setNaziv(naziv);
        setCenaPoKomadu(cenaPoKomadu);
        setOpis(opis);
        setTipPoslastice(tipPoslastice);
        setSastojci(sastojci);
        
    }

    
    public Poslastica() {
    	
    }
    
    
    public Long getPoslasticaID() {
		return poslasticaID;
	}

	public void setPoslasticaID(Long poslasticaID) {
		if (poslasticaID == null)
			throw new NullPointerException("ID ne sme biti null.");
		
		if (poslasticaID <= 0)
	        throw new IllegalArgumentException("ID mora biti pozitivan broj.");
		
		this.poslasticaID = poslasticaID;
		
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


	public double getCenaPoKomadu() {
		return cenaPoKomadu;
	}

	public void setCenaPoKomadu(double cenaPoKomadu) {
		if (cenaPoKomadu <= 0)
	        throw new IllegalArgumentException("Cena po komadu mora biti veca od nule.");
	    
		this.cenaPoKomadu = cenaPoKomadu;
		
	}


	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		if (opis == null)
			throw new NullPointerException("Opis ne sme biti null.");
		
		if (opis.trim().isEmpty())
			throw new IllegalArgumentException("Opis ne sme biti prazan.");
		
		this.opis = opis;
		
	}


	public TipPoslastice getTipPoslastice() {
		return tipPoslastice;
	}

	public void setTipPoslastice(TipPoslastice tipPoslastice) {
		if (tipPoslastice == null) 
	        throw new NullPointerException("Tip poslastice ne sme biti null.");
		
		this.tipPoslastice = tipPoslastice;
		
	}


	public ArrayList<Sastojak> getSastojci() {
		return sastojci;
	}

	public void setSastojci(ArrayList<Sastojak> sastojci) {
		if (sastojci == null)
			throw new NullPointerException("Lista sastojaka ne sme biti null.");
		
		if (sastojci.isEmpty())
			throw new IllegalArgumentException("Poslastica mora imati bar jedan sastojak.");
		
		this.sastojci = sastojci;
		
	}


	@Override
    public String toString() {
        return naziv + " (Cena po komadu: " + cenaPoKomadu + "din)";
    }


}
