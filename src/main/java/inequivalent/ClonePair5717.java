package inequivalent;

public class ClonePair5717 {

    boolean method1(String str, String sub, boolean caseSensitive) {
        int n = str.length() - sub.length() + 1;
        if (n < 0) return false;
        for (int i = 0; i < n; i++) {
            if (sub.regionMatches(caseSensitive, 0, str, i, sub.length())) return true;
        }
        return false;
    }

    boolean method2(String expression, String criteria, boolean caseSensitive) {
        final char[] crit = caseSensitive ? criteria.toCharArray() : criteria.toUpperCase().toCharArray();
        final char[] exp = caseSensitive ? expression.toCharArray() : expression.toUpperCase().toCharArray();
        final int limit = exp.length - 1;
        int index = 0;
        for (int loop = 0; loop < crit.length; loop++) {
            if (index > limit) {
                return false;
            }
            final char c = crit[loop];
            switch (c) {
                case '?':
                    index++;
                    break;
                case '%':
                    if (loop + 1 < crit.length) {
                        final char next = crit[loop + 1];
                        while (index <= limit && next != exp[index]) {
                            index++;
                        }
                        if (index > limit || next != exp[index]) {
                            return false;
                        }
                    } else {
                        return true;
                    }
                    break;
                default:
                    if (c == exp[index]) {
                        index++;
                    } else {
                        return false;
                    }
                    break;
            }
        }
        return index > limit;
    }
}
