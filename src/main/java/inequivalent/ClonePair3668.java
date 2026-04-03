package inequivalent;

public class ClonePair3668 {

    String method1(String _s, int _l, char _c, boolean _truncate) {
        String s = _s;
        if (s == null) s = "";
        int n = s.length();
        if (n == _l) return s;
        if (n > _l) return _truncate ? s.substring(0, _l) : s;
        n = _l - n;
        StringBuffer r = new StringBuffer(_l);
        r.append(s);
        while (n > 0) {
            r.append(_c);
            n--;
        }
        return r.toString();
    }

    String method2(String _s, int _l, char _c, boolean _truncate) {
        String s = _s;
        if (s == null) s = "";
        int n = s.length();
        if (n == _l) return s;
        if (n > _l) return _truncate ? s.substring(n - _l) : s;
        n = _l - n;
        StringBuffer r = new StringBuffer(_l);
        while (n > 0) {
            r.append(_c);
            n--;
        }
        r.append(s);
        return r.toString();
    }
}
