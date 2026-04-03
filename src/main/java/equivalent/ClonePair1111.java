package equivalent;

public class ClonePair1111 {
    String method1(byte[] resp) {
        StringBuffer buf = new StringBuffer(resp.length * 2);
        for (int i = 0; i < resp.length; i++) {
            int h = (resp[i] & 0xf0) >> 4;
            int j = (resp[i] & 0x0f);
            buf.append(new Character((char) ((h > 9) ? 'a' + h - 10 : '0' + h)));
            buf.append(new Character((char) ((j > 9) ? 'a' + j - 10 : '0' + j)));
        }
        return buf.toString();
    }

    String method2(byte[] md5) {
        int len = md5.length;
        StringBuffer res = new StringBuffer(len);
        for (int i = 0; i < len; ++i) {
            if (md5[i] < 0) {
                res.append(Integer.toHexString(md5[i] + 256));
            } else {
                String rs = Integer.toHexString(md5[i]);
                if (rs.length() == 1) {
                    res.append('0');
                }
                res.append(rs);
            }
        }
        return res.toString();
    }
}
