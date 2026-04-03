package equivalent;

public class ClonePair9021 {
    int method1(int c) {
        if ('0' <= c && c <= '9') return c - '0';
        else if ('a' <= c && c <= 'f') return c - ('a' - 10);
        else if ('A' <= c && c <= 'F') return c - ('A' - 10);
        else return -1;
    }

    int method2(int c) {
        if (c >= '0' && c <= '9') return (c - '0');
        else if (c >= 'A' && c <= 'F') return (c - 'A' + 10);
        else if (c >= 'a' && c <= 'f') return (c - 'a' + 10);
        else return -1;
    }
}
