package ru.korovin.NNB.drilling.util;

public class MathUtils {
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        double factor = Math.pow(10, places);
        return Math.round(value * factor) / factor;
    }
}
