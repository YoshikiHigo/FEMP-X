package equivalent;

public class ClonePair10974 {
    int method1(char[] buf, int offset, int len) {
        int num_bytes = 0;
        for (int i = offset; i < len; i++) {
            if (buf[i] <= 0x007F) ++num_bytes;
            else if (buf[i] <= 0x07FF) num_bytes += 2;
            else num_bytes += 3;
        }
        return (num_bytes);
    }

    int method2(char[] array, int offset, int length) {
        int outputSize = 0;
        int inputChar;
        while (offset < length) {
            inputChar = array[offset];
            if (inputChar < 0x80) {
                outputSize++;
            } else if (inputChar < 0x800) {
                outputSize += 2;
            } else {
                outputSize += 3;
            }
            offset++;
        }
        return outputSize;
    }
}
