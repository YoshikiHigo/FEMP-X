package inequivalent;

public class ClonePair2799 {

    boolean method1(byte[] imageData) {
        if (imageData.length < 5) {
            return false;
        }
        return ((imageData[0] == '%') && (imageData[1] == 'P') && (imageData[2] == 'D') && (imageData[3] == 'F') && (imageData[4] == '-'));
    }

    boolean method2(byte[] sysex) {
        if (sysex.length < 16) return false;
        return sysex[0] == 0x41 && sysex[2] == 0x46 && sysex[3] == 0x12;
    }
}
