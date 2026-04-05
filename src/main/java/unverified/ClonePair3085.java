package unverified;

public class ClonePair3085 {

    boolean method1(byte[] block){
      if (block.length < 8)   return false;
      return block[0] == 0x6c && block[1] == 0 && block[2] == 0 && block[3] == 1 && block[4] == 0x49 && block[5] == 0x49 && block[6] == 0;
    }

    boolean method2(byte[] packetData){
      boolean result=packetData.length >= 10;
      if (result) {
        result=packetData[0] == 'A' && packetData[1] == 'r' && packetData[2] == 't' && packetData[3] == '-' && packetData[4] == 'N' && packetData[5] == 'e' && packetData[6] == 't' && packetData[7] == 0x00;
      }
      return result;
    }
}
