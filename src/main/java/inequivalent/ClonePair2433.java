package inequivalent;

public class ClonePair2433 {

    double method1(String str) {
        str = str.replaceAll(",", ".");
        if (!str.isEmpty()) {
            return Double.parseDouble(str);
        } else {
            return 0;
        }
    }

    double method2(String value) {
        if (value.equals("")) return 0;
        return Double.parseDouble(value);
    }
}
