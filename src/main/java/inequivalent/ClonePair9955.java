package inequivalent;

public class ClonePair9955 {

    int method1(byte[] array, int start, int end) {
        int code = 0;
        for (int i = end - 1; i >= start; i--) code = code * 31 + array[i];
        return code;
    }

    int method2(byte[] bytes, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            byte b = bytes[i];
            sum += b;
        }
        return sum;
    }
}
