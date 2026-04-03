package equivalent;

public class ClonePair5079 {
    boolean[] method1(boolean[] s1, boolean[] s2) {
        boolean[] intersection = new boolean[s1.length];
        for (int i = 0; i < intersection.length; i++) {
            intersection[i] = s1[i] && s2[i];
        }
        return intersection;
    }

    boolean[] method2(boolean[] field1, boolean[] field2) {
        boolean[] result = new boolean[field1.length];
        for (int i = 0; i < field1.length; i++) result[i] = field1[i] && field2[i];
        return result;
    }
}
