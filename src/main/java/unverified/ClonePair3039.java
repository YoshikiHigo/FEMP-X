package unverified;

public class ClonePair3039 {

    boolean method1(byte[] head){
      if (head.length != 10)   return false;
      if (head[0] != 'I' || head[1] != 'D' || head[2] != '3')   return false;
      if (head[3] == (byte)255 || head[4] == (byte)255)   return false;
      if ((head[6] & 0xff) >= 128 || (head[7] & 0xff) >= 128 || (head[8] & 0xff) >= 128 || (head[9] & 0xff) >= 128)   return false;
      return true;
    }

    boolean method2(byte[] packetData){
      boolean result=packetData.length >= 10;
      if (result) {
        result=packetData[0] == 'A' && packetData[1] == 'r' && packetData[2] == 't' && packetData[3] == '-' && packetData[4] == 'N' && packetData[5] == 'e' && packetData[6] == 't' && packetData[7] == 0x00;
      }
      return result;
    }
}
