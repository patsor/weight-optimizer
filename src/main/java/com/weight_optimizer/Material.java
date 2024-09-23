package com.weight_optimizer;

public class Material {

    private String name;

    public Material(String name) {
        this.name = name;
    }

    public double getDensity() {
        return DensityMap.DENSITIES.get(this.name);
    }
}
