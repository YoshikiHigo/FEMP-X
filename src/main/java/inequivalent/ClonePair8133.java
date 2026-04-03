package inequivalent;

public class ClonePair8133 {

    int method1(int codepoint, byte[] target, int offset) {
        if (codepoint < 0 || codepoint > 0xFF) codepoint = '?';
        target[offset] = (byte) codepoint;
        return offset + 1;
    }

    int method2(int length, byte[] stream, int offset) {
        if (length >= 0 && length <= 127) {
            stream[offset++] = (byte) length;
        } else {
            int count = 0;
            while (length != 0) {
                stream[offset++] = (byte) length;
                length >>>= 8;
                count++;
            }
            stream[offset++] = (byte) ((count) | 0x80);
        }
        return offset;
    }
}
