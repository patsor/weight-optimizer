package com.weight_optimizer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCuboid {

    private Material materialAluminum;
    private Material materialBalsa;
    private Cuboid c1;
    private Cuboid c2;

    @BeforeEach
    public void initMaterials() {
        materialAluminum = new Material("aluminum");
        materialBalsa = new Material("balsa");
        c1 = new Cuboid("C1", materialAluminum, 5, 10, 2);
        c2 = new Cuboid("C2", materialBalsa, 6, 7, 3);
    }

    @Test
    public void testGetVolume() {
        assertEquals(100.0, c1.getVolume());
        assertEquals(126.0, c2.getVolume());
    }

    @Test
    public void testGetWeight() {
        assertEquals(270.0, c1.getWeight());
        assertEquals(20.16, c2.getWeight());
    }

    @Test
    public void testGetSurfaceArea() {
        assertEquals(160.0, c1.getSurfaceArea());
        assertEquals(162.0, c2.getSurfaceArea());
    }
}
