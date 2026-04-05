package unverified;

public class ClonePair3102 {

    boolean method1(byte[] b){
      if (b.length < 8) {
        return false;
      }
      return (b[0] == (byte)137 && b[1] == (byte)80 && b[2] == (byte)78 && b[3] == (byte)71 && b[4] == (byte)13 && b[5] == (byte)10 && b[6] == (byte)26 && b[7] == (byte)10);
    }

    boolean method2(byte[] packetData){
      boolean result=packetData.length >= 10;
      if (result) {
        result=packetData[0] == 'A' && packetData[1] == 'r' && packetData[2] == 't' && packetData[3] == '-' && packetData[4] == 'N' && packetData[5] == 'e' && packetData[6] == 't' && packetData[7] == 0x00;
      }
      return result;
    }
}
