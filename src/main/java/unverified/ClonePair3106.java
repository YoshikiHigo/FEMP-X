package unverified;

public class ClonePair3106 {

    boolean method1(byte[] address){
      if (address.length == 16) {
        return (address[0] & 0xFF) == 0x20 && (address[1] & 0xFF) == 0x01 && (address[2] & 0xFF) == 0x0D && (address[3] & 0xFF) == 0xB8;
      }
      return false;
    }

    boolean method2(byte[] b){
      if (b.length < 6) {
        return false;
      }
      return b[0] == 'G' && b[1] == 'I' && b[2] == 'F' && b[3] == '8' && (b[4] == '7' || b[4] == '9') && b[5] == 'a';
    }
}
