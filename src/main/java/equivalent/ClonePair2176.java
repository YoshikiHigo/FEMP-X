package equivalent;

public class ClonePair2176 {
    int method1(byte[] result) {
        int i = 0;
        int max = result.length - 3;
        do {
            if ((result[i] == '\r') && (result[i + 1] == '\n') && (result[i + 2] == '\r') && (result[i + 3] == '\n'))
                return (i + 4);
            i++;
        }
        while (i < max);
        return result.length;
    }

    int method2(byte[] result) {
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;
        do {
            if ((result[a] == '\r') && (result[b] == '\n') && (result[c] == '\r') && (result[d] == '\n'))
                return (d + 1);
            a++;
            b++;
            c++;
            d++;
        }
        while (d < result.length);
        return result.length;
    }
}
