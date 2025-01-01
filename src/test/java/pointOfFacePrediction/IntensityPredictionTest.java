package pointOfFacePrediction;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.korovin.NNB.drilling.predictor.PointOfFaceDrillingPredictor;

public class IntensityPredictionTest {
    @Test
    public void test(){
        PointOfFaceDrillingPredictor predictor = new PointOfFaceDrillingPredictor();
        double SLfact = 0;
        double Ufact = 0.44;
        double SLcnt = 4;
        double DLcpz = 5;
        double TZF = 175.9;
        double TZpred = 169.17;
        double TZfact1 = 150.66;
        double TZfact2 = 159.9;
        double expected = 0.3;
        double actual = predictor.predictSpaceIntensity(SLfact, Ufact, SLcnt, DLcpz, TZF, TZpred, TZfact1, TZfact2);
        Assertions.assertEquals(expected, actual, 0.05);
    }
}
