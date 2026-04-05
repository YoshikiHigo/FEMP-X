package unverified;

public class ClonePair3100 {

    boolean method1(byte[] b){
      if (b.length < 8) {
        return false;
      }
      return (b[0] == (byte)137 && b[1] == (byte)80 && b[2] == (byte)78 && b[3] == (byte)71 && b[4] == (byte)13 && b[5] == (byte)10 && b[6] == (byte)26 && b[7] == (byte)10);
    }

    boolean method2(byte[] address){
      if (address.length == 16) {
        return (address[0] & 0xFF) == 0x20 && (address[1] & 0xFF) == 0x01 && (address[2] & 0xFF) == 0x0D && (address[3] & 0xFF) == 0xB8;
      }
      return false;
    }
}
