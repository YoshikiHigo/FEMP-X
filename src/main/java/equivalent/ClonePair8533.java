package equivalent;

public class ClonePair8533 {
    Double method1(String dValue) {
        Double result = null;
        if (dValue != null && dValue.trim().length() > 0) {
            result = Double.valueOf(dValue);
        }
        return result;
    }

    Double method2(String token) {
        if (token != null && !"".equals(token.trim())) {
            return Double.valueOf(token);
        } else {
            return null;
        }
    }
}
