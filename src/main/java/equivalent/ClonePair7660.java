package equivalent;

public class ClonePair7660 {
    Byte method1(String s) {
        if (s == null) return null;
        Byte rval;
        try {
            rval = Byte.valueOf(s);
        } catch (NumberFormatException e) {
            return null;
        }
        return rval;
    }

    Byte method2(String s) {
        try {
            if (s != null) {
                return Byte.decode(s);
            } else {
                return null;
            }
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
