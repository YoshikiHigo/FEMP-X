package all;

public class ClonePair2826 {

    boolean method1(byte[] imageData){
      if (imageData.length < 5) {
        return false;
      }
      return ((imageData[0] == '%') && (imageData[1] == 'P') && (imageData[2] == 'D')&& (imageData[3] == 'F')&& (imageData[4] == '-'));
    }

    boolean method2(byte[] bytes){
      if (bytes.length != 8)   return false;
      return bytes[0] == -119 && bytes[1] == 80 && bytes[2] == 78 && bytes[3] == 71 && bytes[4] == 13 && bytes[5] == 10 && bytes[6] == 26 && bytes[7] == 10;
    }
}
