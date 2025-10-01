package com.jovanaajankovic.poslasticarnica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SastojakTest {

	private Sastojak sastojak;
    private Poslastica poslastica;

    @BeforeEach
    void setUp() throws Exception {
        poslastica = new Poslastica();
        sastojak = new Sastojak();
    }

    @AfterEach
    void tearDown() throws Exception {
        sastojak = null;
        poslastica = null;
    }

    @Test
    void testSastojakPoslasticaIntString() {
        sastojak = new Sastojak(poslastica, 1, "Cokolada");

        assertNotNull(sastojak);
        assertEquals(poslastica, sastojak.getPoslastica());
        assertEquals(1, sastojak.getRb());
        assertEquals("Cokolada", sastojak.getNaziv());
    }

    @Test
    void testSastojak() {
        assertNotNull(sastojak);
    }

    @Test
    void testSetPoslastica() {
        sastojak.setPoslastica(poslastica);
        assertEquals(poslastica, sastojak.getPoslastica());
    }

    @Test
    void testSetPoslasticaNull() {
        assertThrows(java.lang.NullPointerException.class, () -> sastojak.setPoslastica(null));
    }
    

    @Test
    void testSetRb() {
        sastojak.setRb(1);
        assertEquals(1, sastojak.getRb());
    }

    @Test
    void testSetRbNegativan() {
        assertThrows(java.lang.IllegalArgumentException.class, () -> sastojak.setRb(-1));
    }
    
    @Test
    void testSetRbNula() {
        assertThrows(java.lang.IllegalArgumentException.class, () -> sastojak.setRb(0));
    }

    
    @Test
    void testSetNaziv() {
        sastojak.setNaziv("Cokolada");
        assertEquals("Cokolada", sastojak.getNaziv());
    }
    
    @Test
    void testSetNazivSaRazmakom() {
        sastojak.setNaziv("Smedji secer");
        assertEquals("Smedji secer", sastojak.getNaziv());
    }

    @Test
    void testSetNazivNull() {
        assertThrows(java.lang.NullPointerException.class, () -> sastojak.setNaziv(null));
    }

    @Test
    void testSetNazivEmpty() {
        assertThrows(java.lang.IllegalArgumentException.class, () -> sastojak.setNaziv(""));
    }

    @Test
    void testSetNazivBlankoZnak() {
        assertThrows(java.lang.IllegalArgumentException.class, () -> sastojak.setNaziv("   "));
    }
    

    @Test
    void testToString() {
        sastojak.setRb(1);
        sastojak.setNaziv("Cokolada");
        
        assertTrue(sastojak.toString().contains("1"));
        assertTrue(sastojak.toString().contains("Cokolada"));
        
    }
}
