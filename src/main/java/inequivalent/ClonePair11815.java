package inequivalent;

public class ClonePair11815 {

    boolean method1(String str) {
        int strLen;
        if (str == null || "null".equalsIgnoreCase(str) || (strLen = str.length()) == 0 || str.trim().length() == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    boolean method2(String activeCondition) {
        return activeCondition == null || activeCondition.equals("") || activeCondition.equals(" ") || activeCondition.equalsIgnoreCase("null");
    }
}
