package equivalent;

public class ClonePair8526 {
    String method1(String string, String[] words, String startHighlight, String endHighlight) {
        if (string == null || words == null || startHighlight == null || endHighlight == null) {
            return null;
        }
        StringBuffer regexp = new StringBuffer();
        regexp.append("(?i)\\b(");
        for (int x = 0; x < words.length; x++) {
            words[x] = words[x].replaceAll("([\\$\\?\\|\\/\\.])", "\\\\$1");
            regexp.append(words[x]);
            if (x != words.length - 1) {
                regexp.append("|");
            }
        }
        regexp.append(")");
        return string.replaceAll(regexp.toString(), startHighlight + "$1" + endHighlight);
    }

    String method2(String string, String[] words, String startHighlight, String endHighlight) {
        if (string == null || words == null || startHighlight == null || endHighlight == null) return null;
        StringBuilder regexp = new StringBuilder();
        regexp.append("(?i)\\b(");
        for (int x = 0; x < words.length; x++) {
            words[x] = words[x].replaceAll("([\\$\\?\\|\\/\\.])", "\\\\$1");
            regexp.append(words[x]);
            if (x != words.length - 1) regexp.append("|");
        }
        regexp.append(")");
        return string.replaceAll(regexp.toString(), startHighlight + "$1" + endHighlight);
    }
}
