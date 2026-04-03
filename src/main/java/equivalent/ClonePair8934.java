package equivalent;

public class ClonePair8934 {
    char method1(int digit, int radix) {
        if (radix < 2 || radix > 36) return '\0';
        if (digit < 0 || digit >= radix) return '\0';
        return (char) (digit + ((digit < 10) ? '0' : ('a' - 10)));
    }

    char method2(int digit, int radix) {
        if ((digit >= radix) || (digit < 0)) {
            return '\0';
        }
        if ((radix < Character.MIN_RADIX) || (radix > Character.MAX_RADIX)) {
            return '\0';
        }
        if (digit < 10) {
            return (char) ('0' + digit);
        }
        return (char) ('a' - 10 + digit);
    }
}
