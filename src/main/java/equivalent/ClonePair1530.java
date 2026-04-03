package equivalent;

public class ClonePair1530 {
    String method1(byte[] b) {
        StringBuffer sb = new StringBuffer((b.length / 3) * 4);
        int i = 0;
        int remaining = b.length;
        char[] c = new char[4];
        while (remaining > 0) {
            c[0] = (char) ((b[i] & 0xFC) >> 2);
            c[1] = (char) ((b[i] & 0x03) << 4);
            if (remaining >= 2) {
                c[1] += (char) ((b[i + 1] & 0xF0) >> 4);
                c[2] = (char) ((b[i + 1] & 0x0F) << 2);
                if (remaining >= 3) {
                    c[2] += (char) ((b[i + 2] & 0xC0) >> 6);
                    c[3] = (char) (b[i + 2] & 0x3F);
                } else {
                    c[3] = 64;
                }
            } else {
                c[2] = 64;
                c[3] = 64;
            }
            for (int j = 0; j < 4; j++) {
                if (c[j] < 26) {
                    c[j] += 'A';
                } else if (c[j] < 52) {
                    c[j] = (char) (c[j] - 26 + 'a');
                } else if (c[j] < 62) {
                    c[j] = (char) (c[j] - 52 + '0');
                } else if (c[j] == 62) {
                    c[j] = '+';
                } else if (c[j] == 63) {
                    c[j] = '/';
                } else {
                    c[j] = '=';
                }
            }
            sb.append(c);
            i += 3;
            remaining -= 3;
        }
        return sb.toString();
    }

    String method2(byte[] data) {
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/=".toCharArray();
        char[] out = new char[((data.length + 2) / 3) * 4];
        for (int i = 0, index = 0; i < data.length; i += 3, index += 4) {
            boolean quad = false;
            boolean trip = false;
            int val = (0xFF & data[i]);
            val <<= 8;
            if ((i + 1) < data.length) {
                val |= (0xFF & data[i + 1]);
                trip = true;
            }
            val <<= 8;
            if ((i + 2) < data.length) {
                val |= (0xFF & data[i + 2]);
                quad = true;
            }
            out[index + 3] = alphabet[(quad ? (val & 0x3F) : 64)];
            val >>= 6;
            out[index + 2] = alphabet[(trip ? (val & 0x3F) : 64)];
            val >>= 6;
            out[index + 1] = alphabet[val & 0x3F];
            val >>= 6;
            out[index] = alphabet[val & 0x3F];
        }
        return new String(out);
    }
}
