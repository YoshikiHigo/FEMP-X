package equivalent;

public class ClonePair8631 {
    Character method1(String str) {
        if (str == null) return null;
        return str.charAt(0);
    }

    Character method2(String value) {
        if (value == null) {
            return null;
        }
        return new Character(value.charAt(0));
    }
}
