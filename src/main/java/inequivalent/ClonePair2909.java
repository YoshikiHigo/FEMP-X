package inequivalent;

public class ClonePair2909 {

    boolean method1(byte[] address) {
        return address.length == 16 && (address[0] == 0x00) && (address[1] == 0x00) && (address[2] == 0x00) && (address[3] == 0x00) && (address[4] == 0x00) && (address[5] == 0x00) && (address[6] == 0x00) && (address[7] == 0x00) && (address[8] == 0x00) && (address[9] == 0x00) && (address[10] == (byte) 0xFF) && (address[11] == (byte) 0xFF);
    }

    boolean method2(byte[] head) {
        if (head.length != 10) return false;
        if (head[0] != 'I' || head[1] != 'D' || head[2] != '3') return false;
        if (head[3] == (byte) 255 || head[4] == (byte) 255) return false;
        return (head[6] & 0xff) < 128 && (head[7] & 0xff) < 128 && (head[8] & 0xff) < 128 && (head[9] & 0xff) < 128;
    }
}
