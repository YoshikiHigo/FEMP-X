package unverified;

public class ClonePair3026 {

    boolean method1(byte[] head){
      if (head.length != 10)   return false;
      if (head[0] != 'I' || head[1] != 'D' || head[2] != '3')   return false;
      if (head[3] == (byte)255 || head[4] == (byte)255)   return false;
      if ((head[6] & 0xff) >= 128 || (head[7] & 0xff) >= 128 || (head[8] & 0xff) >= 128 || (head[9] & 0xff) >= 128)   return false;
      return true;
    }

    boolean method2(byte[] data){
      if (data.length < 4) {
        return false;
      }
      return (0x89 == (data[0] & 0xff)) && (0x50 == (data[1] & 0xff)) && (0x4E == (data[2] & 0xff))&& (0x47 == (data[3] & 0xff));
    }
}
