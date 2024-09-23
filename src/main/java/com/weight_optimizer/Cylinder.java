package com.weight_optimizer;

public class Cylinder implements Part, Solid3D {
    private final String name;
    private final Material material;
    private final int height;
    private final int radius;

    public Cylinder(String name, Material material, int height, int radius) {
        this.name = name;
        this.material = material;
        this.height = height;
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
        return getVolume() * this.material.getDensity();
    }

    @Override
    public double getVolume() {
        return Math.PI * this.radius * this.radius * this.height;
    }

    @Override
    public double getSurfaceArea() {
        return (2 * Math.PI * this.radius) * (this.height + this.radius);
    }
}
