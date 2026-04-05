package unverified;

public class ClonePair3053 {

    boolean method1(byte[] data){
      if (data.length < 4) {
        return false;
      }
      return (0x89 == (data[0] & 0xff)) && (0x50 == (data[1] & 0xff)) && (0x4E == (data[2] & 0xff))&& (0x47 == (data[3] & 0xff));
    }

    boolean method2(byte[] b){
      if (b.length < 8) {
        return false;
      }
      return (b[0] == (byte)137 && b[1] == (byte)80 && b[2] == (byte)78 && b[3] == (byte)71 && b[4] == (byte)13 && b[5] == (byte)10 && b[6] == (byte)26 && b[7] == (byte)10);
    }
}
