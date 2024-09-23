package com.weight_optimizer;

public class Pipe implements Part, Solid3D {

    private final String name;
    private final Material material;
    private final int height;
    private final int outerRadius;
    private final int innerRadius;

    public Pipe(String name, Material material, int height, int outerRadius, int innerRadius) {
        this.name = name;
        this.material = material;
        this.height = height;
        this.outerRadius = outerRadius;
        this.innerRadius = innerRadius;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Material getMaterial() {
        return this.material;
    }

    private double getDensity() {
        return this.material.getDensity();
    }

    @Override
    public double getWeight() {
        return this.getVolume() * getDensity();
    }

    @Override
    public double getVolume() {
        double wallThickness = this.outerRadius - this.innerRadius;
        return Math.PI * wallThickness * wallThickness * this.height;
    }

    @Override
    public double getSurfaceArea() {
        double topBottomSurface = 2 * Math.PI * Math.pow(this.outerRadius - this.innerRadius, 2);
        double roundSurface = this.height * Math.PI * this.outerRadius;
        return topBottomSurface + roundSurface;
    }
}
