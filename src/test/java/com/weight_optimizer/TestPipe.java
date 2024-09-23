package com.weight_optimizer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPipe {
    private Pipe p1;
    private Pipe p2;

    @BeforeEach
    public void initMaterials() {
        Material materialAluminum = new Material("aluminum");
        Material materialBalsa = new Material("balsa");
        p1 = new Pipe("P1", materialAluminum, 5, 10, 8);
        p2 = new Pipe("P2", materialBalsa, 6, 7, 6);
    }

    @Test
    public void getVolume() {
        assertEquals(62.82, p1.getVolume(), 0.5);
        assertEquals(18.846, p2.getVolume(), 0.5);
    }

    @Test
    public void getWeight() {
        assertEquals(169.614, p1.getWeight(), 1.5);
        assertEquals(3.01536, p2.getWeight(), 1.5);
    }

    @Test
    public void getSurfaceArea() {
        assertEquals(182.21, p1.getSurfaceArea(), 2.0);
        assertEquals(138.23, p2.getSurfaceArea(), 2.0);

    }
}
