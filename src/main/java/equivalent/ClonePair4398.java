package equivalent;

public class ClonePair4398 {
    boolean method1(String arg, String p) {
        if (p.endsWith(" ")) {
            return arg.equals(p.substring(0, p.length() - 1)) || arg.startsWith(p);
        }
        if (p.endsWith("$")) {
            return arg.equals(p.substring(0, p.length() - 1));
        }
        return arg.startsWith(p);
    }

    boolean method2(String arg, String p) {
        if (p.endsWith(" ")) return arg.equals(p.substring(0, p.length() - 1)) || arg.startsWith(p);
        if (p.endsWith("$")) return arg.equals(p.substring(0, p.length() - 1));
        return arg.startsWith(p);
    }
}
