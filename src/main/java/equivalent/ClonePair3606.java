package equivalent;

public class ClonePair3606 {
    int method1(Object v1, Object v2) {
        String s1 = (String) v1;
        String s2 = (String) v2;
        int stringCompareValue = s1.compareTo(s2);
        if (stringCompareValue == 0) {
            return 0;
        }
        int dotsCompareValue = s1.length() - s2.length();
        if (dotsCompareValue == 0) {
            return stringCompareValue;
        } else if (dotsCompareValue > 0) {
            return 1;
        }
        return -1;
    }

    int method2(Object obj1, Object obj2) {
        String s1 = (String) obj1;
        String s2 = (String) obj2;
        if (s1.length() < s2.length()) {
            return -1;
        } else if (s1.length() > s2.length()) {
            return 1;
        } else {
            return s1.compareTo(s2);
        }
    }
}
