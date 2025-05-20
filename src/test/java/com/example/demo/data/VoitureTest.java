package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture(){
        assertEquals(1,1);
    }
    @Test
    public void testConstructeurAvecParametres() {
        Voiture v = new Voiture("Toyota", 15000);
        assertEquals("Toyota", v.getMarque());
        assertEquals(15000, v.getPrix());
    }

    @Test
    public void testConstructeurSansParametres() {
        Voiture v = new Voiture();
        assertNull(v.getMarque());
        assertEquals(0, v.getPrix());
    }

    @Test
    public void testSetEtGetMarque() {
        Voiture v = new Voiture();
        v.setMarque("Renault");
        assertEquals("Renault", v.getMarque());
    }

    @Test
    public void testSetEtGetPrix() {
        Voiture v = new Voiture();
        v.setPrix(12000);
        assertEquals(12000, v.getPrix());
    }

    @Test
    public void testSetEtGetId() {
        Voiture v = new Voiture();
        v.setId(42);
        assertEquals(42, v.getId());
    }

    @Test
    public void testToString() {
        Voiture v = new Voiture("Peugeot", 10000);
        v.setId(1);
        String attendu = "Car{marque='Peugeot', prix=10000, id=1}";
        assertEquals(attendu, v.toString());
    }


}
