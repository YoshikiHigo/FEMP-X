package unverified;

public class ClonePair3052 {

    boolean method1(byte[] data){
      if (data.length < 4) {
        return false;
      }
      return (0x89 == (data[0] & 0xff)) && (0x50 == (data[1] & 0xff)) && (0x4E == (data[2] & 0xff))&& (0x47 == (data[3] & 0xff));
    }

    boolean method2(byte[] address){
      if (address.length == 16) {
        return (address[0] & 0xFF) == 0x20 && (address[1] & 0xFF) == 0x01 && (address[2] & 0xFF) == 0x0D && (address[3] & 0xFF) == 0xB8;
      }
      return false;
    }
}
