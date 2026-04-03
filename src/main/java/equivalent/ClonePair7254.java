package equivalent;

public class ClonePair7254 {
    int method1(CharSequence s, char c) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                sum++;
            }
        }
        return sum;
    }

    int method2(CharSequence s, char c) {
        int occurrences = 0;
        for (int i = 0, l = s.length(); i < l; i++) {
            if (s.charAt(i) == c) {
                occurrences++;
            }
        }
        return occurrences;
    }
}
