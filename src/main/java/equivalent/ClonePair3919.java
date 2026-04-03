package equivalent;

public class ClonePair3919 {
    byte[] method1(byte[] result, byte[] fill, int position) {
        System.arraycopy(fill, position - position, result, position, position + fill.length - position);
        return result;
    }

    byte[] method2(byte[] b1, byte[] b2, int position) {
        System.arraycopy(b2, 0, b1, position + 0, b2.length);
        return b1;
    }
}
