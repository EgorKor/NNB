package ru.korovin.NNB.drilling.predictor;

import static java.lang.Math.*;
import static ru.korovin.NNB.drilling.util.MathUtils.*;

public class PointOfFaceDrillingPredictor {


    public double funcY(
            double pointOfFace,
            double angleFacePredicted,
            double intensityFacePredicted,
            double pointOfMeasure,
            double anglePointOfMeasurePredicted
    ){
        double CX36 = pointOfFace;
        double CY38 = angleFacePredicted;
        double DK38 = intensityFacePredicted;
        double AS40 = pointOfMeasure;
        double AL44 = anglePointOfMeasurePredicted;
        if(DK38 == 0){
            return 0;
        }
        double ratio = ((CY38 * (cos(toRadians(DK38 * (CX36 - AS40) / 10)) -
                cos(toRadians(CY38)) * cos(toRadians(AL44)))) / (sin(toRadians(CY38)) * sin(toRadians(AL44))));
        double correct = ratio - AL44;
        double res = (correct / (DK38 * (CX36 - AS40) / 10));
        double arccosRes = acos(res);
        res = toDegrees(arccosRes);
        return res;
    }

    public double predictAngle(
            double pointOfFace,
            double angleFacePredicted,
            double intensityFacePredicted,
            double pointOfMeasure,
            double anglePointOfMeasurePredicted,
            double target,
            double tolerance
    ){
        double x = angleFacePredicted; // Начальное предположение
        double step = 0.01; // Шаг (можно настроить в зависимости от задачи)
        int maxIterations = 30000; // Лимит итераций, чтобы избежать бесконечного цикла
        int iteration = 0;
        // Пока отклонение больше допустимого или не превышен лимит итераций
        double funcValue = funcY(pointOfFace, x, intensityFacePredicted, pointOfMeasure, anglePointOfMeasurePredicted);
        while (Math.abs(funcValue - target) > tolerance && iteration < maxIterations) {
            // Двигаем "x" в направлении уменьшения отклонения
            if (funcValue > target) {
                x += step;
            } else {
                x -= step;
            }
            iteration++;
            funcValue = funcY(pointOfFace, x, intensityFacePredicted, pointOfMeasure, anglePointOfMeasurePredicted);
        }

        return round(x, 3);
    }

    public double predictAzimuth(
            double intensityFacePredicted,
            double TFFacePredicted,
            double angleFacePredicted,
            double pointOfFace,
            double pointOfMeasure,
            double azimuthPredicted,
            double anglePredicted
    ){
        double DK38 = intensityFacePredicted;
        double AP44 = azimuthPredicted;
        double AL44 = anglePredicted;
        double DO38 = TFFacePredicted;
        double CY38 = angleFacePredicted;
        double CX36 = pointOfFace;
        double AS40 = pointOfMeasure;
        if(DK38 == 0){
            return AP44;
        }
        double cos1 = cos(toRadians(DK38 * (CX36 - AS40) / 10));
        double cos2 = cos(toRadians(CY38 - AL44));
        if(cos1 > 0.999){
            cos1 = 1;
        }
        if(cos2 > 0.999){
            cos2 = 1;
        }
        double upper = cos1 - cos2;
        double down = sin(toRadians(AL44)) * sin(toRadians(CY38));
        double ratio = upper/down;
        double correct = 1 + ratio;
        double acosRes = acos(correct);
        double degrees = toDegrees(acosRes);
        if(DO38 > 180 && DO38 < 360){
            return AP44 - degrees;
        }else{
            return AP44 + degrees;
        }
    }

    public double predictVertical(
            double verticalPredicted,
            double pointOfFace,
            double pointOfMeasure,
            double angleFacePredicted,
            double anglePredicted,
            double intensityFacePredicted
    ){
        double AT44 = verticalPredicted;
        double CX36 = pointOfFace;
        double AS40 = pointOfMeasure;
        double CY38 = angleFacePredicted;
        double AL44 = anglePredicted;
        double DK38 = intensityFacePredicted;
        double upper = AT44+(CX36-AS40)/2*(cos(toRadians(CY38))+cos(toRadians(AL44)));
        double down = 1;
        if(DK38 >= 0.25){
            down = 2/toRadians(DK38)*tan(toRadians(DK38/2));
        }
        return upper/down;
    }

    public double predictSpaceIntensity(
            double slideLength,
            double intensityFact,
            double slideCount,
            double DLcpz,
            double pointOfFace,
            double pointOfMeasurePredicted,
            double pointOfMeasureFact1,
            double pointOfMeasureFact2
    ){
        double AH29 = slideLength;
        double AX32 = intensityFact;
        double DS38 = slideCount;
        double CX36 = pointOfFace;
        double AS40 = pointOfMeasurePredicted;
        double AS29 = pointOfMeasureFact1;
        double AS18 = pointOfMeasureFact2;
        if(AH29 <= 1 || AX32 <= 0.1){
            return DS38 * 0.1 * DLcpz / (CX36 - AS40);
        }
        return DS38 * 0.1 * AX32 / AH29 * (AS29 - AS18) / (CX36 - AS40);
    }

}
