package inequivalent;

import java.util.StringTokenizer;

public class ClonePair8264 {

    boolean method1(String mask, String input) {
        if (mask == null || input == null) {
            return false;
        }
        String lowerMask = mask.trim().toLowerCase();
        String lowerInput = input.trim().toLowerCase();
        int maskLen = lowerMask.length();
        int inputLen = lowerInput.length();
        if ((inputLen <= 0) || (maskLen <= 0)) {
            return false;
        }
        int maskIndex = 0;
        int inputIndex = 0;
        int nextMaskIndex = -1;
        int nextInputIndex = -1;
        char maskChar = '\0';
        boolean doingAsterisk = false;
        while (true) {
            if (maskIndex >= maskLen) {
                if (doingAsterisk || (inputIndex >= inputLen)) return true;
                maskChar = '\0';
            } else {
                maskChar = lowerMask.charAt(maskIndex);
            }
            switch (maskChar) {
                case '*':
                    doingAsterisk = true;
                    nextMaskIndex = ++maskIndex;
                    nextInputIndex = inputIndex;
                    break;
                default:
                    if (inputIndex >= inputLen) return false;
                    doingAsterisk = false;
                    if (maskChar != lowerInput.charAt(inputIndex)) {
                        if (nextMaskIndex != -1) {
                            maskIndex = nextMaskIndex;
                            inputIndex = nextInputIndex++;
                        } else {
                            return false;
                        }
                        if (inputIndex >= inputLen) {
                            return false;
                        }
                    } else {
                        maskIndex++;
                        inputIndex++;
                    }
                    break;
            }
        }
    }

    boolean method2(String src, String substring) {
        if (src == null || "".equals(src)) {
            return false;
        }
        if (substring == null || "".equals(substring)) {
            return false;
        }
        StringTokenizer sS = new StringTokenizer(src, ",");
        while (sS.hasMoreTokens()) {
            if (substring.equals(sS.nextElement())) return true;
        }
        return false;
    }
}
