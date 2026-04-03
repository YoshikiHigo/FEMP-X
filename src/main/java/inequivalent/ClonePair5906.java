package inequivalent;

public class ClonePair5906 {

    int method1(int input, int divisor) {
        int rank = 0;
        while (input % divisor == 0) {
            input /= divisor;
            rank++;
        }
        return rank;
    }

    int method2(int value, int base) {
        int count = 0;
        while (value > base) {
            value = value - base;
            count++;
        }
        if (((value * 2) / base) > 0) {
            count++;
        }
        return count;
    }
}
