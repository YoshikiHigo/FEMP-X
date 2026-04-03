package equivalent;

public class ClonePair6887 {
    int method1(int a, int b) {
        if (a == -1) {
            return (b);
        } else if (b == -1) {
            return (a);
        } else if (a < b) {
            return (a);
        } else {
            return (b);
        }
    }

    int method2(int first, int second) {
        int result;
        if ((first != -1) && (second != -1)) {
            if (first < second) {
                result = first;
            } else {
                result = second;
            }
        } else if (first != -1) {
            result = first;
        } else {
            result = second;
        }
        return result;
    }
}
