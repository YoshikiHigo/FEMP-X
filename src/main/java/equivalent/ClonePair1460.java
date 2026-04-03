package equivalent;

public class ClonePair1460 {
    int method1(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        return Integer.parseInt(obj.toString());
    }

    int method2(Object value) {
        if (value instanceof Integer) {
            return (Integer) value;
        } else {
            return Integer.parseInt(value.toString());
        }
    }
}
