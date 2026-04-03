package equivalent;

public class ClonePair11201 {
    String method1(String prefix, String target) {
        char c = target.charAt(0);
        if (c > 96 && c < 123) c = (char) (c - 32);
        return prefix + c + target.substring(1, target.length());
    }

    String method2(String prefix, String fieldName) {
        char f = fieldName.charAt(0);
        if (f >= 'a' && f <= 'z') {
            f = (char) (f - 32);
        }
        return prefix + f + fieldName.substring(1);
    }
}
