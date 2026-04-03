package inequivalent;

public class ClonePair13328 {

    boolean method1(byte[] dat, int start) {
        if (start < dat.length - 3) {
            return dat[start] == 'N' && dat[start + 1] == 'I' && dat[start + 2] == 'L';
        }
        return false;
    }

    boolean method2(byte[] data, int pos) {
        return data.length >= 6 + pos && data[pos] == 'E' && data[pos + 1] == 'x' && data[pos + 2] == 'i' && data[pos + 3] == 'f' && data[pos + 4] == '\0' && data[pos + 5] == '\0';
    }
}
