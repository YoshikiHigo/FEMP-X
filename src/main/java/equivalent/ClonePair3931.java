package equivalent;

public class ClonePair3931 {
    String method1(Long interval) {
        String unit;
        double val;
        double tmp;
        if (interval == null) {
            return null;
        }
        if ((tmp = interval.doubleValue() / 1000.0) < 1) {
            return (tmp == 0.0 ? "off" : interval.toString());
        }
        if ((tmp = ((val = tmp) / 60.0)) >= 1.0) {
            if ((tmp = ((val = tmp) / 60.0)) >= 1.0) {
                if ((tmp = ((val = tmp) / 24.0)) >= 1.0) {
                    val = tmp;
                    unit = "d";
                } else {
                    unit = "h";
                }
            } else {
                unit = "m";
            }
        } else {
            unit = "s";
        }
        val = Math.round(val * 100.0) / 100.0;
        return (val == Math.floor(val) ? String.valueOf((int) val) : String.valueOf(val)) + unit;
    }

    String method2(Long interval) {
        String unit;
        double val;
        double tmp;
        if (interval == null) {
            return null;
        }
        if ((tmp = interval.doubleValue() / 1000.0) < 1.0) {
            return ((tmp == 0.0) ? "off" : interval.toString());
        }
        if ((tmp = ((val = tmp) / 60.0)) >= 1.0) {
            if ((tmp = ((val = tmp) / 60.0)) >= 1.0) {
                if ((tmp = ((val = tmp) / 24.0)) >= 1.0) {
                    val = tmp;
                    unit = "d";
                } else {
                    unit = "h";
                }
            } else {
                unit = "m";
            }
        } else {
            unit = "s";
        }
        val = Math.round(val * 100.0) / 100.0;
        return ((val == Math.floor(val)) ? String.valueOf((int) val) : String.valueOf(val)) + unit;
    }
}
