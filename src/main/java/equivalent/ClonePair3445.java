package equivalent;

public class ClonePair3445 {
    Float method1(String value) {
        if (value == null) return null;
        try {
            return Float.parseFloat(value);
        } catch (Exception ex) {
            return null;
        }
    }

    Float method2(String value) {
        if (value == null) return null;
        try {
            return Float.parseFloat(value);
        } catch (NumberFormatException nfe) {
            return null;
        }
    }
}
