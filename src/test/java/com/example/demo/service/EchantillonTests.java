package com.example.demo.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EchantillonTests {

    @Test
    public void testConstructeurParDefautEtSetters() {
        Echantillon e = new Echantillon();

        e.setNombreDeVoitures(3);
        e.setPrixMoyen(12000);

        assertEquals(3, e.getNombreDeVoitures());
        assertEquals(12000, e.getPrixMoyen());
    }

    @Test
    public void testConstructeurAvecParametres() {
        Echantillon e = new Echantillon(2, 15000);

        assertEquals(2, e.getNombreDeVoitures());
        assertEquals(15000, e.getPrixMoyen());
    }
}
