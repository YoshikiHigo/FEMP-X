package equivalent;

public class ClonePair12527 {
    boolean method1(String header, byte[] sysex) {
        if (sysex.length < 16) return false;
        return sysex[0] == (byte) 0xF0 && sysex[1] == 0x41 && sysex[3] == 0x60 && sysex[4] == 0x12;
    }

    boolean method2(String header, byte[] sysex) {
        if (sysex.length < 16) {
            return false;
        }
        return sysex[0] == (byte) 0xF0 && sysex[1] == 0x41 && sysex[3] == 0x60 && sysex[4] == 0x12;
    }
}
