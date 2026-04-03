package inequivalent;

public class ClonePair7894 {

    boolean method1(String name, String pwd) {
        return name != null && !name.equals("") && pwd != null && !pwd.equals("");
    }

    boolean method2(String url, String dir) {
        if (url == null || dir == null) {
            return false;
        }
        return url.trim().length() != 0 && dir.trim().length() != 0;
    }
}
