package com.weight_optimizer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSphere {
    private Sphere s1;
    private Sphere s2;

    @BeforeEach
    public void initMaterials() {
        Material materialAluminum = new Material("aluminum");
        Material materialBalsa = new Material("balsa");
        s1 = new Sphere("S1", materialAluminum, 5);
        s2 = new Sphere("S2", materialBalsa, 6);
    }

    @Test
    public void testGetVolume() {
        assertEquals(523.5, s1.getVolume(), 1.5);
        assertEquals(904.608, s2.getVolume(), 1.5);
    }

    @Test
    public void testGetWeight() {
        assertEquals(1413.45, s1.getWeight(), 1.5);
        assertEquals(144.73728, s2.getWeight(), 1.5);
    }

    @Test
    public void testGetSurfaceArea() {
        assertEquals(314.1, s1.getSurfaceArea(), 0.5);
        assertEquals(452.304, s2.getSurfaceArea(), 0.5);
    }
}
