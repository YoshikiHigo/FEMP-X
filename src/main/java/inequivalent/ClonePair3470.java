package inequivalent;

public class ClonePair3470 {

    int method1(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        int n1 = s1.length(), n2 = s2.length();
        for (int i1 = 0, i2 = 0; i1 < n1 && i2 < n2; i1++, i2++) {
            char c1 = s1.charAt(i1);
            char c2 = s2.charAt(i2);
            if (c1 != c2) {
                c1 = Character.toUpperCase(c1);
                c2 = Character.toUpperCase(c2);
                if (c1 != c2) {
                    c1 = Character.toLowerCase(c1);
                    c2 = Character.toLowerCase(c2);
                    if (c1 != c2) return c1 - c2;
                }
            }
        }
        return n1 - n2;
    }

    int method2(Object o1, Object o2) {
        final String s1 = ((String) o1).toLowerCase();
        final String s2 = ((String) o2).toLowerCase();
        if (!(s1.equals(s2))) {
            return s1.compareTo(s2);
        } else {
            return 0;
        }
    }
}
