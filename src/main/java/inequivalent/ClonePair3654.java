package inequivalent;

public class ClonePair3654 {

    int method1(Object o1, Object o2) {
        int result = 0;
        if (o1 != null && o2 != null) {
            if (o1 instanceof Number && o2 instanceof Number) {
                result = Double.compare(((Number) o1).doubleValue(), ((Number) o2).doubleValue());
            } else if (o1.getClass() == o2.getClass() && o1 instanceof Comparable) {
                result = (((Comparable) o1).compareTo(o2));
            } else {
                System.out.printf("Warning: compared values: %s, %s have different types%n", o1, o2);
                result = (o1.toString()).compareTo(o2.toString());
            }
        } else if (o1 != null) {
            result = 1;
        } else if (o2 != null) {
            result = -1;
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
        } else if (o1 == o2 || o1.equals(o2)) {
            return 0;
        } else if (!o1.getClass().equals(o2.getClass())) {
            return o1.getClass().getName().compareTo(o2.getClass().getName());
        } else if (o1 instanceof Comparable && o2 instanceof Comparable) {
            return ((Comparable) o1).compareTo(o2);
        } else {
            int h1 = o1.hashCode();
            int h2 = o2.hashCode();
            return h1 > h2 ? 1 : -1;
        }
    }
}
