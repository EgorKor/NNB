package pointOfMeasurePrediction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.korovin.NNB.drilling.predictor.PointOfMeasureDrillingPredictor;

public class TFPredictionTest {
    @Test
    public void test0(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 1.1, TFcur = 0, TFprev = 0, SLcur = 2.6, SLprev = 0;
        double expected = 0;
        double actual = predictor.predictTF(Yfact, TFcur, TFprev, SLcur, SLprev);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test1(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 0, TFcur = 0, TFprev = 0, SLcur = 0, SLprev = 0;
        double expected = 0;
        double actual = predictor.predictTF(Yfact, TFcur, TFprev, SLcur, SLprev);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test2(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 0, TFcur = 0, TFprev = 0, SLcur = 0, SLprev = 0;
        double expected = 0;
        double actual = predictor.predictTF(Yfact, TFcur, TFprev, SLcur, SLprev);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test3(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 0, TFcur = 0, TFprev = 0, SLcur = 0, SLprev = 0;
        double expected = 0;
        double actual = predictor.predictTF(Yfact, TFcur, TFprev, SLcur, SLprev);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test4(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 0, TFcur = 0, TFprev = 0, SLcur = 0, SLprev = 0;
        double expected = 0;
        double actual = predictor.predictTF(Yfact, TFcur, TFprev, SLcur, SLprev);
        Assertions.assertEquals(expected, actual, 0.1);
    }
    @Test
    public void test5(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 0, TFcur = 0, TFprev = 0, SLcur = 0, SLprev = 0;
        double expected = 0;
        double actual = predictor.predictTF(Yfact, TFcur, TFprev, SLcur, SLprev);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test6(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 0, TFcur = 0, TFprev = 0, SLcur = 0, SLprev = 0;
        double expected = 0;
        double actual = predictor.predictTF(Yfact, TFcur, TFprev, SLcur, SLprev);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test7(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 0, TFcur = 0, TFprev = 0, SLcur = 0, SLprev = 0;
        double expected = 0;
        double actual = predictor.predictTF(Yfact, TFcur, TFprev, SLcur, SLprev);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test8(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 0, TFcur = 0, TFprev = 0, SLcur = 0, SLprev = 0;
        double expected = 0;
        double actual = predictor.predictTF(Yfact, TFcur, TFprev, SLcur, SLprev);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test9(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 0, TFcur = 0, TFprev = 0, SLcur = 0, SLprev = 0;
        double expected = 0;
        double actual = predictor.predictTF(Yfact, TFcur, TFprev, SLcur, SLprev);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test10(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 0, TFcur = 0, TFprev = 0, SLcur = 0, SLprev = 0;
        double expected = 0;
        double actual = predictor.predictTF(Yfact, TFcur, TFprev, SLcur, SLprev);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test11(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 0, TFcur = 0, TFprev = 0, SLcur = 0, SLprev = 0;
        double expected = 0;
        double actual = predictor.predictTF(Yfact, TFcur, TFprev, SLcur, SLprev);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test12(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 0, TFcur = 0, TFprev = 0, SLcur = 0, SLprev = 0;
        double expected = 0;
        double actual = predictor.predictTF(Yfact, TFcur, TFprev, SLcur, SLprev);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test13(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 0, TFcur = 0, TFprev = 0, SLcur = 0, SLprev = 0;
        double expected = 0;
        double actual = predictor.predictTF(Yfact, TFcur, TFprev, SLcur, SLprev);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test14(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 0, TFcur = 0, TFprev = 0, SLcur = 0, SLprev = 0;
        double expected = 0;
        double actual = predictor.predictTF(Yfact, TFcur, TFprev, SLcur, SLprev);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test15(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 0, TFcur = 0, TFprev = 0, SLcur = 0, SLprev = 0;
        double expected = 0;
        double actual = predictor.predictTF(Yfact, TFcur, TFprev, SLcur, SLprev);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test16(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 0, TFcur = 0, TFprev = 0, SLcur = 0, SLprev = 0;
        double expected = 0;
        double actual = predictor.predictTF(Yfact, TFcur, TFprev, SLcur, SLprev);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test17(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 0, TFcur = 0, TFprev = 0, SLcur = 0, SLprev = 0;
        double expected = 0;
        double actual = predictor.predictTF(Yfact, TFcur, TFprev, SLcur, SLprev);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test18(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 0, TFcur = 0, TFprev = 0, SLcur = 0, SLprev = 0;
        double expected = 0;
        double actual = predictor.predictTF(Yfact, TFcur, TFprev, SLcur, SLprev);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test19(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 0, TFcur = 0, TFprev = 0, SLcur = 0, SLprev = 0;
        double expected = 0;
        double actual = predictor.predictTF(Yfact, TFcur, TFprev, SLcur, SLprev);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test20(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 0, TFcur = 0, TFprev = 0, SLcur = 0, SLprev = 0;
        double expected = 0;
        double actual = predictor.predictTF(Yfact, TFcur, TFprev, SLcur, SLprev);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test21(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 0, TFcur = 0, TFprev = 0, SLcur = 0, SLprev = 0;
        double expected = 0;
        double actual = predictor.predictTF(Yfact, TFcur, TFprev, SLcur, SLprev);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test22(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 0, TFcur = 0, TFprev = 0, SLcur = 0, SLprev = 0;
        double expected = 0;
        double actual = predictor.predictTF(Yfact, TFcur, TFprev, SLcur, SLprev);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test23(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 0, TFcur = 0, TFprev = 0, SLcur = 0, SLprev = 0;
        double expected = 0;
        double actual = predictor.predictTF(Yfact, TFcur, TFprev, SLcur, SLprev);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test24(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 0, TFcur = 0, TFprev = 0, SLcur = 0, SLprev = 0;
        double expected = 0;
        double actual = predictor.predictTF(Yfact, TFcur, TFprev, SLcur, SLprev);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test25(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 0, TFcur = 0, TFprev = 0, SLcur = 0, SLprev = 0;
        double expected = 0;
        double actual = predictor.predictTF(Yfact, TFcur, TFprev, SLcur, SLprev);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test26(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 0, TFcur = 0, TFprev = 0, SLcur = 0, SLprev = 0;
        double expected = 0;
        double actual = predictor.predictTF(Yfact, TFcur, TFprev, SLcur, SLprev);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test27(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 0, TFcur = 0, TFprev = 0, SLcur = 0, SLprev = 0;
        double expected = 0;
        double actual = predictor.predictTF(Yfact, TFcur, TFprev, SLcur, SLprev);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test28(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 0, TFcur = 0, TFprev = 0, SLcur = 0, SLprev = 0;
        double expected = 0;
        double actual = predictor.predictTF(Yfact, TFcur, TFprev, SLcur, SLprev);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test29(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Yfact = 0, TFcur = 0, TFprev = 0, SLcur = 0, SLprev = 0;
        double expected = 0;
        double actual = predictor.predictTF(Yfact, TFcur, TFprev, SLcur, SLprev);
        Assertions.assertEquals(expected, actual, 0.1);
    }
}
