package equivalent;

public class ClonePair4059 {
    char method1(String text) {
        int pos = text.indexOf('&');
        if (pos != -1) return text.charAt(pos + 1);
        return 0;
    }

    char method2(String text) {
        int pos = text.indexOf("&");
        if (pos != -1) {
            return text.charAt(pos + 1);
        }
        return 0;
    }
}
