package inequivalent;

public class ClonePair1508 {

    byte method1(byte[] data, int start, int end) {
        byte min = data[start];
        for (int i = start + 1; i < end; i++) {
            min = (byte) Math.min(data[i], min);
        }
        return min;
    }

    byte method2(byte[] data, int start, int end) {
        byte min = data[start];
        for (int i = start + 1; i < end; i++) {
            min = (byte) Math.max(data[i], min);
        }
        return min;
    }
}
