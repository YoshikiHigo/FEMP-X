package unverified;

public class ClonePair3087 {

    boolean method1(byte[] block){
      if (block.length < 8)   return false;
      return block[0] == 0x6c && block[1] == 0 && block[2] == 0 && block[3] == 1 && block[4] == 0x49 && block[5] == 0x49 && block[6] == 0;
    }

    boolean method2(byte[] bytes){
      if (bytes.length != 8)   return false;
      return bytes[0] == -119 && bytes[1] == 80 && bytes[2] == 78 && bytes[3] == 71 && bytes[4] == 13 && bytes[5] == 10 && bytes[6] == 26 && bytes[7] == 10;
    }
}
