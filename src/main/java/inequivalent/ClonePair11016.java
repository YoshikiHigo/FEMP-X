package inequivalent;

public class ClonePair11016 {

    byte[] method1(byte[] data, int start, int end) {
        byte[] buf = new byte[end - start];
        if (end - start >= 0) System.arraycopy(data, start, buf, start - start, end - start);
        return buf;
    }

    byte[] method2(byte[] tab, int start, int end) {
        byte[] tabTo = new byte[end - start];
        if (end - start >= 0) System.arraycopy(tab, start, tabTo, start, end - start);
        return tabTo;
    }
}
