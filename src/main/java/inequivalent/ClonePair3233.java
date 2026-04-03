package inequivalent;

public class ClonePair3233 {

    int method1(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        if (s1.equalsIgnoreCase(s2)) {
            return 0;
        } else {
            return s1.compareTo(s2);
        }
    }

    int method2(Object arg0, Object arg1) {
        String str1 = (String) arg0;
        String str2 = (String) arg1;
        try {
            Integer i1 = Integer.parseInt(str1);
            Integer i2 = Integer.parseInt(str2);
            if (i1 > i2) {
                return 1;
            } else if (i1 < i2) {
                return -1;
            } else {
                return 0;
            }
        } catch (Exception e) {
            return str1.compareTo(str2);
        }
    }
}
