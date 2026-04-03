package inequivalent;

import java.util.Date;

public class ClonePair3220 {

    int method1(Object first, Object second) {
        int result = 0;
        if (first == null && second == null) {
            result = 0;
        } else if (first == null) {
            result = -1;
        } else if (second == null) {
            result = 1;
        } else if (first instanceof Date && second instanceof Date) {
            result = ((Date) first).compareTo((Date) second);
        } else if (first instanceof Integer && second instanceof Integer) {
            result = ((Integer) first).compareTo((Integer) second);
        } else if (first instanceof Double && second instanceof Double) {
            result = ((Double) first).compareTo((Double) second);
        } else {
            result = first.toString().compareTo(second.toString());
        }
        return result;
    }

    int method2(Object o1, Object o2) {
        if (o1 == null && o2 == null) {
            return 0;
        } else if (o1 == null) {
            return -1;
        } else if (o2 == null) {
            return 1;
        }
        int result;
        if (o1 instanceof Comparable) {
            try {
                result = ((Comparable) o1).compareTo(o2);
            } catch (ClassCastException cce) {
                String s1 = o1.toString();
                String s2 = o2.toString();
                result = s1.compareTo(s2);
            }
        } else {
            String s1 = o1.toString();
            String s2 = o2.toString();
            result = s1.compareTo(s2);
        }
        return result;
    }
}
