package com.weight_optimizer;

public class Sphere implements Part, Solid3D {

    private final String name;
    private final Material material;
    private final int radius;

    public Sphere(String name, Material material, int radius) {
        this.name = name;
        this.material = material;
        this.radius = radius;
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
        return this.getVolume() * this.material.getDensity();
    }

    @Override
    public double getVolume() {
        return 4.0 / 3.0 * Math.PI * Math.pow(this.radius, 3);
    }

    @Override
    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(this.radius, 2);
    }
}
