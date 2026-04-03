package equivalent;

public class ClonePair9913 {
    String[] method1(String[] input, int skip) {
        String[] result = new String[input.length - 1];
        for (int i = 0; i < input.length; i++) {
            if (i == skip) {
                continue;
            }
            int p = i < skip ? i : i - 1;
            result[p] = input[i];
        }
        return result;
    }

    String[] method2(String[] fromArray, int index) {
        String[] result = new String[fromArray.length - 1];
        int to, from;
        for (to = 0, from = 0; from < fromArray.length; from++)
            if (from != index) {
                result[to] = fromArray[from];
                to++;
            }
        return result;
    }
}
