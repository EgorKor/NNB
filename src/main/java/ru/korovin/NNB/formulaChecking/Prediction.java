package ru.korovin.NNB.formulaChecking;

import ru.korovin.NNB.drilling.predictor.PointOfMeasureDrillingPredictor;

public class Prediction {
    public static void main(String[] args) {
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        System.out.println("Тестовое предсказание:");
        System.out.printf("%7.2f - целевая функция для подбора угла наклона отклонителя%n",
                predictor.funcY(2.4,1.1,159.9, 169.17, 1.4));
        System.out.printf("%7.3f - предсказание угла наклона отклонителя%n",predictor.predictAngleWithGoalSeek(
                1.1,159.9,169.17, 1.4,0,0.0));
        System.out.printf("%7.2f - предсказание азимута%n",
                predictor.predictAzimuth(
            1.4, 169.17, 0, 2.4, 159.9, 204.1, 1.1
        ));
        System.out.printf("%7.2f - предсказание вертикали %n"
                ,predictor.predictVertical(2.4,1.4, 169.17,159.9,159.9,1.1));
        System.out.printf("%7.2f - предсказание пространственной интенсивности%n",
                predictor.predictSpaceIntensity(5,0,2.6,150.98,159.9,169.17,0.14));
    }
}
