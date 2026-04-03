package inequivalent;

public class ClonePair12286 {

    long method1(long p, long q) {
        long shift;
        if (p == 0 || q == 0) return p | q;
        for (shift = 0; ((p | q) & 1) == 0; ++shift) {
            p >>>= 1;
            q >>>= 1;
        }
        while ((p & 1) == 0) p >>>= 1;
        do {
            while ((q & 1) == 0) q >>>= 1;
            if (p < q) q -= p;
            else {
                final long diff = p - q;
                p = q;
                q = diff;
            }
            q >>>= 1;
        }
        while (q != 0);
        return p << shift;
    }

    long method2(long u, long v) {
        int shift;
        if (u == 0 || v == 0) return u | v;
        for (shift = 0; ((u | v) & 1) == 0; ++shift) {
            u >>= 1;
            v >>= 1;
        }
        while ((u & 1) == 0) u >>= 1;
        do {
            while ((v & 1) == 0) v >>= 1;
            if (u < v) {
                v -= u;
            } else {
                long diff = u - v;
                u = v;
                v = diff;
            }
            v >>= 1;
        }
        while (v != 0);
        return u << shift;
    }
}
