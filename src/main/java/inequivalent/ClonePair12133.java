package inequivalent;

public class ClonePair12133 {

    String method1(String originalString, String stringToReplace, String stringToIntroduce) {
        if (originalString.indexOf(stringToReplace) < 0) {
            return originalString;
        } else {
            StringBuffer buf = new StringBuffer();
            int startIndex = 0;
            int endIndex = originalString.indexOf(stringToReplace);
            do {
                String addString = originalString.substring(startIndex, endIndex);
                buf.append(addString);
                if (endIndex != 0 && endIndex < originalString.length()) {
                    buf.append(stringToIntroduce);
                }
                startIndex = endIndex + stringToReplace.length();
                endIndex = originalString.indexOf(stringToReplace, startIndex);
                if (endIndex == -1) {
                    endIndex = originalString.length();
                }
            }
            while (startIndex <= originalString.length());
            return buf.toString();
        }
    }

    String method2(String text, String orig, String repl) {
        int pos = 0;
        while ((pos = text.indexOf(orig, pos)) >= 0) {
            text = text.substring(0, pos) + repl + text.substring(pos + orig.length());
        }
        return text;
    }
}
