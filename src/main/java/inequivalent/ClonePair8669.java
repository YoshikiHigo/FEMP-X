package inequivalent;

public class ClonePair8669 {

    int method1(double n) {
        double ceil = Math.ceil(n);
        if (ceil >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (ceil <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int) ceil;
    }

    int method2(double n) {
        double floor = Math.floor(n);
        if (floor >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (floor <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int) floor;
    }
}
