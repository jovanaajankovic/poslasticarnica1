package com.jovanaajankovic.poslasticarnica;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PoslasticaTest {

	private Poslastica poslastica;
	private TipPoslastice tipPoslastice;

	@BeforeEach
	void setUp() throws Exception {
		poslastica = new Poslastica();
		tipPoslastice = new TipPoslastice(1L, "Torta");
	}

	@AfterEach
	void tearDown() throws Exception {
		poslastica = null;
		tipPoslastice = null;
	}

	@Test
	void testPoslasticaLongStringDoubleStringTipPoslasticeArrayListOfSastojak() {
	    ArrayList<Sastojak> sastojci = new ArrayList<>();
	    sastojci.add(new Sastojak());
	    
		poslastica = new Poslastica(1L, "Cokoladna torta", 500.0, "Ukusna torta", tipPoslastice, sastojci);
		
		assertNotNull(poslastica);
		assertEquals(1L, poslastica.getPoslasticaID());
		assertEquals("Cokoladna torta", poslastica.getNaziv());
        assertEquals(500.0, poslastica.getCenaPoKomadu());
        assertEquals("Ukusna torta", poslastica.getOpis());
        assertEquals(tipPoslastice, poslastica.getTipPoslastice());
        assertEquals(sastojci, poslastica.getSastojci());
	}

	@Test
	void testPoslastica() {
		assertNotNull(poslastica);
	}
	

	@Test
	void testSetPoslasticaID() {
		poslastica.setPoslasticaID(1L);
	    assertEquals(1L, poslastica.getPoslasticaID());
	}
	
	@Test
    void testSetPoslasticaIDNull() {
        assertThrows(java.lang.NullPointerException.class, () -> poslastica.setPoslasticaID(null));
    }

    @Test
    void testSetPoslasticaIDNegativan() {
        assertThrows(java.lang.IllegalArgumentException.class, () -> poslastica.setPoslasticaID(-1L));
    }
    
    @Test
    void testSetPoslasticaIDNula() {
        assertThrows(java.lang.IllegalArgumentException.class, () -> poslastica.setPoslasticaID(0L));
    }
    
    
    @Test
	void testSetNaziv() {
		tipPoslastice.setNaziv("Reforma");
        assertEquals("Reforma", poslastica.getNaziv());
	}
    
	@Test
	void testSetNazivSaRazmakom() {
		tipPoslastice.setNaziv("Cokoladna torta");
        assertEquals("Cokoladna torta", poslastica.getNaziv());
	}
	
	@Test
    void testSetNazivNull() {
        assertThrows(java.lang.NullPointerException.class, () -> poslastica.setNaziv(null));
    }

    @Test
    void testSetNazivEmpty() {
        assertThrows(java.lang.IllegalArgumentException.class, () -> poslastica.setNaziv(""));
    }

    @Test
    void testSetNazivBlankoZnak() {
        assertThrows(java.lang.IllegalArgumentException.class, () -> poslastica.setNaziv("   "));
    }
    
    
   	@Test
	void testSetCenaPoKomadu() {
	    poslastica.setCenaPoKomadu(500.0);
	    assertEquals(500.0, poslastica.getCenaPoKomadu());
	}

	@Test
	void testSetCenaPoKomaduNegativna() {
	    assertThrows(java.lang.IllegalArgumentException.class, () -> poslastica.setCenaPoKomadu(-100.0));
	}
	
	@Test
	void testSetCenaPoKomaduNula() {
	    assertThrows(java.lang.IllegalArgumentException.class, () -> poslastica.setCenaPoKomadu(0.0));
	}
	
	
	@Test
	void testSetOpis() {
		poslastica.setOpis("Kremasto");
		assertEquals("Kremasto", poslastica.getOpis());
	}
	
	@Test
	void testSetOpisSaRazmakom() {
		poslastica.setOpis("Ukusna torta");
		assertEquals("Ukusna torta", poslastica.getOpis());
	}

	@Test
	void testSetOpisNull() {
	     assertThrows(java.lang.NullPointerException.class, () -> poslastica.setOpis(null));
	}
		
	@Test
	void testSetOpisEmpty() {
	     assertThrows(java.lang.IllegalArgumentException.class, () -> poslastica.setOpis(""));
	}
		
	@Test
	void testSetOpisBlankoZnak() {
	     assertThrows(java.lang.IllegalArgumentException.class, () -> poslastica.setOpis("   "));
	}
	

	@Test
	void testSetTipPoslastice() {
		poslastica.setTipPoslastice(tipPoslastice);
        assertEquals(tipPoslastice, poslastica.getTipPoslastice());
	}
	
	@Test
	void testSetTipPoslasticeNull() {
	     assertThrows(java.lang.NullPointerException.class, () -> poslastica.setTipPoslastice(null));
	}
	
	
    @Test
    void testSetSastojci() {
        ArrayList<Sastojak> sastojci = new ArrayList<>();
        sastojci.add(new Sastojak());
        poslastica.setSastojci(sastojci);
        assertEquals(sastojci, poslastica.getSastojci());
    }

    @Test
    void testSetSastojciNull() {
        assertThrows(java.lang.NullPointerException.class, () -> poslastica.setSastojci(null));
    }

    @Test
    void testSetSastojciEmpty() {
        assertThrows(java.lang.IllegalArgumentException.class, () -> poslastica.setSastojci(new ArrayList<>()));
    }
    
    
    @Test
    void testToString() {
        poslastica.setNaziv("Cokoladna torta");
        poslastica.setCenaPoKomadu(500.0);
        assertTrue(poslastica.toString().contains("Cokoladna torta"));
        assertTrue(poslastica.toString().contains("500.0"));
    }

}
