package inequivalent;

public class ClonePair12304 {

    long method1(long n, long m) {
        if (n == 0 || m == 0) return 0;
        while (n != m) if (n > m) n = n - m;
        else m = m - n;
        return n;
    }

    long method2(long op1, long op2) {
        int lsb1 = Long.numberOfTrailingZeros(op1);
        int lsb2 = Long.numberOfTrailingZeros(op2);
        int pow2Count = Math.min(lsb1, lsb2);
        if (lsb1 != 0) {
            op1 >>>= lsb1;
        }
        if (lsb2 != 0) {
            op2 >>>= lsb2;
        }
        do {
            if (op1 >= op2) {
                op1 -= op2;
                op1 >>>= Long.numberOfTrailingZeros(op1);
            } else {
                op2 -= op1;
                op2 >>>= Long.numberOfTrailingZeros(op2);
            }
        }
        while (op1 != 0);
        return (op2 << pow2Count);
    }
}
