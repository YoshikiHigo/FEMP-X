package equivalent;

public class ClonePair11328 {
    String method1(String dataHeader, String fieldName) {
        String token = "";
        String value = "";
        int pos = 0;
        int i = 0;
        int start = 0;
        int end = 0;
        token = String.valueOf(String.valueOf(fieldName) + "=" + '"');
        pos = dataHeader.indexOf(token);
        if (pos > 0) {
            i = pos + token.length();
            start = i;
            token = "\"";
            end = dataHeader.indexOf(token, i);
            if (start > 0 && end > 0) value = dataHeader.substring(start, end);
        }
        return value;
    }

    String method2(String s, String s1) {
        String s2 = "";
        String s3 = "";
        int i = 0;
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        s2 = s1 + "=" + '"';
        i = s.indexOf(s2);
        if (i > 0) {
            int j = i + s2.length();
            int k = j;
            s2 = "\"";
            int l = s.indexOf(s2, j);
            if (k > 0 && l > 0) s3 = s.substring(k, l);
        }
        return s3;
    }
}
