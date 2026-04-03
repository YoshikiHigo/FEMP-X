package equivalent;

public class ClonePair3201 {
    String method1(byte[] data, String sep) {
        final StringBuffer sb = new StringBuffer();
        for (int i = 0; i < data.length; ++i) {
            final int no = data[i] & 0xff;
            if (no < 0x10) sb.append('0');
            sb.append(Integer.toHexString(no));
            if (sep != null && i < data.length - 1) sb.append(sep);
        }
        return sb.toString();
    }

    String method2(byte[] bytes, String separator) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bytes.length; i++) {
            String code = Integer.toHexString(bytes[i] & 0xFF);
            if ((bytes[i] & 0xFF) < 16) {
                sb.append('0');
            }
            sb.append(code);
            if (separator != null && i < bytes.length - 1) {
                sb.append(separator);
            }
        }
        return sb.toString();
    }
}
