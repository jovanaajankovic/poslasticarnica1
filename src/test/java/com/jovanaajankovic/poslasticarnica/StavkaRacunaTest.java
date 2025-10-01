package com.jovanaajankovic.poslasticarnica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StavkaRacunaTest {

    private StavkaRacuna stavkaRacuna;
    private Racun racun;
    private Poslastica poslastica;

    @BeforeEach
    void setUp() throws Exception {
        racun = new Racun();
        poslastica = new Poslastica();
        stavkaRacuna = new StavkaRacuna();
    }

    @AfterEach
    void tearDown() throws Exception {
        stavkaRacuna = null;
        racun = null;
        poslastica = null;
    }
    

    @Test
    void testStavkaRacunaRacunIntIntDoublePoslastica() {
        stavkaRacuna = new StavkaRacuna(racun, 1, 2, 250.0, poslastica);

        assertNotNull(stavkaRacuna);
        assertEquals(racun, stavkaRacuna.getRacun());
        assertEquals(1, stavkaRacuna.getRb());
        assertEquals(2, stavkaRacuna.getKolicina());
        assertEquals(250.0, stavkaRacuna.getCena());
        assertEquals(poslastica, stavkaRacuna.getPoslastica());
    }

    @Test
    void testStavkaRacuna() {
        assertNotNull(stavkaRacuna);
    }

    @Test
    void testSetRacun() {
        stavkaRacuna.setRacun(racun);
        assertEquals(racun, stavkaRacuna.getRacun());
    }

    @Test
    void testSetRacunNull() {
        assertThrows(java.lang.NullPointerException.class, () -> stavkaRacuna.setRacun(null));
    }
    

    @Test
    void testSetRb() {
        stavkaRacuna.setRb(1);
        assertEquals(1, stavkaRacuna.getRb());
    }

    @Test
    void testSetRbNegativan() {
        assertThrows(java.lang.IllegalArgumentException.class, () -> stavkaRacuna.setRb(-1));
    }
    
    @Test
    void testSetRbNula() {
        assertThrows(java.lang.IllegalArgumentException.class, () -> stavkaRacuna.setRb(0));
    }
    

    @Test
    void testSetKolicina() {
        stavkaRacuna.setKolicina(2);
        assertEquals(2, stavkaRacuna.getKolicina());
    }

    @Test
    void testSetKolicinaNula() {
        assertThrows(java.lang.IllegalArgumentException.class, () -> stavkaRacuna.setKolicina(0));
    }
    
    @Test
    void testSetKolicinaNegativna() {
        assertThrows(java.lang.IllegalArgumentException.class, () -> stavkaRacuna.setKolicina(-1));
    }
    

    @Test
    void testSetCena() {
        stavkaRacuna.setCena(250.0);
        assertEquals(250.0, stavkaRacuna.getCena());
    }

    @Test
    void testSetCenaNula() {
        assertThrows(java.lang.IllegalArgumentException.class, () -> stavkaRacuna.setCena(0.0));
    }
    
    @Test
    void testSetCenaNegativna() {
        assertThrows(java.lang.IllegalArgumentException.class, () -> stavkaRacuna.setCena(-250.0));
    }
    

    @Test
    void testSetPoslastica() {
        stavkaRacuna.setPoslastica(poslastica);
        assertEquals(poslastica, stavkaRacuna.getPoslastica());
    }

    @Test
    void testSetPoslasticaNull() {
        assertThrows(java.lang.NullPointerException.class, () -> stavkaRacuna.setPoslastica(null));
    }

}
