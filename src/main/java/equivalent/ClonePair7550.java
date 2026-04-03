package equivalent;

public class ClonePair7550 {
    int method1(int d) {
        if (d < 10) return 1;
        if (d < 100) return 2;
        if (d < 1000) return 3;
        if (d < 10000) return 4;
        d /= 10000;
        int n = 5;
        while (d > 9) {
            d /= 10;
            n++;
        }
        return n;
    }

    int method2(int x) {
        if (x < 10000) {
            if (x < 100) {
                if (x < 10) {
                    return 1;
                } else {
                    return 2;
                }
            } else {
                if (x < 1000) {
                    return 3;
                } else {
                    return 4;
                }
            }
        } else {
            if (x < 1000000) {
                if (x < 100000) {
                    return 5;
                } else {
                    return 6;
                }
            } else {
                if (x < 100000000) {
                    if (x < 10000000) {
                        return 7;
                    } else {
                        return 8;
                    }
                } else {
                    if (x < 1000000000) {
                        return 9;
                    } else {
                        return 10;
                    }
                }
            }
        }
    }
}
