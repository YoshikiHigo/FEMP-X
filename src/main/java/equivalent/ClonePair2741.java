package equivalent;

public class ClonePair2741 {
    double method1(String s) {
        if (s == null || s.isEmpty()) {
            return 0.0d;
        }
        try {
            return Double.parseDouble(s);
        } catch (Throwable t) {
            return 0.0d;
        }
    }

    double method2(String _data) {
        try {
            if (_data == null || _data.length() <= 0) return 0;
            return Double.parseDouble(_data);
        } catch (Exception err) {
            return 0;
        }
    }
}
