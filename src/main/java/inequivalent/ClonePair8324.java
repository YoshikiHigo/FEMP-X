package inequivalent;

public class ClonePair8324 {

    boolean method1(String filter, String labelValue) {
        if (filter != null && filter.length() > 0) {
            if (filter.length() > labelValue.length()) {
                return false;
            }
            for (int i = 0; i < filter.length(); i++) {
                if (Character.toLowerCase(filter.charAt(i)) != Character.toLowerCase(labelValue.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    boolean method2(String value, String defaultValue) {
        boolean bRet = null == value || "".equals(value) || defaultValue.equals(value);
        return bRet;
    }
}
