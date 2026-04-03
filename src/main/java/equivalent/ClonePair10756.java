package equivalent;

public class ClonePair10756 {
    int method1(String pattern, String text) {
        int m = pattern.length();
        int n = text.length();
        int i = 0;
        int j = 0;
        while (i < m && j - i < n - m + 1) {
            if (pattern.charAt(i) == text.charAt(j)) {
                j++;
                i++;
            } else {
                j = j - i + 1;
                i = 0;
            }
        }
        if (i == m) {
            return j - i;
        } else {
            return -1;
        }
    }

    int method2(String pattern, String text) {
        int m = pattern.length();
        int n = text.length();
        int i = 0;
        int j = 0;
        int k;
        for (k = 0; k < n - m + 1; k++) {
            i = 0;
            j = k;
            while (i < m && pattern.charAt(i) == text.charAt(j)) {
                i++;
                j++;
            }
            if (i == m) {
                return k;
            }
        }
        return -1;
    }
}
