package inequivalent;

public class ClonePair7156 {

    double method1(int hypLen, double refLen, int[] numNgramMatch, int bleuOrder) {
        if (hypLen <= 0 || refLen <= 0) {
            System.out.println("error: ref or hyp is zero len");
            System.exit(1);
        }
        double res = 0;
        double wt = 1.0 / bleuOrder;
        double prec = 0;
        double smooth_factor = 1.0;
        for (int t = 0; t < bleuOrder && t < hypLen; t++) {
            if (numNgramMatch[t] > 0) {
                prec += wt * Math.log(numNgramMatch[t] * 1.0 / (hypLen - t));
            } else {
                smooth_factor *= 0.5;
                prec += wt * Math.log(smooth_factor / (hypLen - t));
            }
        }
        double bp = (hypLen >= refLen) ? 1.0 : Math.exp(1 - refLen / hypLen);
        res = bp * Math.exp(prec);
        return res;
    }

    double method2(int hypLen, double refLen, int[] numNgramMatches, int bleuOrder) {
        if (hypLen <= 0 || refLen <= 0) {
            System.out.println("error: ref or hyp is zero len");
            System.exit(0);
        }
        double res = 0;
        double wt = 1.0 / bleuOrder;
        double prec = 0;
        double smoothFactor = 1.0;
        for (int t = 0; t < bleuOrder && t < hypLen; t++) {
            if (numNgramMatches[t] > 0) prec += wt * Math.log(numNgramMatches[t] * 1.0 / (hypLen - t));
            else {
                smoothFactor *= 0.5;
                prec += wt * Math.log(smoothFactor / (hypLen - t));
            }
        }
        double bp = (hypLen >= refLen) ? 1.0 : Math.exp(1 - refLen / hypLen);
        res = bp * Math.exp(prec);
        return res;
    }
}
