package equivalent;

public class ClonePair9405 {
    double method1(double d) {
        double[] ICDF_A = {-3.969683028665376e+01, 2.209460984245205e+02, -2.759285104469687e+02, 1.383577518672690e+02, -3.066479806614716e+01, 2.506628277459239e+00};
        double[] ICDF_B = {-5.447609879822406e+01, 1.615858368580409e+02, -1.556989798598866e+02, 6.680131188771972e+01, -1.328068155288572e+01};
        double[] ICDF_C = {-7.784894002430293e-03, -3.223964580411365e-01, -2.400758277161838e+00, -2.549732539343734e+00, 4.374664141464968e+00, 2.938163982698783e+00};
        double[] ICDF_D = {7.784695709041462e-03, 3.224671290700398e-01, 2.445134137142996e+00, 3.754408661907416e+00};
        double P_LOW = 0.02425D;
        double P_HIGH = 1.0D - P_LOW;
        double z = 0;
        if (d == 0) z = Double.NEGATIVE_INFINITY;
        else if (d == 1) z = Double.POSITIVE_INFINITY;
        else if (Double.isNaN(d) || d < 0 || d > 1) z = Double.NaN;
        else if (d < P_LOW) {
            double q = Math.sqrt(-2 * Math.log(d));
            z = (((((ICDF_C[0] * q + ICDF_C[1]) * q + ICDF_C[2]) * q + ICDF_C[3]) * q + ICDF_C[4]) * q + ICDF_C[5]) / ((((ICDF_D[0] * q + ICDF_D[1]) * q + ICDF_D[2]) * q + ICDF_D[3]) * q + 1);
        } else if (P_HIGH < d) {
            double q = Math.sqrt(-2 * Math.log(1 - d));
            z = -(((((ICDF_C[0] * q + ICDF_C[1]) * q + ICDF_C[2]) * q + ICDF_C[3]) * q + ICDF_C[4]) * q + ICDF_C[5]) / ((((ICDF_D[0] * q + ICDF_D[1]) * q + ICDF_D[2]) * q + ICDF_D[3]) * q + 1);
        } else {
            double q = d - 0.5D;
            double r = q * q;
            z = (((((ICDF_A[0] * r + ICDF_A[1]) * r + ICDF_A[2]) * r + ICDF_A[3]) * r + ICDF_A[4]) * r + ICDF_A[5]) * q / (((((ICDF_B[0] * r + ICDF_B[1]) * r + ICDF_B[2]) * r + ICDF_B[3]) * r + ICDF_B[4]) * r + 1);
        }
        return z;
    }

    double method2(double d) {
        double[] ICDF_A = {-3.969683028665376e+01, 2.209460984245205e+02, -2.759285104469687e+02, 1.383577518672690e+02, -3.066479806614716e+01, 2.506628277459239e+00};
        double[] ICDF_B = {-5.447609879822406e+01, 1.615858368580409e+02, -1.556989798598866e+02, 6.680131188771972e+01, -1.328068155288572e+01};
        double[] ICDF_C = {-7.784894002430293e-03, -3.223964580411365e-01, -2.400758277161838e+00, -2.549732539343734e+00, 4.374664141464968e+00, 2.938163982698783e+00};
        double[] ICDF_D = {7.784695709041462e-03, 3.224671290700398e-01, 2.445134137142996e+00, 3.754408661907416e+00};
        double P_LOW = 0.02425D;
        double P_HIGH = 1.0D - P_LOW;
        double z;
        if (d == 0) z = Double.NEGATIVE_INFINITY;
        else if (d == 1) z = Double.POSITIVE_INFINITY;
        else if (Double.isNaN(d) || d < 0 || d > 1) z = Double.NaN;
        else if (d < P_LOW) {
            double q = Math.sqrt(-2 * Math.log(d));
            z = (((((ICDF_C[0] * q + ICDF_C[1]) * q + ICDF_C[2]) * q + ICDF_C[3]) * q + ICDF_C[4]) * q + ICDF_C[5]) / ((((ICDF_D[0] * q + ICDF_D[1]) * q + ICDF_D[2]) * q + ICDF_D[3]) * q + 1);
        } else if (P_HIGH < d) {
            double q = Math.sqrt(-2 * Math.log(1 - d));
            z = -(((((ICDF_C[0] * q + ICDF_C[1]) * q + ICDF_C[2]) * q + ICDF_C[3]) * q + ICDF_C[4]) * q + ICDF_C[5]) / ((((ICDF_D[0] * q + ICDF_D[1]) * q + ICDF_D[2]) * q + ICDF_D[3]) * q + 1);
        } else {
            double q = d - 0.5D;
            double r = q * q;
            z = (((((ICDF_A[0] * r + ICDF_A[1]) * r + ICDF_A[2]) * r + ICDF_A[3]) * r + ICDF_A[4]) * r + ICDF_A[5]) * q / (((((ICDF_B[0] * r + ICDF_B[1]) * r + ICDF_B[2]) * r + ICDF_B[3]) * r + ICDF_B[4]) * r + 1);
        }
        return z;
    }
}
