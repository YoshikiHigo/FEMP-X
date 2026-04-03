package inequivalent;

public class ClonePair3650 {

    int method1(Object o1, Object o2) {
        if ((o1 instanceof Comparable) && (o2 instanceof Comparable)) {
            return ((Comparable) o1).compareTo(o2);
        }
        return 0;
    }

    int method2(Object opra, Object oprb) {
        if (opra instanceof String a && oprb instanceof String b) {
            a = a.toLowerCase();
            b = b.toLowerCase();
            return a.compareTo(b);
        }
        if (opra instanceof Integer a && oprb instanceof Integer b) {
            return a.compareTo(b);
        }
        if (opra instanceof Boolean a && oprb instanceof Boolean b) {
            return a.compareTo(b);
        }
        if (opra instanceof Comparable a && oprb instanceof Comparable b) {
            return a.compareTo(b);
        }
        return 0;
    }
}
