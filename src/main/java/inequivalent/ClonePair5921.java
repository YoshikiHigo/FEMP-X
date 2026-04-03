package inequivalent;

public class ClonePair5921 {

    boolean method1(String val, String start) {
        if (val.length() > start.length()) {
            return val.startsWith(start);
        }
        return false;
    }

    boolean method2(String newName, String inputPrice) {
        if (newName.isEmpty() && inputPrice.isEmpty()) return false;
        boolean flag = false;
        char[] pValue = inputPrice.toCharArray();
        for (int i = 0; i < pValue.length; i++) {
            if (!flag && pValue[i] == '.') flag = true;
            else if (!(Character.isDigit(pValue[i]))) return false;
        }
        return true;
    }
}
