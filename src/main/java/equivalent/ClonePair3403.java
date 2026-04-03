package equivalent;

public class ClonePair3403 {
    Float method1(String value) {
        if (value == null) {
            return null;
        }
        try {
            return new Float(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    Float method2(String s) {
        if (s == null) return null;
        Float rval = null;
        try {
            rval = new Float(s);
        } catch (NumberFormatException e) {
            return null;
        }
        return rval;
    }
}
