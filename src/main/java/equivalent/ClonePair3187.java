package equivalent;

import java.util.Map;

public class ClonePair3187 {
    int method1(Map map, String key) {
        Object value = map.get(key);
        if (value == null || !(value instanceof Number n)) {
            return 0;
        }
        return n.intValue();
    }

    int method2(Map map, String name) {
        Object val = map.get(name);
        int ret = 0;
        if (val != null && val instanceof Number) {
            ret = ((Number) val).intValue();
        }
        return ret;
    }
}
