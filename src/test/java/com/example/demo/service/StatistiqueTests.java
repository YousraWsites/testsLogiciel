package com.example.demo.service;

import com.example.demo.data.Voiture;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

public class StatistiqueTests {

    @InjectMocks
    private StatistiqueImpl statistiqueImpl = new StatistiqueImpl();

    public StatistiqueTests() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testAjoutEtCalculPrixMoyen() {
        Voiture v1 = new Voiture("Toyota", 10000);
        Voiture v2 = new Voiture("Renault", 20000);

        statistiqueImpl.ajouter(v1);
        statistiqueImpl.ajouter(v2);

        Echantillon echantillon = statistiqueImpl.prixMoyen();

        assertEquals(2, echantillon.getNombreDeVoitures());
        assertEquals(15000, echantillon.getPrixMoyen());
    }

    @Test
    public void testPrixMoyenSansVoitures() {
        assertThrows(ArithmeticException.class, () -> {
            statistiqueImpl.prixMoyen();
        });
    }
}
