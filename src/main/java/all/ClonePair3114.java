package all;

public class ClonePair3114 {

    boolean method1(byte[] packetData){
      boolean result=packetData.length >= 10;
      if (result) {
        result=packetData[0] == 'A' && packetData[1] == 'r' && packetData[2] == 't' && packetData[3] == '-' && packetData[4] == 'N' && packetData[5] == 'e' && packetData[6] == 't' && packetData[7] == 0x00;
      }
      return result;
    }

    boolean method2(byte[] b){
      if (b.length < 6) {
        return false;
      }
      return b[0] == 'G' && b[1] == 'I' && b[2] == 'F' && b[3] == '8' && (b[4] == '7' || b[4] == '9') && b[5] == 'a';
    }
}
