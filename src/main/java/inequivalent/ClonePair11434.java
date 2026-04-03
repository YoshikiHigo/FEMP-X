package inequivalent;

public class ClonePair11434 {

    String method1(String data, String from, String to) {
        int len = from.length();
        String r = data;
        int k = r.indexOf(from);
        while (k >= 0) {
            r = data.substring(0, k) + to + data.substring(k + len);
            k = r.indexOf(from, k);
        }
        return r;
    }

    String method2(String inputStr, String patternStr, String replacementStr) {
        int patternLength = patternStr.length();
        int inputLength = inputStr.length();
        int indexOfFlag = inputStr.indexOf(patternStr);
        while (indexOfFlag > -1) {
            inputStr = inputStr.substring(0, indexOfFlag) + replacementStr + inputStr.substring(indexOfFlag + patternLength, inputLength);
            indexOfFlag = inputStr.indexOf(patternStr, indexOfFlag + patternLength);
        }
        return inputStr;
    }
}
