package equivalent;

public class ClonePair8761 {
    char method1(int i) {
        if (i >= 0 && i <= 9) return (char) (i + 48);
        if (i >= 10 && i <= 15) return (char) (i + 55);
        return 0;
    }

    char method2(int di) {
        if (di >= 0 && di <= 9) return (char) ('0' + di);
        if (di >= 10 && di <= 15) return (char) ('A' + (di - 10));
        return (0);
    }
}
