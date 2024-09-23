package com.weight_optimizer;

public class Cone implements Part, Solid3D {

    private final String name;
    private final Material material;
    private final int height;
    private final int radius;

    public Cone(String name, Material material, int height, int radius) {
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
        return this.getVolume() * this.material.getDensity();
    }

    @Override
    public double getVolume() {
        return Math.PI * this.radius * this.radius * this.height;
    }

    @Override
    public double getSurfaceArea() {
        double circleArea = Math.PI * Math.pow(this.radius, 2);
        double coneEdgeLength = Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.radius, 2));
        double lateralSurfaceArea = Math.PI * this.radius * coneEdgeLength;
        return circleArea + lateralSurfaceArea;
    }
}
