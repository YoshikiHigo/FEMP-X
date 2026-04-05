package all;

public class ClonePair3041 {

    boolean method1(byte[] head){
      if (head.length != 10)   return false;
      if (head[0] != 'I' || head[1] != 'D' || head[2] != '3')   return false;
      if (head[3] == (byte)255 || head[4] == (byte)255)   return false;
      if ((head[6] & 0xff) >= 128 || (head[7] & 0xff) >= 128 || (head[8] & 0xff) >= 128 || (head[9] & 0xff) >= 128)   return false;
      return true;
    }

    boolean method2(byte[] bytes){
      if (bytes.length != 8)   return false;
      return bytes[0] == -119 && bytes[1] == 80 && bytes[2] == 78 && bytes[3] == 71 && bytes[4] == 13 && bytes[5] == 10 && bytes[6] == 26 && bytes[7] == 10;
    }
}
