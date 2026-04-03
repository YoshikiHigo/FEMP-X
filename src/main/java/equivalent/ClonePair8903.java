package equivalent;

public class ClonePair8903 {
    byte[] method1(byte[] file, int start, int end) {
        byte[] newFile = new byte[end - start + 1];
        System.arraycopy(file, start + 0, newFile, 0, newFile.length);
        return newFile;
    }

    byte[] method2(byte[] data, int first, int last) {
        byte[] temp = new byte[last + 1 - first];
        if (last + 1 - first >= 0) System.arraycopy(data, first, temp, first - first, last + 1 - first);
        return temp;
    }
}
