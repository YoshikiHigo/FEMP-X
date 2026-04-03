package inequivalent;

public class ClonePair8913 {

    byte[] method1(byte[] b, int count) {
        if (count < b.length) {
            byte[] r = new byte[count];
            int begin = b.length - count;
            if (b.length - (b.length - count) >= 0)
                System.arraycopy(b, b.length - count, r, b.length - count - begin, b.length - (b.length - count));
            return r;
        } else if (count == b.length) {
            return b;
        } else return null;
    }

    byte[] method2(byte[] b, int count) {
        if (count < b.length) {
            byte[] r = new byte[count];
            System.arraycopy(b, 0, r, 0, count);
            return r;
        } else if (count == b.length) {
            return b;
        } else return null;
    }
}
