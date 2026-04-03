package equivalent;

public class ClonePair7094 {
    String method1(byte[] in) {
        byte ch = 0x00;
        int i = 0;
        if (in == null || in.length <= 0) return null;
        String[] pseudo = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        StringBuffer out = new StringBuffer(in.length * 2);
        while (i < in.length) {
            if ((in[i] >= '0' && in[i] <= '9') || (in[i] >= 'a' && in[i] <= 'z') || (in[i] >= 'A' && in[i] <= 'Z') || in[i] == '$' || in[i] == '-' || in[i] == '_' || in[i] == '.' || in[i] == '+' || in[i] == '!') {
                out.append((char) in[i]);
                i++;
            } else {
                out.append('%');
                ch = (byte) (in[i] & 0xF0);
                ch = (byte) (ch >>> 4);
                ch = (byte) (ch & 0x0F);
                out.append(pseudo[ch]);
                ch = (byte) (in[i] & 0x0F);
                out.append(pseudo[ch]);
                i++;
            }
        }
        return new String(out);
    }

    String method2(byte[] in) {
        byte ch = 0x00;
        int i = 0;
        if (in == null || in.length <= 0) {
            return null;
        }
        String[] pseudo = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        StringBuffer out = new StringBuffer(in.length * 2);
        while (i < in.length) {
            if ((in[i] >= '0' && in[i] <= '9') || (in[i] >= 'a' && in[i] <= 'z') || (in[i] >= 'A' && in[i] <= 'Z') || in[i] == '$' || in[i] == '-' || in[i] == '_' || in[i] == '.' || in[i] == '+' || in[i] == '!') {
                out.append((char) in[i]);
                i++;
            } else {
                out.append('%');
                ch = (byte) (in[i] & 0xF0);
                ch = (byte) (ch >>> 4);
                ch = (byte) (ch & 0x0F);
                out.append(pseudo[ch]);
                ch = (byte) (in[i] & 0x0F);
                out.append(pseudo[ch]);
                i++;
            }
        }
        String rslt = new String(out);
        return rslt;
    }
}
