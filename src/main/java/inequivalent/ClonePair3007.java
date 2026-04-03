package inequivalent;

public class ClonePair3007 {

    int method1(Object o1, Object o2) {
        String str1 = (String) o1;
        String str2 = (String) o2;
        if (str1 == null) {
            if (str2 == null) return 0;
            return -1;
        } else if (str2 == null) {
            return 1;
        }
        return str1.toLowerCase().compareTo(str2.toLowerCase());
    }

    int method2(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        if (s1 == null) {
            return s2 == null ? 0 : -1;
        } else {
            return s2 == null ? 1 : s1.compareTo(s2);
        }
    }
}
