package com.jovanaajankovic.poslasticarnica;

import java.util.ArrayList;
import java.util.Date;

public class Racun {
	
	 private Long racunID;
	 private Date datumVreme;
	 private double cena;
	 private Administrator administrator;
	 private ArrayList<StavkaRacuna> stavkeRacuna;

	 public Racun(Long racunID, Date datumVreme, double cena, Administrator administrator, ArrayList<StavkaRacuna> stavkeRacuna) {
		 this.racunID = racunID;
		 this.datumVreme = datumVreme;
		 this.cena = cena;
		 this.administrator = administrator;
		 this.stavkeRacuna = stavkeRacuna;
	 }
	 
	 
	 public Racun() {
		 
	 }


	 public Long getRacunID() {
		 return racunID;
	 }

	 public void setRacunID(Long racunID) {
		 this.racunID = racunID;
	 }


	 public Date getDatumVreme() {
		 return datumVreme;
	 }

	 public void setDatumVreme(Date datumVreme) {
		 this.datumVreme = datumVreme;
	 }


	 public double getCena() {
		 return cena;
	 }

	 public void setCena(double cena) {
		 this.cena = cena;
	 }


	 public Administrator getAdministrator() {
		 return administrator;
	 }

	 public void setAdministrator(Administrator administrator) {
		 this.administrator = administrator;
	 }


	 public ArrayList<StavkaRacuna> getStavkeRacuna() {
		 return stavkeRacuna;
	 }

	 public void setStavkeRacuna(ArrayList<StavkaRacuna> stavkeRacuna) {
		 this.stavkeRacuna = stavkeRacuna;
	 }
	 
	 
}
