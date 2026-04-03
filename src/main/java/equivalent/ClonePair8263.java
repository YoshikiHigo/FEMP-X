package equivalent;

public class ClonePair8263 {
    String method1(int value, int radix) {
        if (radix == 16) {
            String s = Integer.toHexString(value).toUpperCase();
            while (s.length() < 4) {
                s = "0" + s;
            }
            return "x" + s;
        } else if (radix == 2) {
            String s = Integer.toBinaryString(value).toUpperCase();
            while (s.length() < 16) {
                s = "0" + s;
            }
            return s;
        }
        return Integer.toString(value, radix).toUpperCase();
    }

    String method2(int value, int radix) {
        if (radix == 16) {
            String s = Integer.toHexString(value).toUpperCase();
            while (s.length() < 4) s = "0" + s;
            return "x" + s;
        } else if (radix == 2) {
            String s = Integer.toBinaryString(value).toUpperCase();
            while (s.length() < 16) s = "0" + s;
            return s;
        }
        return Integer.toString(value, radix).toUpperCase();
    }
}
