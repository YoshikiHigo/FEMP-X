package unverified;

public class ClonePair2882 {

    boolean method1(byte[] sysex){
      if (sysex.length < 16)   return false;
      return sysex[0] == 0x41 && sysex[2] == 0x46 && sysex[3] == 0x12;
    }

    boolean method2(byte[] sysex){
      if (sysex.length < 16) {
        return false;
      }
      return sysex[0] == 0x41 && sysex[2] == 0x46 && sysex[3] == 0x12;
    }
}
