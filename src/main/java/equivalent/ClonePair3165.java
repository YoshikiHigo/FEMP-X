package equivalent;

public class ClonePair3165 {
    boolean method1(String range, Integer val) {
        String[] boundries = range.split("-");
        return val >= Integer.valueOf(boundries[0]) && val <= Integer.valueOf(boundries[1]);
    }

    boolean method2(String range, Integer val) {
        String[] boundries = range.split("-");
        return val >= Integer.valueOf(boundries[0]) && val <= Integer.valueOf(boundries[1]);
    }
}
