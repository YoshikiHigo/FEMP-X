package equivalent;

public class ClonePair12640 {
    String method1(String what, String with, String in) {
        StringBuffer replacement = new StringBuffer();
        if (in == null) {
            return null;
        }
        int prevIndex = 0;
        int nextIndex = in.indexOf(what, prevIndex);
        while (nextIndex != -1) {
            replacement.append(in, prevIndex, nextIndex);
            replacement.append(with);
            prevIndex = nextIndex + what.length();
            nextIndex = in.indexOf(what, prevIndex);
        }
        replacement.append(in, prevIndex, in.length());
        return replacement.toString();
    }

    String method2(String x, String y, String s) {
        if (s == null) return null;
        int from = 0;
        int to = s.indexOf(x, from);
        if (to < 0) return s;
        StringBuilder d = new StringBuilder(s.length() + 32);
        while (to >= 0) {
            d.append(s, from, to);
            d.append(y);
            from = to + x.length();
            to = s.indexOf(x, from);
        }
        return d.append(s.substring(from)).toString();
    }
}
