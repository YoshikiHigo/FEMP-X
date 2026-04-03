package inequivalent;

public class ClonePair4858 {

    String method1(String s, int index, int length) {
        String returnVal = "";
        if (index < s.length()) {
            int RightIndex = index + length;
            if (RightIndex >= s.length()) {
                returnVal = s.substring(index);
            } else {
                returnVal = s.substring(index, RightIndex);
            }
        }
        return returnVal;
    }

    String method2(String inputStr, int beginIndex, int length) {
        int strLength = inputStr.length();
        if (beginIndex >= strLength) {
            return "";
        }
        if (beginIndex + length >= strLength) {
            return inputStr.substring(beginIndex);
        }
        return inputStr.substring(beginIndex, beginIndex + length - 1) + "...";
    }
}
