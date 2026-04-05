package unverified;

public class ClonePair11671 {

    boolean method1(char c){
      if (c >= 0x20 && c <= 0x7e)   return true;
      if (c == 9 || c == 10 || c == 13 || c == 0x85)   return true;
      if (c >= 0xa0 && c <= 0xd7ff)   return true;
      if (c >= 0xe000 && c <= 0xfffd)   return true;
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
