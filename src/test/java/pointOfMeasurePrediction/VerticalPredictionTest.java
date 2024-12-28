package pointOfMeasurePrediction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.korovin.NNB.drilling.predictor.PointOfMeasureDrillingPredictor;

public class VerticalPredictionTest {
    @Test
    public void test0(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Ypred = 2.4, Upred = 1.4, TZpred = 169.17, Bfact = 159.9, TZfact = 159.9, Yfact = 1.1;
        //2.4, 1.4, 169.17,159.9,159.9,1.1
        double expected = 169.17;
        double actual = predictor.predictVertical(Ypred, Upred, TZpred, Bfact, TZfact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test1(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Ypred = 0, Upred = 0, TZpred = 0, Bfact = 0, TZfact = 0, Yfact = 0;
        double expected = 0;
        double actual = predictor.predictVertical(Ypred, Upred, TZpred, Bfact, TZfact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test2(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Ypred = 0, Upred = 0, TZpred = 0, Bfact = 0, TZfact = 0, Yfact = 0;
        double expected = 0;
        double actual = predictor.predictVertical(Ypred, Upred, TZpred, Bfact, TZfact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test3(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Ypred = 0, Upred = 0, TZpred = 0, Bfact = 0, TZfact = 0, Yfact = 0;
        double expected = 0;
        double actual = predictor.predictVertical(Ypred, Upred, TZpred, Bfact, TZfact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test4(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Ypred = 0, Upred = 0, TZpred = 0, Bfact = 0, TZfact = 0, Yfact = 0;
        double expected = 0;
        double actual = predictor.predictVertical(Ypred, Upred, TZpred, Bfact, TZfact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test5(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Ypred = 0, Upred = 0, TZpred = 0, Bfact = 0, TZfact = 0, Yfact = 0;
        double expected = 0;
        double actual = predictor.predictVertical(Ypred, Upred, TZpred, Bfact, TZfact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test6(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Ypred = 0, Upred = 0, TZpred = 0, Bfact = 0, TZfact = 0, Yfact = 0;
        double expected = 0;
        double actual = predictor.predictVertical(Ypred, Upred, TZpred, Bfact, TZfact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test7(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Ypred = 0, Upred = 0, TZpred = 0, Bfact = 0, TZfact = 0, Yfact = 0;
        double expected = 0;
        double actual = predictor.predictVertical(Ypred, Upred, TZpred, Bfact, TZfact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test8(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Ypred = 0, Upred = 0, TZpred = 0, Bfact = 0, TZfact = 0, Yfact = 0;
        double expected = 0;
        double actual = predictor.predictVertical(Ypred, Upred, TZpred, Bfact, TZfact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test9(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Ypred = 0, Upred = 0, TZpred = 0, Bfact = 0, TZfact = 0, Yfact = 0;
        double expected = 0;
        double actual = predictor.predictVertical(Ypred, Upred, TZpred, Bfact, TZfact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test10(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Ypred = 0, Upred = 0, TZpred = 0, Bfact = 0, TZfact = 0, Yfact = 0;
        double expected = 0;
        double actual = predictor.predictVertical(Ypred, Upred, TZpred, Bfact, TZfact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test11(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Ypred = 0, Upred = 0, TZpred = 0, Bfact = 0, TZfact = 0, Yfact = 0;
        double expected = 0;
        double actual = predictor.predictVertical(Ypred, Upred, TZpred, Bfact, TZfact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test12(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Ypred = 0, Upred = 0, TZpred = 0, Bfact = 0, TZfact = 0, Yfact = 0;
        double expected = 0;
        double actual = predictor.predictVertical(Ypred, Upred, TZpred, Bfact, TZfact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test13(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Ypred = 0, Upred = 0, TZpred = 0, Bfact = 0, TZfact = 0, Yfact = 0;
        double expected = 0;
        double actual = predictor.predictVertical(Ypred, Upred, TZpred, Bfact, TZfact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test14(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Ypred = 0, Upred = 0, TZpred = 0, Bfact = 0, TZfact = 0, Yfact = 0;
        double expected = 0;
        double actual = predictor.predictVertical(Ypred, Upred, TZpred, Bfact, TZfact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test15(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Ypred = 0, Upred = 0, TZpred = 0, Bfact = 0, TZfact = 0, Yfact = 0;
        double expected = 0;
        double actual = predictor.predictVertical(Ypred, Upred, TZpred, Bfact, TZfact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test16(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Ypred = 0, Upred = 0, TZpred = 0, Bfact = 0, TZfact = 0, Yfact = 0;
        double expected = 0;
        double actual = predictor.predictVertical(Ypred, Upred, TZpred, Bfact, TZfact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test17(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Ypred = 0, Upred = 0, TZpred = 0, Bfact = 0, TZfact = 0, Yfact = 0;
        double expected = 0;
        double actual = predictor.predictVertical(Ypred, Upred, TZpred, Bfact, TZfact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test18(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Ypred = 0, Upred = 0, TZpred = 0, Bfact = 0, TZfact = 0, Yfact = 0;
        double expected = 0;
        double actual = predictor.predictVertical(Ypred, Upred, TZpred, Bfact, TZfact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }
    @Test
    public void test19(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Ypred = 0, Upred = 0, TZpred = 0, Bfact = 0, TZfact = 0, Yfact = 0;
        double expected = 0;
        double actual = predictor.predictVertical(Ypred, Upred, TZpred, Bfact, TZfact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }
    @Test
    public void test20(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Ypred = 0, Upred = 0, TZpred = 0, Bfact = 0, TZfact = 0, Yfact = 0;
        double expected = 0;
        double actual = predictor.predictVertical(Ypred, Upred, TZpred, Bfact, TZfact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }
    @Test
    public void test21(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Ypred = 0, Upred = 0, TZpred = 0, Bfact = 0, TZfact = 0, Yfact = 0;
        double expected = 0;
        double actual = predictor.predictVertical(Ypred, Upred, TZpred, Bfact, TZfact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }
    @Test
    public void test22(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Ypred = 0, Upred = 0, TZpred = 0, Bfact = 0, TZfact = 0, Yfact = 0;
        double expected = 0;
        double actual = predictor.predictVertical(Ypred, Upred, TZpred, Bfact, TZfact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }
    @Test
    public void test23(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Ypred = 0, Upred = 0, TZpred = 0, Bfact = 0, TZfact = 0, Yfact = 0;
        double expected = 0;
        double actual = predictor.predictVertical(Ypred, Upred, TZpred, Bfact, TZfact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }
    @Test
    public void test24(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Ypred = 0, Upred = 0, TZpred = 0, Bfact = 0, TZfact = 0, Yfact = 0;
        double expected = 0;
        double actual = predictor.predictVertical(Ypred, Upred, TZpred, Bfact, TZfact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }
    @Test
    public void test25(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Ypred = 0, Upred = 0, TZpred = 0, Bfact = 0, TZfact = 0, Yfact = 0;
        double expected = 0;
        double actual = predictor.predictVertical(Ypred, Upred, TZpred, Bfact, TZfact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }
    @Test
    public void test26(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Ypred = 0, Upred = 0, TZpred = 0, Bfact = 0, TZfact = 0, Yfact = 0;
        double expected = 0;
        double actual = predictor.predictVertical(Ypred, Upred, TZpred, Bfact, TZfact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }
    @Test
    public void test27(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Ypred = 0, Upred = 0, TZpred = 0, Bfact = 0, TZfact = 0, Yfact = 0;
        double expected = 0;
        double actual = predictor.predictVertical(Ypred, Upred, TZpred, Bfact, TZfact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }
    @Test
    public void test28(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Ypred = 0, Upred = 0, TZpred = 0, Bfact = 0, TZfact = 0, Yfact = 0;
        double expected = 0;
        double actual = predictor.predictVertical(Ypred, Upred, TZpred, Bfact, TZfact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }

    @Test
    public void test29(){
        PointOfMeasureDrillingPredictor predictor = new PointOfMeasureDrillingPredictor();
        double Ypred = 0, Upred = 0, TZpred = 0, Bfact = 0, TZfact = 0, Yfact = 0;
        double expected = 0;
        double actual = predictor.predictVertical(Ypred, Upred, TZpred, Bfact, TZfact, Yfact);
        Assertions.assertEquals(expected, actual, 0.1);
    }
}
