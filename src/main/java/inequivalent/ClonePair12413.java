package inequivalent;

public class ClonePair12413 {

    String method1(String content, int length) {
        if (null != content && !"".equals(content)) {
            if (content.length() > length) {
                content = content.substring(0, length) + "...";
            }
            return content;
        } else {
            return "";
        }
    }

    String method2(String orig, int length) {
        if (orig == null) return "";
        if (orig.length() < length) return orig;
        else return orig.substring(0, length);
    }
}
