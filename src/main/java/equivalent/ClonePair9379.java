package equivalent;

public class ClonePair9379 {
    double method1(double[] c, int nDataLength, double z, double fTolerance) {
        double cc = 0.0;
        int nHorizon = nDataLength;
        if (fTolerance > 0.0) {
            nHorizon = (int) Math.ceil(Math.log(fTolerance) / Math.log(Math.abs(z)));
        }
        if (nHorizon < nDataLength) {
            double zn = z;
            double sum = c[0];
            for (int n = 1; n < nHorizon; n++) {
                sum += zn * c[n];
                zn *= z;
            }
            cc = sum;
        } else {
            double zn = z;
            double iz = 1.0 / z;
            double z2n = Math.pow(z, nDataLength - 1);
            double sum = c[0] + z2n * c[nDataLength - 1];
            z2n *= z2n * iz;
            for (int n = 1; n <= nDataLength - 2L; n++) {
                sum += (zn + z2n) * c[n];
                zn *= z;
                z2n *= iz;
            }
            cc = (sum / (1.0 - zn * zn));
        }
        return cc;
    }

    double method2(double[] c, int nDataLength, double z, double fTolerance) {
        double sum, zn, z2n, iz;
        int nHorizon = nDataLength;
        if (fTolerance > 0.0) {
            nHorizon = (int) Math.ceil(Math.log(fTolerance) / Math.log(Math.abs(z)));
        }
        if (nHorizon < nDataLength) {
            zn = z;
            sum = c[0];
            for (int n = 1; n < nHorizon; n++) {
                sum += zn * c[n];
                zn *= z;
            }
            return sum;
        } else {
            zn = z;
            iz = 1.0 / z;
            z2n = Math.pow(z, nDataLength - 1);
            sum = c[0] + z2n * c[nDataLength - 1];
            z2n *= z2n * iz;
            for (int n = 1; n <= nDataLength - 2L; n++) {
                sum += (zn + z2n) * c[n];
                zn *= z;
                z2n *= iz;
            }
            return (sum / (1.0 - zn * zn));
        }
    }
}
