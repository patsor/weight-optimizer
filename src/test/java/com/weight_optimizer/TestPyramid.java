package com.weight_optimizer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPyramid {
    private Pyramid p1;
    private Pyramid p2;

    @BeforeEach
    public void initMaterials() {
        Material materialAluminum = new Material("aluminum");
        Material materialBalsa = new Material("balsa");
        p1 = new Pyramid("P1", materialAluminum, 5, 10, 2);
        p2 = new Pyramid("P2", materialBalsa, 6, 7, 3);
    }

    @Test
    public void testGetVolume() {
        assertEquals(33.333, p1.getVolume(), 1.5);
        assertEquals(42.0, p2.getVolume(), 1.5);
    }

    @Test
    public void testGetWeight() {
        assertEquals(89.99, p1.getWeight(), 1.5);
        assertEquals(6.72, p2.getWeight(), 1.5);
    }

    @Test
    public void testGetSurfaceArea() {
        assertEquals(108.94, p1.getSurfaceArea(), 0.5);
        assertEquals(99.36, p2.getSurfaceArea(), 0.5);
    }
}
