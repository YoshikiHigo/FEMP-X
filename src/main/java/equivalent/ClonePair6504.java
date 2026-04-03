package equivalent;

public class ClonePair6504 {
    double method1(Object iObject) {
        try {
            double lValue = 0;
            if (iObject == null) {
                return lValue;
            }
            if (iObject instanceof String lString) {
                if (lString.length() > 0) {
                    lValue = Double.parseDouble(lString);
                }
            } else {
                lValue = ((Number) iObject).doubleValue();
            }
            return lValue;
        } catch (ClassCastException lExce) {
            return 0;
        } catch (NumberFormatException lExce) {
            return 0;
        }
    }

    double method2(Object obj) {
        if (obj == null) {
            return 0.0;
        } else if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        } else if (obj instanceof String) {
            try {
                return Double.parseDouble((String) obj);
            } catch (NumberFormatException e) {
            }
        }
        return 0.0;
    }
}
