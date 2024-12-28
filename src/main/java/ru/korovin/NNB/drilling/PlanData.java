package ru.korovin.NNB.drilling;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*Класс ru.korovin.NNB.drilling.PlanData - описывает плановые исходные данные
* при наклонно-направленном бурении*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PlanData {
    private double[] depthAlongTheTrunk; //глубина по стволу
    private double[] zenithAngle;        //зенитный угол
    private double[] workingAzimuth;     //рабочий азимут
    private double[] depthAlongVertical; //глубина по вертикали
    private double[] spatialIntensity;   //пространственная интенсивность
    private double[] depthOfMeasures;    //глубина замера
    private double[] depthWithBitEntry;  //глубина с заходом долота
}
