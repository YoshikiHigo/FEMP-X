package equivalent;

public class ClonePair8722 {
    char method1(int i) {
        i &= 0x3f;
        if (i < 26) {
            return (char) ('A' + i);
        }
        if (i < 52) {
            return (char) ('a' + i - 26);
        }
        if (i < 62) {
            return (char) ('0' + i - 52);
        }
        return i == 62 ? '+' : '/';
    }

    char method2(int d) {
        d &= 0x3f;
        if (d < 26) return (char) (d + 'A');
        else if (d < 52) return (char) (d + 'a' - 26);
        else if (d < 62) return (char) (d + '0' - 52);
        else if (d == 62) return '+';
        else return '/';
    }
}
