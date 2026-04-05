package all;

public class ClonePair2878 {

    boolean method1(byte[] sysex){
      if (sysex.length < 16)   return false;
      return sysex[0] == 0x41 && sysex[2] == 0x46 && sysex[3] == 0x12;
    }

    boolean method2(byte[] address){
      if (address.length == 16 && (address[0] == 0x00) && (address[1] == 0x00) && (address[2] == 0x00) && (address[3] == 0x00) && (address[4] == 0x00) && (address[5] == 0x00) && (address[6] == 0x00) && (address[7] == 0x00) && (address[8] == 0x00) && (address[9] == 0x00) && (address[10] == (byte)0xFF) && (address[11] == (byte)0xFF)) {
        return true;
      }
      return false;
    }
}
