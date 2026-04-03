package equivalent;

public class ClonePair4399 {
    String method1(String[] array, String delimiter) {
        int delimiterLength = delimiter.length();
        if (array.length == 0) return "";
        if (array.length == 1) {
            if (array[0] == null) return "";
            return array[0];
        }
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) length += array[i].length();
            if (i < array.length - 1) length += delimiterLength;
        }
        StringBuffer result = new StringBuffer(length);
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) result.append(array[i]);
            if (i < array.length - 1) result.append(delimiter);
        }
        return result.toString();
    }

    String method2(String[] array, String delimiter) {
        int delimiterLength = delimiter.length();
        if (array.length == 0) {
            return "";
        }
        if (array.length == 1) {
            if (array[0] == null) {
                return "";
            }
            return array[0];
        }
        int length = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                length += array[i].length();
            }
            if (i < array.length - 1) {
                length += delimiterLength;
            }
        }
        StringBuffer result = new StringBuffer(length);
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                result.append(array[i]);
            }
            if (i < array.length - 1) {
                result.append(delimiter);
            }
        }
        return result.toString();
    }
}
