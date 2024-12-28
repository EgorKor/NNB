package pointOfMeasurePrediction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.korovin.NNB.drilling.predictor.PointOfMeasureDrillingPredictor;

public class AnglePredictionTest {

    @Test
    void test0(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 1.1;
        double TZfact = 159.9;
        double TZpred = 169.17;
        double Ipred = 1.4;
        double target = 0;
        double tolerance = 0;
        double expected = 2.4;
        double actual = predictor.predictAngleWithGoalSeek(Yfact, TZfact, TZpred, Ipred, target, tolerance);
        Assertions.assertEquals(expected, actual, 0.05);
    }

    @Test
    void test1(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 2;
        double TZfact = 169.17;
        double TZpred = 178.42;
        double Ipred = 1.21;
        double target = 0;
        double tolerance = 0;
        double expected = 3.12;
        double actual = predictor.predictAngleWithGoalSeek(Yfact, TZfact, TZpred, Ipred, target, tolerance);
        Assertions.assertEquals(expected, actual, 0.05);
    }

    @Test
    void test2(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 3.3;
        double TZfact = 178.42;
        double TZpred = 187.68;
        double Ipred = 1.32;
        double target = 0;
        double tolerance = 0;
        double expected = 4.52;
        double actual = predictor.predictAngleWithGoalSeek(Yfact, TZfact, TZpred, Ipred, target, tolerance);
        Assertions.assertEquals(expected, actual, 0.05);
    }

    @Test
    void test3(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 3.9;
        double TZfact = 187.68;
        double TZpred = 196.67;
        double Ipred = 0.78;
        double target = 0;
        double tolerance = 0;
        double expected = 4.63;
        double actual = predictor.predictAngleWithGoalSeek(Yfact, TZfact, TZpred, Ipred, target, tolerance);
        Assertions.assertEquals(expected, actual, 0.05);
    }

