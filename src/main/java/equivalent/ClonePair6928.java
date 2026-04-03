package equivalent;

public class ClonePair6928 {
    int method1(byte[] byteArray, int startPos) {
        for (int i = startPos; i < byteArray.length; i++) {
            if (byteArray[i] == 0) {
                return i;
            }
        }
        return byteArray.length;
    }

    int method2(byte[] bytes, int start) {
        for (int current = start; current < bytes.length; current++) {
            if (bytes[current] == 0) return current;
        }
        return bytes.length;
    }
}
