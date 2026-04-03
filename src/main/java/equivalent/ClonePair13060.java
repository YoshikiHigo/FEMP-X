package equivalent;

public class ClonePair13060 {
    String method1(String str, String find, String replace) {
        int strlen, findlen;
        char[] chars, replaceChars;
        if (str == null || ((strlen = (chars = str.toCharArray()).length) < (findlen = find.length()))) {
            return str;
        }
        replaceChars = replace.toCharArray();
        final StringBuilder sb = new StringBuilder(strlen);
        int sCut = 0;
        for (int eCut; (eCut = str.indexOf(find, sCut)) != -1; sCut = eCut + findlen) {
            sb.append(chars, sCut, (eCut - sCut)).append(replaceChars);
        }
        return sCut > 0 ? sb.append(chars, sCut, (strlen - sCut)).toString() : str;
    }

    String method2(String expression, String oldString, String newString) {
        String replacedExpression = expression;
        if (replacedExpression != null) {
            int charCtr = 0;
            int oldStringIndex = replacedExpression.indexOf(oldString, charCtr);
            while (oldStringIndex > -1) {
                final StringBuffer buffer = new StringBuffer(replacedExpression.substring(0, oldStringIndex) + replacedExpression.substring(oldStringIndex + oldString.length()));
                buffer.insert(oldStringIndex, newString);
                replacedExpression = buffer.toString();
                charCtr = oldStringIndex + newString.length();
                if (charCtr < replacedExpression.length()) {
                    oldStringIndex = replacedExpression.indexOf(oldString, charCtr);
                } else {
                    oldStringIndex = -1;
                }
            }
        }
        return replacedExpression;
    }
}
