package inequivalent;

public class ClonePair8196 {

    boolean method1(Object groupBy) {
        if (groupBy == null) {
            return false;
        }
        if (groupBy instanceof Number num) {
            return num.longValue() != 0;
        }
        return true;
    }

    boolean method2(Object object) {
        if (object instanceof Boolean) {
            return ((Boolean) object).booleanValue();
        }
        if (object instanceof Number) {
            return ((Number) object).intValue() != 0;
        }
        return object != null;
    }
}
