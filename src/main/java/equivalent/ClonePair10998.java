package equivalent;

public class ClonePair10998 {
    int method1(byte[] array, byte[] subarray, int startIndex) {
        for (int i = startIndex; i < array.length; i++) {
            boolean found = true;
            if (i + subarray.length > array.length) {
                break;
            }
            for (int j = 0; j < subarray.length; j++) {
                final byte a = array[i + j];
                final byte b = subarray[j];
                if (a != b) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return i;
            }
        }
        return -1;
    }

    int method2(byte[] buffer, byte[] searchbuffer, int startpos) {
        int retval = -1;
        for (int i = startpos; i < buffer.length - searchbuffer.length + 1; i++) {
            boolean found = true;
            for (int l = 0; l < searchbuffer.length; l++) {
                if (buffer[i + l] != searchbuffer[l]) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return i;
            }
        }
        return retval;
    }
}
