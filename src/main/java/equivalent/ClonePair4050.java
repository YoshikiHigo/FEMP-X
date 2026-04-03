package equivalent;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class ClonePair4050 {
    Map method1(Map map) {
        if (map instanceof HashMap) {
            return (Map) ((HashMap) map).clone();
        } else if (map instanceof SortedMap) {
            if (map instanceof TreeMap) {
                return (Map) ((TreeMap) map).clone();
            } else {
                return new TreeMap((SortedMap) map);
            }
        }
        return new HashMap(map);
    }

    Map method2(Map map) {
        if (map instanceof HashMap) {
            return (Map) ((HashMap) map).clone();
        }
        if (map instanceof SortedMap) {
            if (map instanceof TreeMap) {
                return (Map) ((TreeMap) map).clone();
            } else {
                return new TreeMap((SortedMap) map);
            }
        }
        return new HashMap(map);
    }
}
