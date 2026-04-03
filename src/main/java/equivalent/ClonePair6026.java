package equivalent;

public class ClonePair6026 {
    boolean method1(Object[] o1, Object[] o2) {
        if (o1 == o2) return true;
        if (o1 == null || o2 == null) return false;
        int length = o1.length;
        if (length != o2.length) return false;
        for (int index = 0; index < length; index++) {
            if (!o1[index].equals(o2[index])) return false;
        }
        return true;
    }

    boolean method2(Object[] obj1, Object[] obj2) {
        if (obj1 == obj2) {
            return true;
        } else if (obj1 == null || obj2 == null) {
            return false;
        } else if (obj1.length == obj2.length) {
            for (int i = 0; i < obj1.length; i++) {
                if (!obj1[i].equals(obj2[i])) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
