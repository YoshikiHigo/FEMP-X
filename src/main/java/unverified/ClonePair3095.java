package unverified;

public class ClonePair3095 {

    boolean method1(byte[] sysex){
      if (sysex.length < 16) {
        return false;
      }
      return sysex[0] == 0x41 && sysex[2] == 0x46 && sysex[3] == 0x12;
    }

    boolean method2(byte[] address){
      if (address.length == 16) {
        return (address[0] & 0xFF) == 0x20 && (address[1] & 0xFF) == 0x01 && (address[2] & 0xFF) == 0x0D && (address[3] & 0xFF) == 0xB8;
      }
      return false;
    }
}
