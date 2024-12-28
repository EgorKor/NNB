package ru.korovin.NNB.drilling.predictor;

import static java.lang.Math.*;
import static ru.korovin.NNB.drilling.util.MathUtils.*;
public class PointOfMeasureDrillingPredictor {

    //функция значение которой нужно найти для входного параметра предсказываемого угла
    public double funcY(double anglePredicted,
                        double angleFact,
                        double pointOfMeasureFact,
                        double pointOfMeasurePredicted,
                        double intensityPredicted) {
        if (anglePredicted == 0) {
            return 0;
        }
        double R1 = toRadians(intensityPredicted * (pointOfMeasurePredicted - pointOfMeasureFact) / 10);
        double R2 = toRadians(anglePredicted);
        double R3 = toRadians(angleFact);
        double C1 = cos(R1);
        double C2 = cos(R2);
        double C3 = cos(R3);
        double S2 = sin(R2);
        double S3 = sin(R3);
        double numerator = anglePredicted * (C1 - C2 * C3);
        double denominator = S2 * S3;
        double acosValue = numerator / denominator;
        double acosFinal = round(acosValue - angleFact, 3);
        double correction = round(intensityPredicted * (pointOfMeasurePredicted - pointOfMeasureFact) / 10, 3);
        double finalValue = acosFinal / correction;
        double angleDegrees = toDegrees(acos(finalValue));
        return round(angleDegrees, 3);
    }


    //функция подбора значения угла отклонителя для достижения нужного значения целевой функции funcY
    public double predictAngleWithGoalSeek(double factAngle,
                                           double factPointOfMeasure,
                                           double predictPointOfMeasure,
                                           double predictIntensity,
                                           double targetValue,
                                           double tolerance) {
        double x = factAngle; // Начальное предположение
        double step = 0.01; // Шаг (можно настроить в зависимости от задачи)
        int maxIterations = 30000; // Лимит итераций, чтобы избежать бесконечного цикла
        int iteration = 0;
        // Пока отклонение больше допустимого или не превышен лимит итераций
        double funcValue = funcY(x, factAngle, factPointOfMeasure, predictPointOfMeasure, predictIntensity);
        while (Math.abs(funcValue - targetValue) > tolerance && iteration < maxIterations) {
            // Двигаем "x" в направлении уменьшения отклонения
            if (funcValue > targetValue) {
                x += step;
            } else {
                x -= step;
            }
            iteration++;
            funcValue = funcY(x, factAngle, factPointOfMeasure, predictPointOfMeasure, predictIntensity);
        }

        return round(x, 3);
    }


    //Метод предсказания азимута для точки замера
    public double predictAzimuth(double intensityPredicted,
                                 double pointOfMeasurePredicted,
                                 double tfPredicted,
                                 double anglePredicted,
                                 double pointOfMeasureFact,
                                 double azimuthFact,
                                 double angleFact) {
        if (intensityPredicted == 0) {
            return azimuthFact;
        }
        double a = intensityPredicted * (pointOfMeasurePredicted - pointOfMeasureFact) / 10;
        double b = anglePredicted - angleFact;
        double c = 1 + (cos(toRadians(a)) - cos(toRadians(b)))
                / (sin(toRadians(angleFact)) * sin(toRadians(anglePredicted)));
        c = min(c, 1.0);
        double d = acos(c);

        if (tfPredicted > 180 && tfPredicted < 360) {
            return round(azimuthFact - d, 3);
        } else {
            return round(azimuthFact + d, 3);
        }
    }


    //Метод предсказания вертикали для точки замера
    public double predictVertical(double anglePredicted,
                                  double intensityPredicted,
                                  double pointOfMeasurePredicted,
                                  double verticalFact,
                                  double pointOfMeasureFact,
                                  double angleFact) {
        double B = (pointOfMeasurePredicted - pointOfMeasureFact) / 2;
        double C1 = cos(toRadians(anglePredicted));
        double C2 = cos(toRadians(angleFact));
        double C = C1 + C2;
        double D = B * C;
        double E = 1;
        if (intensityPredicted >= 0.25) {
            E = 2 / toRadians(intensityPredicted) * tan(toRadians(intensityPredicted / 2));
        }
        return round(verticalFact + D / E, 3);
    }


    //Метод предсказания пространственной интенсивности для точки замера
    public double predictSpaceIntensity(
            double DLcp,
            double slideLengthPrevSingle,
            double slideLengthThisSingle,
            double pointOfMeasureFact1,
            double pointOfMeasureFact2,
            double pointOfMeasurePredicted,
            double intensityFact
    ) {
        if (slideLengthPrevSingle <= 1 || intensityFact <= 0.1) {
            return round(slideLengthThisSingle * DLcp / (pointOfMeasurePredicted - pointOfMeasureFact2), 3);
        } else {
            return round(intensityFact / slideLengthPrevSingle * (pointOfMeasureFact2 - pointOfMeasureFact1) * slideLengthThisSingle
                    / (pointOfMeasurePredicted - pointOfMeasureFact2), 3);
        }
    }


    public double predictTF(Double angleFact,
                            double averageToolFaceCur,
                            double averageToolFacePrev,
                            double slideLengthFromPointToPointCur,
                            double slideLengthFromPointToPointPrev

    ) {
        double DQ40 = averageToolFaceCur;
        double DQ29 = averageToolFacePrev;
        double DS40 = slideLengthFromPointToPointCur;
        double DS29 = slideLengthFromPointToPointPrev;
        double res = 0;
        if (angleFact == null) {
            res = averageToolFaceCur;
        }else {
            if (abs(DQ29 - DQ40) > 180) {
                if ((DQ29 >= DQ40 && DS29 >= DS40) || (DQ29 >= DQ40 && DS29 <= DS40)) {
                    res = ((DQ29 - 360) * DS29 + DQ40 * DS40) / (DS40 + DS29);
                } else {
                    res = (DQ29 * DS29 + (DQ40 - 360) * DS40) / (DS40 + DS29);
                }

            } else {
                res = (DQ29 * DS29 + DQ40 * DS40) / (DS40 + DS29);
            }
        }
        return res < 0 ? res + 360: res;
    }



}
