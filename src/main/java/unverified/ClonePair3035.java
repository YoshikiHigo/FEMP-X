package unverified;

public class ClonePair3035 {

    boolean method1(byte[] head){
      if (head.length != 10)   return false;
      if (head[0] != 'I' || head[1] != 'D' || head[2] != '3')   return false;
      if (head[3] == (byte)255 || head[4] == (byte)255)   return false;
      if ((head[6] & 0xff) >= 128 || (head[7] & 0xff) >= 128 || (head[8] & 0xff) >= 128 || (head[9] & 0xff) >= 128)   return false;
      return true;
    }

    boolean method2(byte[] address){
      if (address.length == 16) {
        return (address[0] & 0xFF) == 0x20 && (address[1] & 0xFF) == 0x01 && (address[2] & 0xFF) == 0x0D && (address[3] & 0xFF) == 0xB8;
      }
      return false;
    }
}
