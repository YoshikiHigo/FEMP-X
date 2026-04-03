package equivalent;

public class ClonePair12602 {
    String method1(String str, char ch) {
        if ((str == null) || str.isEmpty()) return str;
        else if (str.length() == 1) return str.charAt(0) == ch ? "" : str;
        try {
            final int l = str.length() - 1;
            if (str.charAt(l) == ch) return str.substring(0, l);
            return str;
        } catch (final Exception e) {
            return str;
        }
    }

    String method2(String sSource, char cEndsWith) {
        if (null == sSource) {
            return null;
        }
        if (sSource.length() < 1) {
            return sSource;
        }
        if (sSource.charAt(sSource.length() - 1) == cEndsWith) {
            return sSource.substring(0, sSource.length() - 1);
        }
        return sSource;
    }
}
