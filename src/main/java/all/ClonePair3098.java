package all;

public class ClonePair3098 {

    boolean method1(byte[] sysex){
      if (sysex.length < 16) {
        return false;
      }
      return sysex[0] == 0x41 && sysex[2] == 0x46 && sysex[3] == 0x12;
    }

    boolean method2(byte[] bytes){
      if (bytes.length != 8)   return false;
      return bytes[0] == -119 && bytes[1] == 80 && bytes[2] == 78 && bytes[3] == 71 && bytes[4] == 13 && bytes[5] == 10 && bytes[6] == 26 && bytes[7] == 10;
    }
}
