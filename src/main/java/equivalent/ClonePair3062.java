package equivalent;

public class ClonePair3062 {
    double method1(String str) {
        if (str == null || str.equals("")) {
            return 0;
        }
        return (Double.parseDouble(str));
    }

    double method2(String srcValue) {
        if (srcValue == null || srcValue.equals("")) return 0;
        return Double.parseDouble(srcValue);
    }
}
