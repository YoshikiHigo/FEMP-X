package inequivalent;

public class ClonePair5901 {

    float method1(Object aValue) {
        float out = 0.0f;
        if (aValue == null) return out;
        if (aValue instanceof Float f) {
            try {
                out = f.floatValue();
            } catch (Exception ex) {
            }
        } else if (aValue instanceof String s) {
            if (s.length() > 0) {
                try {
                    out = Float.parseFloat(s);
                } catch (Exception ex) {
                }
            }
        }
        return out;
    }

    float method2(Object aValue) {
        float out = 0.0f;
        if (aValue == null) return out;
        if (aValue instanceof Float f) {
            try {
                out = f.floatValue();
            } catch (Exception ex) {
            }
        } else if (aValue instanceof Double f) {
            try {
                out = f.floatValue();
            } catch (Exception ex) {
            }
        } else if (aValue instanceof Integer f) {
            try {
                out = f.floatValue();
            } catch (Exception ex) {
            }
        } else if (aValue instanceof String s) {
            if (s.length() > 0) {
                try {
                    out = Float.parseFloat(s);
                } catch (Exception ex) {
                }
            }
        }
        return out;
    }
}
