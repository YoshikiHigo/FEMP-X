package equivalent;

public class ClonePair7992 {
    double[] method1(int[] probeOrder, int probe_count, int clone_count, int ch_length, int clone_length, int gap, int[][] joint) {
        int w, mmax, mmin, msum, j, un, t1, t2;
        double A, eps, t3, t4, eps1, sum;
        double[] y = new double[probe_count + 1];
        eps1 = 0.1;
        msum = 0;
        mmax = 0;
        mmin = clone_count;
        w = 0;
        int[] link = new int[probe_count];
        int[] ulink = new int[probe_count];
        un = 0;
        for (int probeIndex = 1; probeIndex < probe_count; probeIndex++) {
            t1 = joint[probeOrder[probeIndex] - 1][probeOrder[probeIndex - 1] - 1];
            if (t1 > 0) {
                msum += t1;
                if (mmax < t1) {
                    mmax = t1;
                }
                if (mmin > t1) {
                    mmin = t1;
                }
                link[w] = probeIndex;
                w++;
            } else {
                ulink[un] = probeIndex;
                un++;
            }
        }
        A = (double) gap - ((probe_count + 1 - w) * (clone_length - eps1));
        if (A <= 0.0) {
            y[0] = gap / (double) (probe_count + 1 - w);
            for (int probeIndex = 0; probeIndex < un; probeIndex++) {
                y[ulink[probeIndex]] = y[0];
            }
            for (int probeIndex = 0; probeIndex < w; probeIndex++) {
                y[link[probeIndex]] = 0.0;
            }
        } else {
            eps = A / (2 * w);
            y[0] = (gap - A) / (probe_count + 1 - w);
            for (int probeIndex = 0; probeIndex < un; probeIndex++) {
                y[ulink[probeIndex]] = y[0];
            }
            if (((clone_length - eps) * w) <= A) {
                for (int probeIndex = 0; probeIndex < w; probeIndex++) {
                    y[link[probeIndex]] = clone_length - eps;
                }
            } else {
                t1 = (mmax * w) - msum;
                t2 = msum - (mmin * w);
                if (t1 == 0) {
                    for (int probeIndex = 0; probeIndex < w; probeIndex++) {
                        y[link[probeIndex]] = A / w;
                    }
                } else {
                    t3 = (A - (eps * w)) / t1;
                    t4 = ((w * (clone_length - eps)) - A) / t2;
                    if (t3 < t4) {
                        for (int probeIndex = 0; probeIndex < w; probeIndex++) {
                            un = joint[probeOrder[link[probeIndex]] - 1][probeOrder[link[probeIndex] - 1] - 1];
                            y[link[probeIndex]] = ((A * (mmax - un)) + (eps * ((w * un) - msum))) / t1;
                        }
                    } else {
                        for (int probeIndex = 0; probeIndex < w; probeIndex++) {
                            un = joint[probeOrder[link[probeIndex] - 1]][probeOrder[link[probeIndex] - 1] - 1];
                            y[link[probeIndex]] = (((clone_length - eps) * (msum - (w * un))) + (A * (un - mmin))) / t2;
                        }
                    }
                }
            }
        }
        sum = 0.0;
        for (int probeIndex = 0; probeIndex < probe_count; probeIndex++) {
            sum += y[probeIndex];
        }
        y[probe_count] = gap - sum;
        for (int index = 0; index < y.length; index++) {
            if (y[index] < 0.0) y[index] = -y[index];
        }
        return y;
    }

    double[] method2(int[] probeOrder, int probe_count, int clone_count, int ch_length, int clone_length, int gap, int[][] joint) {
        int w, mmax, mmin, msum, un, t1, t2;
        double A, eps, t3, t4, eps1, sum;
        double[] y = new double[probe_count + 1];
        eps1 = 0.1;
        msum = 0;
        mmax = 0;
        mmin = clone_count;
        w = 0;
        int[] link = new int[probe_count];
        int[] ulink = new int[probe_count];
        un = 0;
        for (int probeIndex = 1; probeIndex < probe_count; probeIndex++) {
            t1 = joint[probeOrder[probeIndex] - 1][probeOrder[probeIndex - 1] - 1];
            if (t1 > 0) {
                msum += t1;
                if (mmax < t1) {
                    mmax = t1;
                }
                if (mmin > t1) {
                    mmin = t1;
                }
                link[w] = probeIndex;
                w++;
            } else {
                ulink[un] = probeIndex;
                un++;
            }
        }
        A = (double) gap - ((probe_count + 1 - w) * (clone_length - eps1));
        if (A <= 0.0) {
            y[0] = gap / (double) (probe_count + 1 - w);
            for (int probeIndex = 0; probeIndex < un; probeIndex++) {
                y[ulink[probeIndex]] = y[0];
            }
            for (int probeIndex = 0; probeIndex < w; probeIndex++) {
                y[link[probeIndex]] = 0.0;
            }
        } else {
            eps = A / (2 * w);
            y[0] = (gap - A) / (probe_count + 1 - w);
            for (int probeIndex = 0; probeIndex < un; probeIndex++) {
                y[ulink[probeIndex]] = y[0];
            }
            if (((clone_length - eps) * w) <= A) {
                for (int probeIndex = 0; probeIndex < w; probeIndex++) {
                    y[link[probeIndex]] = clone_length - eps;
                }
            } else {
                t1 = (mmax * w) - msum;
                t2 = msum - (mmin * w);
                if (t1 == 0) {
                    for (int probeIndex = 0; probeIndex < w; probeIndex++) {
                        y[link[probeIndex]] = A / w;
                    }
                } else {
                    t3 = (A - (eps * w)) / t1;
                    t4 = ((w * (clone_length - eps)) - A) / t2;
                    if (t3 < t4) {
                        for (int probeIndex = 0; probeIndex < w; probeIndex++) {
                            un = joint[probeOrder[link[probeIndex]] - 1][probeOrder[link[probeIndex] - 1] - 1];
                            y[link[probeIndex]] = ((A * (mmax - un)) + (eps * ((w * un) - msum))) / t1;
                        }
                    } else {
                        for (int probeIndex = 0; probeIndex < w; probeIndex++) {
                            un = joint[probeOrder[link[probeIndex] - 1]][probeOrder[link[probeIndex] - 1] - 1];
                            y[link[probeIndex]] = (((clone_length - eps) * (msum - (w * un))) + (A * (un - mmin))) / t2;
                        }
                    }
                }
            }
        }
        sum = 0.0;
        for (int probeIndex = 0; probeIndex < probe_count; probeIndex++) {
            sum += y[probeIndex];
        }
        y[probe_count] = gap - sum;
        for (int index = 0; index < y.length; index++) {
            if (y[index] < 0.0) {
                y[index] = -y[index];
            }
        }
        return y;
    }
}
