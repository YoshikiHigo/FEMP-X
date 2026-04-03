package equivalent;

public class ClonePair13271 {
    String method1(String str, String f_s, String t_s) {
        int pos = 0;
        String res = "";
        while (pos < str.length()) {
            int p1 = str.indexOf(f_s, pos);
            if (p1 == -1) {
                res += str.substring(pos);
                break;
            }
            res += str.substring(pos, p1) + t_s;
            pos = p1 + f_s.length();
        }
        return (res);
    }

    String method2(String src, String replace, String with) {
        String result;
        int pos;
        result = "";
        while (!src.equals("")) {
            pos = src.indexOf(replace);
            if (pos == -1) {
                result += src;
                src = "";
            } else {
                result += src.substring(0, pos) + with;
                src = src.substring(pos + replace.length());
            }
        }
        return result;
    }
}
