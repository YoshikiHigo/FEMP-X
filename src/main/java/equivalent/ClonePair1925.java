package equivalent;

public class ClonePair1925 {
    String method1(byte[] pHexBinary) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < pHexBinary.length; i++) {
            byte b = pHexBinary[i];
            byte c = (byte) ((b & 0xf0) >> 4);
            if (c <= 9) {
                result.append((char) ('0' + c));
            } else {
                result.append((char) ('A' + c - 10));
            }
            c = (byte) (b & 0x0f);
            if (c <= 9) {
                result.append((char) ('0' + c));
            } else {
                result.append((char) ('A' + c - 10));
            }
        }
        return result.toString();
    }

    String method2(byte[] _buffer) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < _buffer.length; i++) {
            if (_buffer[i] <= 0x0F && _buffer[i] > 0x00) buffer.append('0');
            else if (_buffer[i] == 0x00) {
                buffer.append("00");
                continue;
            }
            buffer.append(Integer.toHexString(_buffer[i] & 0xFF).toUpperCase());
        }
        return buffer.toString();
    }
}
