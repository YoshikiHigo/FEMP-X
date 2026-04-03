package equivalent;

public class ClonePair3417 {
    Float method1(String text) {
        if (text == null) {
            return null;
        }
        return new Float(text);
    }

    Float method2(String value) {
        if (value == null) {
            return null;
        }
        return Float.valueOf(value);
    }
}
