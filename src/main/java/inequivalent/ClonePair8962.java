package inequivalent;

public class ClonePair8962 {

    String method1(StringBuffer name) {
        final int maxlen = name.length();
        for (int pos = 0; pos < maxlen; pos++) {
            final char ch = name.charAt(pos);
            if (ch == '@') {
                String userInfo = name.substring(0, pos);
                name.delete(0, pos + 1);
                return userInfo;
            }
            if (ch == '/' || ch == '?') {
                break;
            }
        }
        return null;
    }

    String method2(StringBuffer name) {
        int atHostname = name.lastIndexOf("@");
        int pos = 0;
        while (pos < atHostname) {
            final char ch = name.charAt(pos);
            if (ch == '/' || ch == '?') {
                break;
            }
            pos++;
        }
        String userInfo = null;
        if (pos == atHostname) {
            userInfo = name.substring(0, pos);
            name.delete(0, pos + 1);
        }
        System.out.println("WebdavFileNameParser: " + userInfo);
        return userInfo;
    }
}
