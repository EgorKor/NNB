package ru.korovin.NNB.drilling;

import java.util.ArrayList;
import java.util.List;


public class DrillingSession {
    private PlanData planData;
    private List<DrillingSingle> drillingSingles;

    public DrillingSession(PlanData planData) {
        drillingSingles = new ArrayList<>();
        this.planData = planData;
    }

    public void addDrillingSingle(DrillingSingle drillingSingle){
        drillingSingles.add(drillingSingle);
    }



}
