package equivalent;

public class ClonePair1499 {
    long[] method1(byte[] b, int off, int len) {
        final int clen = len >>> 3;
        final long[] c = new long[clen];
        int i = 0, bi = off;
        final int limit = clen - 7;
        for (; i < limit; i += 8, bi += 64) {
            c[i] = ((long) b[bi] << 56) + ((b[bi + 1] & 0xFFL) << 48) + ((b[bi + 2] & 0xFFL) << 40) + ((b[bi + 3] & 0xFFL) << 32) + ((b[bi + 4] & 0xFFL) << 24) + ((b[bi + 5] & 0xFFL) << 16) + ((b[bi + 6] & 0xFFL) << 8) + (b[bi + 7] & 0xFFL);
            c[i + 1] = ((long) b[bi + 8] << 56) + ((b[bi + 9] & 0xFFL) << 48) + ((b[bi + 10] & 0xFFL) << 40) + ((b[bi + 11] & 0xFFL) << 32) + ((b[bi + 12] & 0xFFL) << 24) + ((b[bi + 13] & 0xFFL) << 16) + ((b[bi + 14] & 0xFFL) << 8) + (b[bi + 15] & 0xFFL);
            c[i + 2] = ((long) b[bi + 16] << 56) + ((b[bi + 17] & 0xFFL) << 48) + ((b[bi + 18] & 0xFFL) << 40) + ((b[bi + 19] & 0xFFL) << 32) + ((b[bi + 20] & 0xFFL) << 24) + ((b[bi + 21] & 0xFFL) << 16) + ((b[bi + 22] & 0xFFL) << 8) + (b[bi + 23] & 0xFFL);
            c[i + 3] = ((long) b[bi + 24] << 56) + ((b[bi + 25] & 0xFFL) << 48) + ((b[bi + 26] & 0xFFL) << 40) + ((b[bi + 27] & 0xFFL) << 32) + ((b[bi + 28] & 0xFFL) << 24) + ((b[bi + 29] & 0xFFL) << 16) + ((b[bi + 30] & 0xFFL) << 8) + (b[bi + 31] & 0xFFL);
            c[i + 4] = ((long) b[bi + 32] << 56) + ((b[bi + 33] & 0xFFL) << 48) + ((b[bi + 34] & 0xFFL) << 40) + ((b[bi + 35] & 0xFFL) << 32) + ((b[bi + 36] & 0xFFL) << 24) + ((b[bi + 37] & 0xFFL) << 16) + ((b[bi + 38] & 0xFFL) << 8) + (b[bi + 39] & 0xFFL);
            c[i + 5] = ((long) b[bi + 40] << 56) + ((b[bi + 41] & 0xFFL) << 48) + ((b[bi + 42] & 0xFFL) << 40) + ((b[bi + 43] & 0xFFL) << 32) + ((b[bi + 44] & 0xFFL) << 24) + ((b[bi + 45] & 0xFFL) << 16) + ((b[bi + 46] & 0xFFL) << 8) + (b[bi + 47] & 0xFFL);
            c[i + 6] = ((long) b[bi + 48] << 56) + ((b[bi + 49] & 0xFFL) << 48) + ((b[bi + 50] & 0xFFL) << 40) + ((b[bi + 51] & 0xFFL) << 32) + ((b[bi + 52] & 0xFFL) << 24) + ((b[bi + 53] & 0xFFL) << 16) + ((b[bi + 54] & 0xFFL) << 8) + (b[bi + 55] & 0xFFL);
            c[i + 7] = ((long) b[bi + 56] << 56) + ((b[bi + 57] & 0xFFL) << 48) + ((b[bi + 58] & 0xFFL) << 40) + ((b[bi + 59] & 0xFFL) << 32) + ((b[bi + 60] & 0xFFL) << 24) + ((b[bi + 61] & 0xFFL) << 16) + ((b[bi + 62] & 0xFFL) << 8) + (b[bi + 63] & 0xFFL);
        }
        for (; i < clen; i++, bi += 8) {
            c[i] = ((long) b[bi] << 56) + ((b[bi + 1] & 0xFFL) << 48) + ((b[bi + 2] & 0xFFL) << 40) + ((b[bi + 3] & 0xFFL) << 32) + ((b[bi + 4] & 0xFFL) << 24) + ((b[bi + 5] & 0xFFL) << 16) + ((b[bi + 6] & 0xFFL) << 8) + (b[bi + 7] & 0xFFL);
        }
        return c;
    }

    long[] method2(byte[] b, int off, int len) {
        final int clen = len >>> 3;
        final long[] c = new long[clen];
        for (int i = 0, bi = off; i < clen; i++, bi += 8) {
            c[i] = (b[bi + 7] & 0xFFL) + ((b[bi + 6] & 0xFFL) << 8) + ((b[bi + 5] & 0xFFL) << 16) + ((b[bi + 4] & 0xFFL) << 24) + ((b[bi + 3] & 0xFFL) << 32) + ((b[bi + 2] & 0xFFL) << 40) + ((b[bi + 1] & 0xFFL) << 48) + (((long) b[bi]) << 56);
        }
        return c;
    }
}
