package inequivalent;

public class ClonePair8556 {

    boolean method1(String source, String identifer) {
        if (source == null || "".equals(source)) {
            return false;
        }
        if (identifer == null || "".equals(identifer)) {
            return false;
        }
        return source.startsWith(identifer);
    }

    boolean method2(String p1, String p2) {
        if (p1 != null && p1.length() == 0) p1 = null;
        if (p2 != null && p2.length() == 0) p2 = null;
        return (p1 != null && p1.equals(p2));
    }
}
