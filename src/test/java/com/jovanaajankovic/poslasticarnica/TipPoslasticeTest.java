package com.jovanaajankovic.poslasticarnica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TipPoslasticeTest {
	
	private TipPoslastice tipPoslastice;

	@BeforeEach
	void setUp() throws Exception {
		tipPoslastice = new TipPoslastice();
	}

	@AfterEach
	void tearDown() throws Exception {
		tipPoslastice = null;
	}

	
	@Test
	void testTipPoslastice() {
		assertNotNull(tipPoslastice);
	}
	
	@Test
	void testTipPoslasticeLongString() {
		tipPoslastice = new TipPoslastice(1L, "Torta");
		
		assertNotNull(tipPoslastice);
        assertEquals(1L, tipPoslastice.getTipPoslasticeID());
        assertEquals("Torta", tipPoslastice.getNaziv());
	}

	
	@Test
	void testSetTipPoslasticeID() {
		 tipPoslastice.setTipPoslasticeID(1L);
	     assertEquals(1L, tipPoslastice.getTipPoslasticeID());
	}
	
	@Test
    void testSetTipPoslasticeIDNull() {
        assertThrows(java.lang.NullPointerException.class, () -> tipPoslastice.setTipPoslasticeID(null));
    }

    @Test
    void testSetTipPoslasticeIDNegativan() {
        assertThrows(java.lang.IllegalArgumentException.class, () -> tipPoslastice.setTipPoslasticeID(-1L));
    }
    
    @Test
    void testSetTipPoslasticeIDNula() {
        assertThrows(java.lang.IllegalArgumentException.class, () -> tipPoslastice.setTipPoslasticeID(0L));
    }
    

	@Test
	void testSetNaziv() {
		tipPoslastice.setNaziv("Torta");
        assertEquals("Torta", tipPoslastice.getNaziv());
	}
	
	@Test
    void testSetNazivNull() {
        assertThrows(java.lang.NullPointerException.class, () -> tipPoslastice.setNaziv(null));
    }

    @Test
    void testSetNazivEmpty() {
        assertThrows(java.lang.IllegalArgumentException.class, () -> tipPoslastice.setNaziv(""));
    }

  
    @Test
    void testToString() {
        tipPoslastice.setNaziv("Torta");
        assertTrue(tipPoslastice.toString().contains("Torta"));
    }

}
