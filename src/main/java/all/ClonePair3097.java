package all;

public class ClonePair3097 {

    boolean method1(byte[] sysex){
      if (sysex.length < 16) {
        return false;
      }
      return sysex[0] == 0x41 && sysex[2] == 0x46 && sysex[3] == 0x12;
    }

    boolean method2(byte[] b){
      if (b.length < 6) {
        return false;
      }
      return b[0] == 'G' && b[1] == 'I' && b[2] == 'F' && b[3] == '8' && (b[4] == '7' || b[4] == '9') && b[5] == 'a';
    }
}
