package equivalent;

public class ClonePair5752 {
    boolean method1(int c) {
        if (c <= 'Z') {
            return 'A' <= c;
        } else {
            return 'a' <= c && c <= 'z';
        }
    }

    boolean method2(int d) {
        return (d < 123 && d > 96) || (d < 91 && d > 64);
    }
}
