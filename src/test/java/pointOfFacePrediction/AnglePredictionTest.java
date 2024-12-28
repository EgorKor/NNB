package pointOfFacePrediction;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.korovin.NNB.drilling.predictor.PointOfFaceDrillingPredictor;

public class AnglePredictionTest {
    @Test
    public void test(){
        PointOfFaceDrillingPredictor predictor = new PointOfFaceDrillingPredictor();
        double TZF = 175.9, YpredZ = 2.4, UpredZ = 0.3, TZ = 169.17, Ypred = 2.4, target = 0;
        double expected = 2.6;
        double actual = predictor.predictAngle(TZF, YpredZ, UpredZ, TZ, Ypred, target, 0.1);
        Assertions.assertEquals(expected, actual, 0.1);
    }
}
