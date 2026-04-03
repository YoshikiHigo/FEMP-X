package equivalent;

public class ClonePair12798 {
    int method1(long unsignedA, long unsignedB) {
        int cmp = 0;
        if ((unsignedA ^ unsignedB) < 0L || (unsignedA = unsignedB - unsignedA) != 0L) {
            cmp = -1;
            if (unsignedA < 0L) cmp = 1;
        }
        return cmp;
    }

    int method2(long thisLong, long thatLong) {
        if (thisLong == thatLong) {
            return 0;
        } else {
            boolean isLessThan;
            long thisHalfLong = (thisLong & 0xffffffff00000000L) >>> 1;
            long thatHalfLong = (thatLong & 0xffffffff00000000L) >>> 1;
            if (thisHalfLong == thatHalfLong) {
                thisHalfLong = (thisLong & 0x00000000ffffffffL);
                thatHalfLong = (thatLong & 0x00000000ffffffffL);
                isLessThan = thisHalfLong < thatHalfLong;
            } else {
                isLessThan = thisHalfLong < thatHalfLong;
            }
            if (isLessThan) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}
