package com.weight_optimizer;

public class Cuboid implements Part, Solid3D {

    private final String name;
    private final Material material;
    private final int length;
    private final int width;
    private final int height;

    public Cuboid(String name, Material material, int length, int width, int height) {
        this.name = name;
        this.material = material;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Material getMaterial() {
        return this.material;
    }

    @Override
    public double getWeight() {
        double volume = getVolume();
        return volume * this.material.getDensity();
    }

    @Override
    public double getVolume() {
        return this.length * this.width * this.height;
    }

    @Override
    public double getSurfaceArea() {
        return this.length * this.width * 2 +
                this.length * this.height * 2 +
                this.width * this.height * 2;
    }
}
