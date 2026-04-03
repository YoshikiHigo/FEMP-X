package equivalent;

public class ClonePair6584 {
    boolean method1(Integer origId, Integer newId) {
        if (origId == null && newId == null) return false;
        if (origId == null || newId == null) return true;
        return !origId.equals(newId);
    }

    boolean method2(Integer a, Integer b) {
        if (a == null && b == null) {
            return false;
        }
        if (a == null && b != null) {
            return true;
        }
        if (a != null && b == null) {
            return true;
        }
        return a.intValue() != b.intValue();
    }
}
