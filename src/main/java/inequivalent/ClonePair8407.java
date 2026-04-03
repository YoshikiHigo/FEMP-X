package inequivalent;

public class ClonePair8407 {

    int[] method1(int[] src, int srcBrdth, int dstBrdth, int len) {
        final int minBrdth = Math.min(srcBrdth, dstBrdth);
        final int minBrdthH = minBrdth >> 1;
        final int minBrdthH1 = minBrdth - minBrdthH;
        final int brdthDOff = dstBrdth - minBrdthH1;
        final int brdthSOff = srcBrdth - minBrdthH1;
        final int[] dst = new int[dstBrdth * len];
        int dstOff = 0;
        int y = 0;
        for (; y < minBrdthH; y++) {
            for (int x = 0, srcOff = y; x < len; x++, dstOff++, srcOff += srcBrdth) {
                dst[dstOff] = src[srcOff];
            }
        }
        for (; y < brdthDOff; y++) {
            for (int x = 0, srcOff = minBrdthH; x < len; x++, dstOff++, srcOff += srcBrdth) {
                dst[dstOff] = src[srcOff];
            }
        }
        for (int srcOffS = brdthSOff; y < dstBrdth; y++, srcOffS++) {
            for (int x = 0, srcOff = srcOffS; x < len; x++, dstOff++, srcOff += srcBrdth) {
                dst[dstOff] = src[srcOff];
            }
        }
        return dst;
    }

    int[] method2(int[] src, int srcBrdth, int dstBrdth, int len) {
        final int minBrdth = Math.min(srcBrdth, dstBrdth);
        final int minBrdthH = minBrdth >> 1;
        final int minBrdthH1 = minBrdth - minBrdthH;
        final int numWiden = dstBrdth - srcBrdth;
        final int[] dst = new int[dstBrdth * len];
        for (int y = 0, srcOffL = 0, srcOffR = srcBrdth - minBrdthH1, dstOffL = 0, dstOffR = dstBrdth - minBrdthH1; y < len; y++, srcOffL += srcBrdth, srcOffR += srcBrdth, dstOffL += dstBrdth, dstOffR += dstBrdth) {
            System.arraycopy(src, srcOffL, dst, dstOffL, minBrdthH);
            System.arraycopy(src, srcOffR, dst, dstOffR, minBrdthH1);
        }
        if (numWiden > 0) {
            int p;
            for (int y = 0, srcOff = minBrdthH, dstOff = minBrdthH; y < len; y++, srcOff += srcBrdth, dstOff += srcBrdth) {
                p = src[srcOff];
                for (int stop = dstOff + numWiden; dstOff < stop; dstOff++) {
                    dst[dstOff] = p;
                }
            }
        }
        return dst;
    }
}
