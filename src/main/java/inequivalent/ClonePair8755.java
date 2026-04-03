package inequivalent;

public class ClonePair8755 {

    boolean method1(String text, String pattern) {
        if (text == null && pattern == null) return true;
        if (text == null || pattern == null) return false;
        if (text.equals(pattern)) return true;
        String[] cards = pattern.split("\\*");
        for (String card : cards) {
            int idx = text.indexOf(card);
            if (idx == -1) {
                return false;
            }
            text = text.substring(idx + card.length());
        }
        return true;
    }

    boolean method2(String filename, String extension) {
        if (filename == null || extension == null) {
            return filename == extension;
        }
        int i = filename.length() - extension.length();
        return filename.regionMatches(true, i < 0 ? 0 : i, extension, 0, extension.length());
    }
}
