package inequivalent;

public class ClonePair12582 {

    boolean method1(int lowerBound, int value, int upperBound) {
        if (lowerBound >= value) return false;
        return upperBound > value;
    }

    boolean method2(int destination, int source, int length) {
        return source + length > destination && destination + length > source;
    }
}
