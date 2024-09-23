package com.weight_optimizer;

import java.util.Map;

import static java.util.Map.entry;

public enum DensityMap {;

    public static final Map<String, Double> DENSITIES = Map.ofEntries(
            entry("aluminum", 2.7),
            entry("european_chestnut", 0.61),
            entry("balsa", 0.16)
    );


}
