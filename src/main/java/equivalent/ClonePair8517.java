package equivalent;

public class ClonePair8517 {
    Double method1(String str) {
        Double d = null;
        try {
            d = Double.parseDouble(str);
        } catch (Exception e) {
            if (str != null) try {
                d = Double.parseDouble(str.replace(',', '.'));
            } catch (Exception e1) {
            }
        }
        return d;
    }

    Double method2(String param) {
        if (param == null || param.length() == 0) return null;
        try {
            return Double.parseDouble(param.replace(',', '.'));
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
