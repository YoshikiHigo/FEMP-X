package equivalent;

public class ClonePair8744 {
    short method1(String s) {
        if (s == null || s.length() == 0) {
            return (short) 0;
        } else {
            return Short.parseShort(s);
        }
    }

    short method2(String s) {
        if (s == null || s.length() == 0) return (short) 0;
        else return Short.valueOf(s).shortValue();
    }
}
