package all;

public class ClonePair3103 {

    boolean method1(byte[] b){
      if (b.length < 8) {
        return false;
      }
      return (b[0] == (byte)137 && b[1] == (byte)80 && b[2] == (byte)78 && b[3] == (byte)71 && b[4] == (byte)13 && b[5] == (byte)10 && b[6] == (byte)26 && b[7] == (byte)10);
    }

    boolean method2(byte[] b){
      if (b.length < 6) {
        return false;
      }
      return b[0] == 'G' && b[1] == 'I' && b[2] == 'F' && b[3] == '8' && (b[4] == '7' || b[4] == '9') && b[5] == 'a';
    }
}