    @Test
    void test4(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 5;
        double TZfact = 196.97;
        double TZpred = 206.23;
        double Ipred = 1.26;
        double target = 0;
        double tolerance = 0;
        double expected = 6.17;
        double actual = predictor.predictAngleWithGoalSeek(Yfact, TZfact, TZpred, Ipred, target, tolerance);
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    void test5(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 6.6;
        double TZfact = 206.23;
        double TZpred = 215.49;
        double Ipred = 1.78;
        double target = 13;
        double tolerance = 0.01;
        double expected = 8.22;
        double actual = predictor.predictAngleWithGoalSeek(Yfact, TZfact, TZpred, Ipred, target, tolerance);
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    void test6(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 7.3;
        double TZfact = 215.49;
        double TZpred = 224.75;
        double Ipred = 1.4;
        double target = 28;
        double tolerance = 0.01;
        double expected = 8.46;
        double actual = predictor.predictAngleWithGoalSeek(Yfact, TZfact, TZpred, Ipred, target, tolerance);
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    void test7(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 8.1;
        double TZfact = 224.75;
        double TZpred = 234.03;
        double Ipred = 0.96;
        double target = 22;
        double tolerance = 0.01;
        double expected = 8.94;
        double actual = predictor.predictAngleWithGoalSeek(Yfact, TZfact, TZpred, Ipred, target, tolerance);
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    void test8(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 9.3;
        double TZfact = 234.03;
        double TZpred = 243.29;
        double Ipred = 1.34;
        double target = 12.67;
        double tolerance = 0.01;
        double expected = 10.51;
        double actual = predictor.predictAngleWithGoalSeek(Yfact, TZfact, TZpred, Ipred, target, tolerance);
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    void test9(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 10.5;
        double TZfact = 243.29;
        double TZpred = 252.56;
        double Ipred = 1.31;
        double target = 10;
        double tolerance = 0.01;
        double expected = 11.7;
        double actual = predictor.predictAngleWithGoalSeek(Yfact, TZfact, TZpred, Ipred, target, tolerance);
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    void test10(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 11.6;
        double TZfact = 252.56;
        double TZpred = 261.88;
        double Ipred = 1.2;
        double target = 10;
        double tolerance = 0.01;
        double expected = 12.7;
        double actual = predictor.predictAngleWithGoalSeek(Yfact, TZfact, TZpred, Ipred, target, tolerance);
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    void test11(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 12.5;
        double TZfact = 261.88;
        double TZpred = 271.16;
        double Ipred = 0.96;
        double target = 1.03;
        double tolerance = 0.01;
        double expected = 13.39;
        double actual = predictor.predictAngleWithGoalSeek(Yfact, TZfact, TZpred, Ipred, target, tolerance);
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    void test12(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 13.7;
        double TZfact = 271.16;
        double TZpred = 280.44;
        double Ipred = 1.32;
        double target = 0;
        double tolerance = 0.01;
        double expected = 14.92;
        double actual = predictor.predictAngleWithGoalSeek(Yfact, TZfact, TZpred, Ipred, target, tolerance);
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    void test13(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 14.8;
        double TZfact = 280.44;
        double TZpred = 289.64;
        double Ipred = 1.15;
        double target = 17.86;
        double tolerance = 0.01;
        double expected = 15.81;
        double actual = predictor.predictAngleWithGoalSeek(Yfact, TZfact, TZpred, Ipred, target, tolerance);
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    void test14(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 16.3;
        double TZfact = 289.64;
        double TZpred = 298.9;
        double Ipred = 1.9;
        double target = 2.76;
        double tolerance = 0.01;
        double expected = 18.06;
        double actual = predictor.predictAngleWithGoalSeek(Yfact, TZfact, TZpred, Ipred, target, tolerance);
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    void test15(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 17.5;
        double TZfact = 298.9;
        double TZpred = 308.17;
        double Ipred = 1.49;
        double target = 0;
        double tolerance = 0.01;
        double expected = 18.89;
        double actual = predictor.predictAngleWithGoalSeek(Yfact, TZfact, TZpred, Ipred, target, tolerance);
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    void test16(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 18.6;
        double TZfact = 308.17;
        double TZpred = 317.43;
        double Ipred = 1.19;
        double target = 8.97;
        double tolerance = 0;
        double expected = 19.69;
        double actual = predictor.predictAngleWithGoalSeek(Yfact, TZfact, TZpred, Ipred, target, tolerance);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    void test17(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 19.7;
        double TZfact = 317.43;
        double TZpred = 326.74;
        double Ipred = 1.38;
        double target = 27.93;
        double tolerance = 0.01;
        double expected = 20.84;
        double actual = predictor.predictAngleWithGoalSeek(Yfact, TZfact, TZpred, Ipred, target, tolerance);
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    void test18(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 20.5;
        double TZfact = 326.74;
        double TZpred = 336.02;
        double Ipred = 0.94;
        double target = 12.07;
        double tolerance = 0.01;
        double expected = 21.35;
        double actual = predictor.predictAngleWithGoalSeek(Yfact, TZfact, TZpred, Ipred, target, tolerance);
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    void test19(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 21.6;
        double TZfact = 336.02;
        double TZpred = 345.3;
        double Ipred = 1.66;
        double target = 10;
        double tolerance = 0.01;
        double expected = 23.12;
        double actual = predictor.predictAngleWithGoalSeek(Yfact, TZfact, TZpred, Ipred, target, tolerance);
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    void test20(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 23.1;
        double TZfact = 345.3;
        double TZpred = 354.58;
        double Ipred = 1.81;
        double target = 25.86;
        double tolerance = 0.01;
        double expected = 24.62;
        double actual = predictor.predictAngleWithGoalSeek(Yfact, TZfact, TZpred, Ipred, target, tolerance);
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    void test21(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 24.1;
        double TZfact = 354.58;
        double TZpred = 363.84;
        double Ipred = 1.16;
        double target = 21.03;
        double tolerance = 0.01;
        double expected = 25.11;
        double actual = predictor.predictAngleWithGoalSeek(Yfact, TZfact, TZpred, Ipred, target, tolerance);
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    void test22(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 25.6;
        double TZfact = 363.84;
        double TZpred = 373.08;
        double Ipred = 1.8;
        double target = 2.14;
        double tolerance = 0.01;
        double expected = 27.26;
        double actual = predictor.predictAngleWithGoalSeek(Yfact, TZfact, TZpred, Ipred, target, tolerance);
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    void test23(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 26.1;
        double TZfact = 373.08;
        double TZpred = 382.36;
        double Ipred = 1.62;
        double target = 8.67;
        double tolerance = 0.01;
        double expected = 27.58;
        double actual = predictor.predictAngleWithGoalSeek(Yfact, TZfact, TZpred, Ipred, target, tolerance);
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    void test24(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 27.7;
        double TZfact = 382.36;
        double TZpred = 391.65;
        double Ipred = 1.91;
        double target = 7.93;
        double tolerance = 0.01;
        double expected = 29.46;
        double actual = predictor.predictAngleWithGoalSeek(Yfact, TZfact, TZpred, Ipred, target, tolerance);
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    void test25(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 29.1;
        double TZfact = 391.65;
        double TZpred = 400.94;
        double Ipred = 1.51;
        double target = 14.48;
        double tolerance = 0.01;
        double expected = 30.46;
        double actual = predictor.predictAngleWithGoalSeek(Yfact, TZfact, TZpred, Ipred, target, tolerance);
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    void test26(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 30.3;
        double TZfact = 400.94;
        double TZpred = 410.15;
        double Ipred = 1.63;
        double target = 15;
        double tolerance = 0.01;
        double expected = 31.75;
        double actual = predictor.predictAngleWithGoalSeek(Yfact, TZfact, TZpred, Ipred, target, tolerance);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    void test27(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 31.1;
        double TZfact = 410.15;
        double TZpred = 419.41;
        double Ipred = 0.84;
        double target = 2.61;
        double tolerance = 0.01;
        double expected = 31.88;
        double actual = predictor.predictAngleWithGoalSeek(Yfact, TZfact, TZpred, Ipred, target, tolerance);
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    void test28(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 31.9;
        double TZfact = 419.41;
        double TZpred = 428.67;
        double Ipred = 0.71;
        double target = 0;
        double tolerance = 0.01;
        double expected = 32.56;
        double actual = predictor.predictAngleWithGoalSeek(Yfact, TZfact, TZpred, Ipred, target, tolerance);
        Assertions.assertEquals(expected, actual, 0.01);
    }

    @Test
    void test29(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 31.9;
        double TZfact = 419.41;
        double TZpred = 437.95;
        double Ipred = 0.51;
        double target = 0;
        double tolerance = 0.01;
        double expected = 32.85;
        double actual = predictor.predictAngleWithGoalSeek(Yfact, TZfact, TZpred, Ipred, target, tolerance);
        Assertions.assertEquals(expected, actual, 0.01);
    }


}
