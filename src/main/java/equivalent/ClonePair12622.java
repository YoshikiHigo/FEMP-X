package equivalent;

public class ClonePair12622 {
    String method1(String s1, String s2) {
        int i, l1, l2;
        l1 = s1.length();
        l2 = s2.length();
        for (i = 0; i < l1 && i < l2; i++) {
            if (s1.charAt(i) != s2.charAt(i)) break;
        }
        return (s1.substring(0, i));
    }

    String method2(String string1, String string2) {
        int length1 = string1.length();
        int length2 = string2.length();
        String shorter, longer;
        int length;
        if (length1 < length2) {
            shorter = string1;
            longer = string2;
            length = length1;
        } else {
            shorter = string2;
            longer = string1;
            length = length2;
        }
        for (int i = 0; i < length; i++) {
            if (shorter.charAt(i) != longer.charAt(i)) {
                return shorter.substring(0, i);
            }
        }
        return shorter;
    }
}
