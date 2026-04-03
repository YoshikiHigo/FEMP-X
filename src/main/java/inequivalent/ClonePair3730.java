package inequivalent;

import java.util.BitSet;

public class ClonePair3730 {

    BitSet method1(Long Value, int Size) {
        BitSet results = new BitSet(Size);
        byte[] result = null;
        if (Size < 8) {
            result = new byte[1];
            result[0] = (byte) (Value.intValue());
        } else result = new byte[Size / 8];
        int j = 0;
        for (int i = 0; i < Size / 8; i++) {
            result[i] = (byte) (Value.intValue() >>> (i * 8));
        }
        for (int i = 0; i < Size; i++) {
            if ((result[result.length - i / 8 - 1] & (1 << (i % 8))) > 0) {
                results.set(i);
            }
        }
        return results;
    }

    BitSet method2(Long Value, int Size) {
        BitSet results = new BitSet(Size);
        byte[] result = null;
        if (Size < 8) {
            result = new byte[1];
            result[0] = (byte) (Value.longValue());
        } else result = new byte[Size / 8];
        int j = 0;
        for (int i = 0; i < Size / 8; i++) {
            result[i] = (byte) (Value.longValue() >>> (i * 8));
        }
        for (int i = 0; i < Size; i++) {
            if ((result[result.length - i / 8 - 1] & (1 << (i % 8))) > 0) {
                results.set(i);
            }
        }
        return results;
    }
}
