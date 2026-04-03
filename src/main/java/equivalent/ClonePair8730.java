package equivalent;

public class ClonePair8730 {
    char method1(int b) {
        char c;
        if (b <= 25) {
            c = (char) ('A' + b);
        } else if (b <= 51) {
            c = (char) ('a' + b - 26);
        } else if (b <= 61) {
            c = (char) ('0' + b - 52);
        } else if (b == 62) {
            c = '+';
        } else {
            c = '/';
        }
        return c;
    }

    char method2(int sixBit) {
        if (sixBit < 26) return (char) ('A' + sixBit);
        if (sixBit < 52) return (char) (('a' - 26) + sixBit);
        if (sixBit < 62) return (char) (('0' - 52) + sixBit);
        if (sixBit == 62) return '+';
        return '/';
    }
}
