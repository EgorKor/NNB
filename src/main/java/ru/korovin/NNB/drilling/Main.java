package ru.korovin.NNB.drilling;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DrillingSession drillingSession = new DrillingSession(PlanDataHelper.generateTestData());
        List<DrillingInterval> firstSingle = new ArrayList<>();
        firstSingle.add(
                DrillingInterval.builder()
                        .startHeight(166.66)
                        .endHeight(169.66)
                        .drillingIntervalType(DrillingIntervalType.OBLIQUELY_DIRECTED)
                        .build()
        );
        firstSingle.add(
                DrillingInterval.builder()
                        .startHeight(169.66)
                        .endHeight(175.90)
                        .drillingIntervalType(DrillingIntervalType.ROTOR)
                        .build()
        );
        drillingSession.addDrillingSingle(new DrillingSingle(firstSingle));
        List<DrillingInterval> secondSingle = new ArrayList<>();
        secondSingle.add(
                DrillingInterval.builder()
                        .startHeight(10)
                        .endHeight(10)
                        .drillingIntervalType(DrillingIntervalType.ROTOR)
                        .build()
        );



    }
}
