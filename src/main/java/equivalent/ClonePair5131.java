package equivalent;

public class ClonePair5131 {
    Short method1(byte[] bytes) {
        if (bytes == null) return null;
        short a = 0;
        for (int i = 0; i < 2; i++) a += ((short) bytes[i] & 0xFF) << (8 - 8 * i);
        Short aa = Short.valueOf(a);
        return aa;
    }

    Short method2(byte[] bytes) {
        if (bytes == null) return null;
        short a = (short) ((bytes[1] & 0xFF) << 0);
        a |= (short) ((bytes[0] & 0xFF) << 8);
        Short aa = Short.valueOf(a);
        return aa;
    }
}
