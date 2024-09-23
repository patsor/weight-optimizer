package com.weight_optimizer;

public class Pyramid implements Part, Solid3D {

    private final String name;
    private final Material material;
    private final int length;
    private final int width;
    private final int height;

    public Pyramid(String name, Material material, int length, int width, int height) {
        this.name = name;
        this.material = material;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    private double getTriangleArea(int baseLength, double height) {
        return baseLength * height / 2;
    }

    private double getTriangleHeight(int baseLength, int height) {
        return Math.sqrt(Math.pow(baseLength / 2.0, 2) + Math.pow(height, 2));
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
        return (double) (this.length * this.width * this.height) / 3;
    }

    @Override
    public double getSurfaceArea() {
        double lengthTriangleHeight = getTriangleHeight(this.width, this.height);
        double widthTriangleHeight = getTriangleHeight(this.length, this.height);
        double lengthTriangleArea = getTriangleArea(this.length, lengthTriangleHeight);
        double widthTriangleArea = getTriangleArea(this.width, widthTriangleHeight);
        double lateralSurfaceArea = 2 * lengthTriangleArea + 2 * widthTriangleArea;
        double baseArea = this.length * this.width;
        return lateralSurfaceArea + baseArea;
    }
}
