package inequivalent;

public class ClonePair4252 {

    boolean method1(float[] v1, float[] v2) {
        return Float.compare(v1[0], v2[0]) == 0 && Float.compare(v1[1], v2[1]) == 0 && Float.compare(v1[2], v2[2]) == 0;
    }

    boolean method2(float[] v1, float[] v2) {
        return v1[0] == v2[0] && v1[1] == v2[1] && v1[2] == v2[2];
    }
}
