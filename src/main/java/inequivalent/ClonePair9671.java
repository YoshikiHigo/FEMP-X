package inequivalent;

public class ClonePair9671 {

    boolean method1(long lowerBound, long value, long upperBound) {
        if (lowerBound >= value) return false;
        return upperBound > value;
    }

    boolean method2(long start_time, long end_time, long change_time) {
        if (end_time <= start_time) {
            end_time += 24 * 60;
        }
        if (start_time <= change_time && change_time <= end_time) {
            return false;
        } else {
            change_time += 24 * 60;
            return end_time < change_time;
        }
    }
}
