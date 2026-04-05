package all;

public class ClonePair2924 {

    boolean method1(byte[] address){
      if (address.length == 16 && (address[0] == 0x00) && (address[1] == 0x00) && (address[2] == 0x00) && (address[3] == 0x00) && (address[4] == 0x00) && (address[5] == 0x00) && (address[6] == 0x00) && (address[7] == 0x00) && (address[8] == 0x00) && (address[9] == 0x00) && (address[10] == (byte)0xFF) && (address[11] == (byte)0xFF)) {
        return true;
      }
      return false;
    }

    boolean method2(byte[] packetData){
      boolean result=packetData.length >= 10;
      if (result) {
        result=packetData[0] == 'A' && packetData[1] == 'r' && packetData[2] == 't' && packetData[3] == '-' && packetData[4] == 'N' && packetData[5] == 'e' && packetData[6] == 't' && packetData[7] == 0x00;
      }
      return result;
    }
}
