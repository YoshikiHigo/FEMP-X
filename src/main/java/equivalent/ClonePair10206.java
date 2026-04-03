package equivalent;

public class ClonePair10206 {
    Integer method1(String value) {
        if (value != null) {
            try {
                return Integer.parseInt(value);
            } catch (NumberFormatException e) {
            }
        }
        return null;
    }

    Integer method2(String s) {
        try {
            if (s != null) {
                return Integer.decode(s);
            } else {
                return null;
            }
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
