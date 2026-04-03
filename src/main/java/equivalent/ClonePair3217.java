package equivalent;

public class ClonePair3217 {
    boolean method1(byte[] bytes, int firstByte, byte[] values) {
        if (values.length + firstByte > bytes.length) return false;
        boolean result = true;
        int i = 0;
        while (result && i < values.length) {
            result = bytes[firstByte + i] == values[i];
            i++;
        }
        return result;
    }

    boolean method2(byte[] srcArray, int srcStart, byte[] array) {
        boolean matched = true;
        for (int i = srcStart; i < srcStart + array.length; i++) {
            if (i >= srcArray.length) return false;
            if (array[i - srcStart] != srcArray[i]) {
                matched = false;
            }
        }
        return matched;
    }
}
