package equivalent;

public class ClonePair5123 {
    @SuppressWarnings("fallthrough")
    int method1(String sig, boolean includeReturn) {
        int stack = 0;
        int i = 0;
        char[] c = sig.toCharArray();
        int n = c.length;
        boolean ret = false;
        boolean array = false;
        while (++i < n) {
            switch (c[i]) {
                case ')':
                    if (!includeReturn) return stack;
                    ret = true;
                    continue;
                case '[':
                    array = true;
                    continue;
                case 'V':
                    continue;
                case 'D':
                case 'J':
                    if (array) {
                        if (ret) stack += 1;
                        else stack -= 1;
                        array = false;
                    } else {
                        if (ret) stack += 2;
                        else stack -= 2;
                    }
                    break;
                case 'L':
                    while (c[++i] != ';') {
                    }
                default:
                    if (ret) stack++;
                    else stack--;
                    array = false;
            }
        }
        return stack;
    }

    int method2(String sig, boolean includeReturn) {
        int stack = 0;
        int i = 0;
        char[] c = sig.toCharArray();
        int n = c.length;
        boolean ret = false;
        boolean array = false;
        while (++i < n) {
            switch (c[i]) {
                case ')':
                    if (!includeReturn) return stack;
                    ret = true;
                    continue;
                case '[':
                    array = true;
                    continue;
                case 'V':
                    continue;
                case 'D':
                case 'J':
                    if (array) {
                        if (ret) stack += 1;
                        else stack -= 1;
                        array = false;
                    } else {
                        if (ret) stack += 2;
                        else stack -= 2;
                    }
                    break;
                case 'L':
                    while (c[++i] != ';') {
                    }
                default:
                    if (ret) stack++;
                    else stack--;
                    array = false;
            }
        }
        return stack;
    }
}
