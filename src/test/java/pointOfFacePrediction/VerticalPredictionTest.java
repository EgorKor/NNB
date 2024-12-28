package pointOfFacePrediction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.korovin.NNB.drilling.predictor.PointOfFaceDrillingPredictor;

public class VerticalPredictionTest {
    @Test
    public void test(){
        PointOfFaceDrillingPredictor predictor = new PointOfFaceDrillingPredictor();
        double Bpred = 169.16;
        double TZF = 175.9;
        double TZ = 169.17;
        double YpredF = 2.6;
        double Ypred = 2.4;
        double UpredF = 0.3;
        double expected = 175.89;
        double actual = predictor.predictVertical(Bpred, TZF, TZ, YpredF, Ypred, UpredF);
        Assertions.assertEquals(expected, actual, 0.1);
    }
}
