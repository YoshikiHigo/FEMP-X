package inequivalent;

public class ClonePair3109 {

    boolean method1(byte[] address) {
        return address.length == 16 && (address[0] == 0x00) && (address[1] == 0x00) && (address[2] == 0x00) && (address[3] == 0x00) && (address[4] == 0x00) && (address[5] == 0x00) && (address[6] == 0x00) && (address[7] == 0x00) && (address[8] == 0x00) && (address[9] == 0x00) && (address[10] == 0x00) && (address[11] == 0x00);
    }

    boolean method2(byte[] address) {
        if (address.length == 4 || address.length == 16) {
            byte test = 0;
            for (int i = 0; i < address.length; i++) {
                test |= address[i];
            }
            return (test == 0x00);
        }
        return false;
    }
}
