package equivalent;

public class ClonePair4039 {
    String method1(String[] fldNames, String[] fldValues, String seperator) {
        if (fldNames != null && fldValues != null && seperator != null && fldNames.length == fldValues.length) {
            StringBuffer result = new StringBuffer();
            for (int i = 0; i < fldNames.length; i++) {
                result.append(fldNames[i]).append(fldValues[i]);
                if (i != fldNames.length - 1) {
                    result.append(seperator);
                }
            }
            return result.toString();
        }
        return null;
    }

    String method2(String[] fldNames, String[] fldValues, String seperator) {
        if (fldNames != null && fldValues != null && seperator != null && fldNames.length == fldValues.length) {
            String result = "";
            for (int i = 0; i < fldNames.length; i++) {
                result += fldNames[i] + fldValues[i];
                if (i != fldNames.length - 1) {
                    result += seperator;
                }
            }
            return result;
        }
        return null;
    }
}
