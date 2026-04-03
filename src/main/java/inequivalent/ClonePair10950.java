package inequivalent;

public class ClonePair10950 {

    String method1(String str, int newLength, String paddingString) {
        if ((newLength <= str.length()) || (paddingString.length() == 0)) {
            return str;
        }
        StringBuffer buff = new StringBuffer(newLength);
        buff.append(str);
        int diff = newLength - str.length();
        while (diff > 0) {
            if (diff > paddingString.length()) {
                diff = paddingString.length();
            }
            buff.append(paddingString, 0, diff);
            diff = newLength - buff.length();
        }
        return buff.toString();
    }

    String method2(String str, int length, String padStr) {
        if (str.length() >= length) {
            return str;
        }
        str = padStr + str;
        while (str.length() < length) {
            str += (padStr + str);
        }
        return str;
    }
}
