package com.jovanaajankovic.poslasticarnica;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RacunTest {
	
	private Racun racun;
	private Administrator administrator;

	@BeforeEach
	void setUp() throws Exception {
		racun = new Racun();
		administrator = new Administrator(1L, "Jovana", "Jankovic", "jovana123", "jovana123");
	}

	@AfterEach
	void tearDown() throws Exception {
		racun = null;
		administrator = null;
	}

	@Test
	void testRacunLongDateDoubleAdministratorArrayListOfStavkaRacuna() {
		Date datum = new Date(); 
	    ArrayList<StavkaRacuna> stavkeRacuna = new ArrayList<>();
	    stavkeRacuna.add(new StavkaRacuna());
		racun = new Racun (1L, datum, 1000.0, administrator, stavkeRacuna);
		
		assertNotNull(racun);
		assertEquals(1L, racun.getRacunID());
		assertEquals(datum, racun.getDatumVreme());
        assertEquals(1000.0, racun.getCena());
        assertEquals(administrator, racun.getAdministrator());
        assertEquals(stavkeRacuna, racun.getStavkeRacuna());
	}

	@Test
	void testRacun() {
		assertNotNull(racun);
	}
	

	@Test
	void testSetRacunID() {
		racun.setRacunID(1L);
	    assertEquals(1L, racun.getRacunID());
	}
	
	@Test
    void testSetRacunIDNull() {
        assertThrows(java.lang.NullPointerException.class, () -> racun.setRacunID(null));
    }

    @Test
    void testSetRacunIDManjiOdJedan() {
        assertThrows(java.lang.IllegalArgumentException.class, () -> racun.setRacunID(0L));
    }
    

	@Test
	void testSetDatumVreme() {
	     Date datum = new Date();
	     racun.setDatumVreme(datum);
	     assertEquals(datum, racun.getDatumVreme());
	}
	
	@Test
	void testSetDatumVremeNull() {
	     assertThrows(java.lang.IllegalArgumentException.class, () -> racun.setDatumVreme(null));
	}

	@Test
	void testSetDatumVremeFuture() {
	     Date future = new Date(System.currentTimeMillis() + 100000); //trenutno vreme + 100s, dobije se datum u buducnosti
	     assertThrows(java.lang.IllegalArgumentException.class, () -> racun.setDatumVreme(future));
	}
	

	@Test
	void testSetCena() {
	     racun.setCena(1000.0);
	     assertEquals(1000.0, racun.getCena());
	}

	@Test
	void testSetCenaNegativna() {
	     assertThrows(java.lang.IllegalArgumentException.class, () -> racun.setCena(-100.0));
	}
	

	@Test
	void testSetAdministrator() {
		racun.setAdministrator(administrator);
        assertEquals(administrator, racun.getAdministrator());
	}
	
	@Test
	void testSetAdministratorNull() {
	     assertThrows(java.lang.NullPointerException.class, () -> racun.setAdministrator(null));
	}
	
	
    @Test
    void testSetStavkeRacuna() {
        ArrayList<StavkaRacuna> stavkeRacuna = new ArrayList<>();
        stavkeRacuna.add(new StavkaRacuna());
        racun.setStavkeRacuna(stavkeRacuna);
        assertEquals(stavkeRacuna, racun.getStavkeRacuna());
    }

    @Test
    void testSetStavkeRacunaNull() {
        assertThrows(java.lang.NullPointerException.class, () -> racun.setStavkeRacuna(null));
    }

    @Test
    void testSetStavkeRacunaEmpty() {
        assertThrows(java.lang.IllegalArgumentException.class, () -> racun.setStavkeRacuna(new ArrayList<>()));
    }

}
