package equivalent;

public class ClonePair113 {
    double method1(double min, double max, double idealStep) {
        if (min > max) {
            double temp = min;
            min = max;
            max = temp;
        }
        if (idealStep == 0) return 0;
        idealStep = Math.abs(idealStep);
        double idealDigit = idealStep;
        while (idealDigit > 10) idealDigit /= 10;
        while (idealDigit < 1) idealDigit *= 10;
        double factor = idealStep / idealDigit;
        factor *= (idealDigit < 1.8) ? 1 : (idealDigit < 2.2) ? 2 : (idealDigit < 3.5) ? 2.5 : (idealDigit < 7.5) ? 5 : 10;
        return factor;
    }

    double method2(double min, double max, double idealStep) {
        if (min > max) {
            double temp = min;
            min = max;
            max = temp;
        }
        if (idealStep == 0) {
            return 0;
        }
        idealStep = Math.abs(idealStep);
        double idealDigit = idealStep;
        while (idealDigit > 10) {
            idealDigit /= 10;
        }
        while (idealDigit < 1) {
            idealDigit *= 10;
        }
        double factor = idealStep / idealDigit;
        factor *= (idealDigit < 1.8) ? 1 : (idealDigit < 2.2) ? 2 : (idealDigit < 3.5) ? 2.5 : (idealDigit < 7.5) ? 5 : 10;
        return factor;
    }
}
