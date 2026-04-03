package inequivalent;

public class ClonePair3050 {

    boolean method1(byte[] data) {
        if (data.length < 4) {
            return false;
        }
        return (0x89 == (data[0] & 0xff)) && (0x50 == (data[1] & 0xff)) && (0x4E == (data[2] & 0xff)) && (0x47 == (data[3] & 0xff));
    }

    boolean method2(byte[] block) {
        if (block.length < 8) return false;
        return block[0] == 0x6c && block[1] == 0 && block[2] == 0 && block[3] == 1 && block[4] == 0x49 && block[5] == 0x49 && block[6] == 0;
    }
}
