package drilling;

import static java.lang.Math.*;

public class DrillingPredictor {

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
        double acosFinal = round(acosValue - angleFact, 2);
        double correction = round(intensityPredicted * (pointOfMeasurePredicted - pointOfMeasureFact) / 10, 2);
        double finalValue = acosFinal / correction;
        double angleDegrees = toDegrees(acos(finalValue));
        return round(angleDegrees,3);
    }


    //функция подбора значения угла отклонителя для достижения нужного значения целевой функции funcY
    public double goalSeekPredictAngle(double predictAngle,
                                       double factAngle,
                                       double factPointOfMeasure,
                                       double predictPointOfMeasure,
                                       double predictIntensity,
                                       double targetValue,
                                       double tolerance) {
        double x = predictAngle; // Начальное предположение
        double step = 0.1; // Шаг (можно настроить в зависимости от задачи)
        int maxIterations = 10000; // Лимит итераций, чтобы избежать бесконечного цикла
        int iteration = 0;
        // Пока отклонение больше допустимого или не превышен лимит итераций
        while (Math.abs(funcY(x, factAngle, factPointOfMeasure, predictPointOfMeasure, predictIntensity) - targetValue) > tolerance && iteration < maxIterations) {
            // Двигаем "x" в направлении уменьшения отклонения
            if (funcY(x, factAngle, factPointOfMeasure, predictPointOfMeasure, predictIntensity) > targetValue) {
                x += step;
            } else {
                x -= step;
            }
            iteration++;
        }

        // Если достигли лимита итераций
        if (iteration == maxIterations) {
            throw new RuntimeException("Goal Seek не смог найти решение за допустимое число итераций.");
        }

        return round(x,3);
    }


    //Метод предсказания азимута для точки замера
    public double predictAzimuthForPointOfMeasure(double intensityPredicted,
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
            return round(azimuthFact - d,3);
        } else {
            return round(azimuthFact + d,3);
        }
    }


    //Метод предсказания вертикали для точки замера
    public double predictVerticalForPointOfMeasure(double anglePredicted,
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
        return round(verticalFact + D / E,3);
    }


    //Метод предсказания пространственной интенсивности для точки замера
    public double predictSpaceIntensityForPointOfMeasure(
            double DLcp,
            double slideLengthPrevSingle,
            double slideLengthThisSingle,
            double pointOfMeasureFact1,
            double pointOfMeasureFact2,
            double pointOfMeasurePredicted,
            double intensityFact
    ) {
        if (slideLengthPrevSingle <= 1 || intensityFact <= 0.1) {
            return round(slideLengthThisSingle * DLcp / (pointOfMeasurePredicted - pointOfMeasureFact2),3);
        } else {
            return round(intensityFact / slideLengthPrevSingle * (pointOfMeasureFact2 - pointOfMeasureFact1) * slideLengthThisSingle
                    / (pointOfMeasurePredicted - pointOfMeasureFact2),3);
        }
    }




    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        double factor = Math.pow(10, places);
        return Math.round(value * factor) / factor;
    }


    //Прогноз следующей точки замера
    public DrillingData predictNextPointOfMeasure(DrillingData fact) {
        return null;
    }
}
