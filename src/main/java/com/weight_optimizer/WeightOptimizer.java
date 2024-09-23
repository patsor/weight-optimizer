
package com.weight_optimizer;

public class WeightOptimizer {

    public static void main(String[] args) {
        Material aluminum = new Material("aluminum");
        Material balsa = new Material("balsa");
        Pipe p1 = new Pipe("Pipe 1", aluminum, 10, 3, 2);
        System.out.println(p1.getWeight());

        Cuboid c1 = new Cuboid("Cube 1", aluminum, 5, 10, 2);
        Cuboid c2 = new Cuboid("Cube 2", balsa, 6, 7, 3);
        System.out.println(c1.getVolume());
        System.out.println(c2.getVolume());

    }
}