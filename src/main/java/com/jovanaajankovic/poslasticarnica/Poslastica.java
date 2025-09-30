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
        this.poslasticaID = poslasticaID;
        this.naziv = naziv;
        this.cenaPoKomadu = cenaPoKomadu;
        this.opis = opis;
        this.tipPoslastice = tipPoslastice;
        this.sastojci = sastojci;
    }

    
    public Poslastica() {
    	
    }
    
    
    public Long getPoslasticaID() {
		return poslasticaID;
	}

	public void setPoslasticaID(Long poslasticaID) {
		this.poslasticaID = poslasticaID;
	}


	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}


	public double getCenaPoKomadu() {
		return cenaPoKomadu;
	}

	public void setCenaPoKomadu(double cenaPoKomadu) {
		this.cenaPoKomadu = cenaPoKomadu;
	}


	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}


	public TipPoslastice getTipPoslastice() {
		return tipPoslastice;
	}

	public void setTipPoslastice(TipPoslastice tipPoslastice) {
		this.tipPoslastice = tipPoslastice;
	}


	public ArrayList<Sastojak> getSastojci() {
		return sastojci;
	}

	public void setSastojci(ArrayList<Sastojak> sastojci) {
		this.sastojci = sastojci;
	}


	@Override
    public String toString() {
        return naziv + " (Cena po komadu: " + cenaPoKomadu + "din)";
    }


}
