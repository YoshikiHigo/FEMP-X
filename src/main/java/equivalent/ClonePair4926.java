package equivalent;

public class ClonePair4926 {
    long method1(byte[] hash) {
        long l = 0L;
        for (int k = 0; k < 8; ++k) {
            l = (l << 8) | (hash[k] & 0xff);
        }
        return (l);
    }

    long method2(byte[] hash) {
        long result = 0L;
        for (int k = 0; k < 8; ++k) result = (result << 8) | (hash[k] & 0xff);
        return result;
    }
}
