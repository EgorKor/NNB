package ru.korovin.NNB.drilling;

import lombok.Value;

import java.util.List;

@Value
public class DrillingSingle {
    List<DrillingInterval> drillingIntervalList;
}