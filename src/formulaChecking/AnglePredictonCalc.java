package formulaChecking;

import static java.lang.Math.*;

public class AnglePredictonCalc {
    public static void main(String[] args) {
        double X = 1.1;
        double Y = 159.9;
        double TZ2 = 169.17;
        double predictIntensity = 1.4;
        double predictAngle = 2.4;
        double R1 = toRadians(predictIntensity * (TZ2 - Y)/10);
        double R2 = toRadians(predictAngle);
        double R3 = toRadians(X);
        double C1 = cos(R1);
        double C2 = cos(R2);
        double C3 = cos(R3);
        double S2 = sin(R2);
        double S3 = sin(R3);
        double numerator = predictAngle * (C1 - C2 * C3);
        double denominator = S2 * S3;
        double acosValue = numerator / denominator;
        double acosFinal = round(acosValue - X,2);
        double correction = round(predictIntensity * (TZ2 - Y)/10,2);
        double finalValue = acosFinal/correction;
        double angleDegrees = toDegrees(acos(finalValue));
        System.out.println(angleDegrees);
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        double factor = Math.pow(10, places);
        return Math.round(value * factor) / factor;
    }
}
