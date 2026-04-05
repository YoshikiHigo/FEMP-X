package unverified;

public class ClonePair2810 {

    boolean method1(byte[] imageData){
      if (imageData.length < 5) {
        return false;
      }
      return ((imageData[0] == '%') && (imageData[1] == 'P') && (imageData[2] == 'D')&& (imageData[3] == 'F')&& (imageData[4] == '-'));
    }

    boolean method2(byte[] block){
      if (block.length < 8)   return false;
      return block[0] == 0x6c && block[1] == 0 && block[2] == 0 && block[3] == 1 && block[4] == 0x49 && block[5] == 0x49 && block[6] == 0;
    }
}
