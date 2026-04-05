package all;

public class ClonePair3030 {

    boolean method1(byte[] head){
      if (head.length != 10)   return false;
      if (head[0] != 'I' || head[1] != 'D' || head[2] != '3')   return false;
      if (head[3] == (byte)255 || head[4] == (byte)255)   return false;
      if ((head[6] & 0xff) >= 128 || (head[7] & 0xff) >= 128 || (head[8] & 0xff) >= 128 || (head[9] & 0xff) >= 128)   return false;
      return true;
    }

    boolean method2(byte[] block){
      if (block.length < 8)   return false;
      return block[0] == 0x6c && block[1] == 0 && block[2] == 0 && block[3] == 1 && block[4] == 0x49 && block[5] == 0x49 && block[6] == 0;
    }
}
