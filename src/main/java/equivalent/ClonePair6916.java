package equivalent;

public class ClonePair6916 {
    String method1(int x) {
        if (x == 1) return "1st";
        else if (x == 2) return "2nd";
        else if (x == 3) return "3rd";
        else return x + "th";
    }

    String method2(int value) {
        if (value == 1) {
            return "1st";
        } else if (value == 2) {
            return "2nd";
        } else if (value == 3) {
            return "3rd";
        } else {
            return value + "th";
        }
    }
}
