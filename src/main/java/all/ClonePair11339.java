package all;

public class ClonePair11339 {

    boolean method1(char character){
      if ((character == 0x9) || (character == 0xA) || (character == 0xD)|| ((character >= 0x20) && (character <= 0xD7FF))|| ((character >= 0xE000) && (character <= 0xFFFD))|| ((character >= 0x10000) && (character <= 0x10FFFF))) {
        return true;
      }
      return false;
    }

    boolean method2(char c){
      if (c == 0x9 || c == 0xA || c == 0xD) {
        return true;
      }
     else   if (c < 0x20) {
        return false;
      }
     else   if (c <= 0xD7FF) {
        return true;
      }
     else   if (c < 0xE000) {
        return false;
      }
     else   if (c <= 0xFFFD) {
        return true;
      }
      return false;
    }
}
