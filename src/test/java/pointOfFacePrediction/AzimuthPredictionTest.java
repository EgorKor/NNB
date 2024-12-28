package pointOfFacePrediction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.korovin.NNB.drilling.predictor.PointOfFaceDrillingPredictor;

public class AzimuthPredictionTest {
    @Test
    public void test(){
        PointOfFaceDrillingPredictor predictor = new PointOfFaceDrillingPredictor();
        double Upred = 0.3;
        double TFFace = 0;
        double YpredF = 2.6;
        double TZF = 175.9;
        double TZ = 169.17;
        double Apred = 204.1;
        double Ypred = 2.4;
        double actual = predictor.predictAzimuth(Upred, TFFace, YpredF, TZF, TZ, Apred, Ypred);
        double expected = 204.12;
        Assertions.assertEquals(expected, actual, 0.1);
    }
}
