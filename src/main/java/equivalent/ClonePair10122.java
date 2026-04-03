package equivalent;

public class ClonePair10122 {
    Integer method1(String str) {
        if (str == null) {
            return null;
        }
        return Integer.decode(str);
    }

    Integer method2(String value) {
        if (value == null) {
            return null;
        }
        return Integer.valueOf(value);
    }
}
