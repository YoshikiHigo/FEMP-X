package equivalent;

public class ClonePair10533 {
    Integer method1(String src) {
        if (src == null || src.trim().length() == 0) return null;
        return Integer.valueOf(src);
    }

    Integer method2(String iValue) {
        Integer result = null;
        if (iValue != null && iValue.trim().length() > 0) {
            result = Integer.valueOf(iValue);
        }
        return result;
    }
}
