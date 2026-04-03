package equivalent;

public class ClonePair12263 {
    long method1(long time, long period) {
        if (0 != (time % period)) {
            long temp = time % period;
            time = time - temp + period;
        }
        return time;
    }

    long method2(long value, long modulus) {
        long rem = value % modulus;
        if (0 != rem) {
            long temp = 1 + (value / modulus);
            value = temp * modulus;
        }
        return value;
    }
}
