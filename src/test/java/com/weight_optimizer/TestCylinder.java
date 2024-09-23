package com.weight_optimizer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCylinder {

    private Cylinder c1;
    private Cylinder c2;

    @BeforeEach
    public void initMaterials() {
        Material materialAluminum = new Material("aluminum");
        Material materialBalsa = new Material("balsa");
        c1 = new Cylinder("C1", materialAluminum, 5, 10);
        c2 = new Cylinder("C2", materialBalsa, 6, 7);
    }

    @Test
    public void getVolume() {
        assertEquals(1570.5, c1.getVolume(), 0.5);
        assertEquals(923.454, c2.getVolume(), 0.5);
    }

    @Test
    public void getWeight() {
        assertEquals(4240.35, c1.getWeight(), 1.5);
        assertEquals(147.75, c2.getWeight(), 1.5);
    }

    @Test
    public void getSurfaceArea() {
        assertEquals(942.3, c1.getSurfaceArea(), 2.0);
        assertEquals(571.662, c2.getSurfaceArea(), 2.0);

    }
}
