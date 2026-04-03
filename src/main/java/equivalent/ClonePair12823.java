package equivalent;

public class ClonePair12823 {
    String method1(String source, String key, String defaultValue) {
        if (source == null || key == null) {
            return defaultValue;
        }
        int i = source.indexOf(key + "=");
        if (i < 0) {
            return defaultValue;
        }
        int j = i + key.length() + 1;
        int k = source.indexOf("::", j);
        if (k < 0) {
            k = source.length();
        }
        try {
            return source.substring(j, k);
        } catch (Exception _ex) {
            return defaultValue;
        }
    }

    String method2(String s, String param, String def) {
        if (s == null || param == null) return def;
        int ix = s.indexOf(param + "=");
        if (ix < 0) return def;
        int startIdx = ix + param.length() + 1;
        int endIdx = s.indexOf("::", startIdx);
        if (endIdx < 0) endIdx = s.length();
        try {
            return s.substring(startIdx, endIdx);
        } catch (Exception e) {
            return def;
        }
    }
}
