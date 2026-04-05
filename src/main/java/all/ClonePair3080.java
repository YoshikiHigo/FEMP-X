package all;

public class ClonePair3080 {

    boolean method1(byte[] block){
      if (block.length < 8)   return false;
      return block[0] == 0x6c && block[1] == 0 && block[2] == 0 && block[3] == 1 && block[4] == 0x49 && block[5] == 0x49 && block[6] == 0;
    }

    boolean method2(byte[] sysex){
      if (sysex.length < 16) {
        return false;
      }
      return sysex[0] == 0x41 && sysex[2] == 0x46 && sysex[3] == 0x12;
    }
}
