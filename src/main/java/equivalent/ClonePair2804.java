package equivalent;

public class ClonePair2804 {
    double method1(String x) {
        if (x.length() <= 1 || !x.contains(",")) {
            return Double.parseDouble(x);
        } else {
            return Double.parseDouble(x.replace(",", "."));
        }
    }

    double method2(String valueString) {
        if (valueString.contains(",")) {
            valueString = valueString.replace(',', '.');
        }
        return Double.parseDouble(valueString);
    }
}
