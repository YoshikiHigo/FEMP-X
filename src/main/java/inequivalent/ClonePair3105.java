package inequivalent;

public class ClonePair3105 {

    boolean method1(byte[] address) {
        if (address.length == 16) {
            return (address[0] & 0xFF) == 0x20 && (address[1] & 0xFF) == 0x01 && (address[2] & 0xFF) == 0x0D && (address[3] & 0xFF) == 0xB8;
        }
        return false;
    }

    boolean method2(byte[] packetData) {
        boolean result = packetData.length >= 10;
        if (result) {
            result = packetData[0] == 'A' && packetData[1] == 'r' && packetData[2] == 't' && packetData[3] == '-' && packetData[4] == 'N' && packetData[5] == 'e' && packetData[6] == 't' && packetData[7] == 0x00;
        }
        return result;
    }
}
