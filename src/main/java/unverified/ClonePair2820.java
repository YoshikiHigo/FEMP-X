package unverified;

public class ClonePair2820 {

    boolean method1(byte[] imageData){
      if (imageData.length < 5) {
        return false;
      }
      return ((imageData[0] == '%') && (imageData[1] == 'P') && (imageData[2] == 'D')&& (imageData[3] == 'F')&& (imageData[4] == '-'));
    }

    boolean method2(byte[] packetData){
      boolean result=packetData.length >= 10;
      if (result) {
        result=packetData[0] == 'A' && packetData[1] == 'r' && packetData[2] == 't' && packetData[3] == '-' && packetData[4] == 'N' && packetData[5] == 'e' && packetData[6] == 't' && packetData[7] == 0x00;
      }
      return result;
    }
}
