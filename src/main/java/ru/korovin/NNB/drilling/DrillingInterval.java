package ru.korovin.NNB.drilling;

import lombok.Builder;

@Builder
public class DrillingInterval {
    private double startHeight;
    private double endHeight;
    private DrillingIntervalType drillingIntervalType;
}
