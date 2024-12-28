package pointOfMeasurePrediction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.korovin.NNB.drilling.predictor.PointOfMeasureDrillingPredictor;

public class AzimuthPredictionTest {
    @Test
    public void test0(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Upred = 1.4, TZpred = 169.17, TFpred = 0, Ypred = 2.4,
                TZfact = 159.9, Afact = 204.1,  Yfact = 1.1;
        //1.4, 169.17, 0, 2.4, 159.9, 204.1, 1.1
        double expected = 204.1;
        double actual = predictor.predictAzimuth(Upred, TZpred, TFpred, Ypred, TZfact, Afact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test1(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Upred = 1.21, TZpred = 178.42, TFpred = 0, Ypred = 3.12,
                TZfact = 169.17, Afact = 221.1,  Yfact = 3.3;
        double expected = 221.1;
        double actual = predictor.predictAzimuth(Upred, TZpred, TFpred, Ypred, TZfact, Afact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test2(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Upred = 1.32, TZpred = 187.68, TFpred = 0, Ypred = 4.52,
                TZfact = 178.42, Afact = 212.1,  Yfact = 3.9;
        double expected = 212.1;
        double actual = predictor.predictAzimuth(Upred, TZpred, TFpred, Ypred, TZfact, Afact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1 );
    }

    @Test
    public void test3(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Upred = 0.78, TZpred = 196.97, TFpred = 0, Ypred = 4.63,
                TZfact = 187.68, Afact = 209.1,  Yfact = 5;
        double expected = 209.1;
        double actual = predictor.predictAzimuth(Upred, TZpred, TFpred, Ypred, TZfact, Afact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test4(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Upred = 1.26, TZpred = 206.43, TFpred = 0, Ypred = 4.63,
                TZfact = 196.97, Afact = 204.1,  Yfact = 6.6;
        double expected = 204.1;
        double actual = predictor.predictAzimuth(Upred, TZpred, TFpred, Ypred, TZfact, Afact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test5(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Upred = 1.78, TZpred = 215.49, TFpred = 13, Ypred = 8.22,
                TZfact = 206.43, Afact = 200.1,  Yfact = 7.3;
        double expected = 202.7;
        double actual = predictor.predictAzimuth(Upred, TZpred, TFpred, Ypred, TZfact, Afact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test6(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Upred = 1.4, TZpred = 224.75, TFpred = 28, Ypred = 8.46,
                TZfact = 215.49, Afact = 209.1,  Yfact = 8.1;
        double expected = 213.2;
        double actual = predictor.predictAzimuth(Upred, TZpred, TFpred, Ypred, TZfact, Afact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test7(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Upred = 0.96, TZpred = 234.03, TFpred = 338, Ypred = 8.94,
                TZfact = 224.75, Afact = 212.1,  Yfact = 9.3;
        double expected = 210;
        double actual = predictor.predictAzimuth(Upred, TZpred, TFpred, Ypred, TZfact, Afact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test8(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Upred = 1.34, TZpred = 243.29, TFpred = 347, Ypred = 10.51,
                TZfact = 234.03, Afact = 210.1,  Yfact = 10.5;
        double expected = 208.6;
        double actual = predictor.predictAzimuth(Upred, TZpred, TFpred, Ypred, TZfact, Afact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test9(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Upred = 1.31, TZpred = 252.56, TFpred = 350, Ypred = 11.7,
                TZfact = 243.29, Afact = 209.1,  Yfact = 11.6;
        double expected = 208.1;
        double actual = predictor.predictAzimuth(Upred, TZpred, TFpred, Ypred, TZfact, Afact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test10(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Upred = 1.2, TZpred = 261.88, TFpred = 350, Ypred = 12.7,
                TZfact = 252.56, Afact = 208.1,  Yfact = 12.5;
        double expected = 207.2;
        double actual = predictor.predictAzimuth(Upred, TZpred, TFpred, Ypred, TZfact, Afact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test11(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Upred = 0.96, TZpred = 271.16, TFpred = 359, Ypred = 13.39,
                TZfact = 261.88, Afact = 209.1,  Yfact = 13.7;
        double expected = 209.1;
        double actual = predictor.predictAzimuth(Upred, TZpred, TFpred, Ypred, TZfact, Afact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test12(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Upred = 1.32, TZpred = 280.44, TFpred = 0, Ypred = 14.92,
                TZfact = 271.16, Afact = 210.1,  Yfact = 14.8;
        double expected = 210.1;
        double actual = predictor.predictAzimuth(Upred, TZpred, TFpred, Ypred, TZfact, Afact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test13(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Upred = 1.15, TZpred = 289.64, TFpred = 342, Ypred = 15.81,
                TZfact = 280.44, Afact = 210.1,  Yfact = 16.3;
        double expected = 208.9;
        double actual = predictor.predictAzimuth(Upred, TZpred, TFpred, Ypred, TZfact, Afact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test14(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Upred = 1.9, TZpred = 298.9, TFpred = 357, Ypred = 18.06,
                TZfact = 289.64, Afact = 207.1,  Yfact = 17.5;
        double expected = 206.8;
        double actual = predictor.predictAzimuth(Upred, TZpred, TFpred, Ypred, TZfact, Afact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }
    @Test
    public void test15(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Upred = 1.49, TZpred = 308.17, TFpred = 0, Ypred = 18.88,
                TZfact = 298.9, Afact = 209.1,  Yfact = 18.6;
        double expected = 209.1;
        double actual = predictor.predictAzimuth(Upred, TZpred, TFpred, Ypred, TZfact, Afact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test16(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Upred = 1.19, TZpred = 317.43, TFpred = 351, Ypred = 19.69,
                TZfact = 308.17, Afact = 210.1,  Yfact = 19.7;
        double expected = 209.6;
        double actual = predictor.predictAzimuth(Upred, TZpred, TFpred, Ypred, TZfact, Afact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test17(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Upred = 1.38, TZpred = 326.74, TFpred = 332, Ypred = 20.84,
                TZfact = 317.43, Afact = 208.1,  Yfact = 20.5;
        double expected = 206.4;
        double actual = predictor.predictAzimuth(Upred, TZpred, TFpred, Ypred, TZfact, Afact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test18(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Upred = 0.94, TZpred = 336.02, TFpred = 348, Ypred = 21.35,
                TZfact = 326.74, Afact = 207.1,  Yfact = 21.6;
        double expected = 206.6;
        double actual = predictor.predictAzimuth(Upred, TZpred, TFpred, Ypred, TZfact, Afact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test19(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Upred = 1.66, TZpred = 345.3, TFpred = 350, Ypred = 23.12,
                TZfact = 336.02, Afact = 204.1,  Yfact = 23.1;
        double expected = 203.4;
        double actual = predictor.predictAzimuth(Upred, TZpred, TFpred, Ypred, TZfact, Afact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }
    @Test
    public void test20(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Upred = 1.81, TZpred = 354.58, TFpred = 26, Ypred = 24.62,
                TZfact = 345.3, Afact = 206.1,  Yfact = 23.1;
        double expected = 203.4;
        double actual = predictor.predictAzimuth(Upred, TZpred, TFpred, Ypred, TZfact, Afact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test21(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Upred = 1.16, TZpred = 368.84, TFpred = 21, Ypred = 25.11,
                TZfact = 354.58, Afact = 207.1,  Yfact = 25.6;
        double expected = 208;
        double actual = predictor.predictAzimuth(Upred, TZpred, TFpred, Ypred, TZfact, Afact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test22(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Upred = 1.8, TZpred = 373.08, TFpred = 2, Ypred = 27.26,
                TZfact = 368.84, Afact = 205.1,  Yfact = 26.1;
        double expected = 205.1;
        double actual = predictor.predictAzimuth(Upred, TZpred, TFpred, Ypred, TZfact, Afact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test23(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Upred = 1.62, TZpred = 382.36, TFpred = 9, Ypred = 27.58,
                TZfact = 373.08, Afact = 208.1,  Yfact = 27.7;
        double expected = 208.6;
        double actual = predictor.predictAzimuth(Upred, TZpred, TFpred, Ypred, TZfact, Afact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test24(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Upred = 1.91, TZpred = 391.65, TFpred = 352, Ypred = 29.46,
                TZfact = 382.36, Afact = 210.1,  Yfact = 29.1;
        double expected = 209.6;
        double actual = predictor.predictAzimuth(Upred, TZpred, TFpred, Ypred, TZfact, Afact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test25(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Upred = 1.51, TZpred = 400.94, TFpred = 346, Ypred = 30.46,
                TZfact = 391.65, Afact = 210.1,  Yfact = 30.3;
        double expected = 209.4;
        double actual = predictor.predictAzimuth(Upred, TZpred, TFpred, Ypred, TZfact, Afact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test26(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Upred = 1.63, TZpred = 410.15, TFpred = 345, Ypred = 31.75,
                TZfact = 400.94, Afact = 208.1,  Yfact = 31.1;
        double expected = 207.4;
        double actual = predictor.predictAzimuth(Upred, TZpred, TFpred, Ypred, TZfact, Afact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test27(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Upred = 0.84, TZpred = 419.41, TFpred = 357, Ypred = 31.88,
                TZfact = 410.15, Afact = 209.1,  Yfact = 31.9;
        double expected = 209.1;
        double actual = predictor.predictAzimuth(Upred, TZpred, TFpred, Ypred, TZfact, Afact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test28(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Upred = 0.71, TZpred = 428.67, TFpred = 0, Ypred = 32.56,
                TZfact = 419.41, Afact = 209.1,  Yfact = 31.9;
        double expected = 209.1;
        double actual = predictor.predictAzimuth(Upred, TZpred, TFpred, Ypred, TZfact, Afact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test29(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Upred = 0.51, TZpred = 0, TFpred = 32.58, Ypred = 428.67,
                TZfact = 419.41, Afact = 209.1,  Yfact = 31.9;
        double expected = 209.1;
        double actual = predictor.predictAzimuth(Upred, TZpred, TFpred, Ypred, TZfact, Afact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

}
