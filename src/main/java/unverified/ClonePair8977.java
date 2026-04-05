package unverified;

public class ClonePair8977 {

    boolean method1(char c){
      if (c == '\n')   return true;
      if (c == '\r')   return true;
      if (c == '\t')   return true;
      if (c < 0x20)   return false;
      if (c <= 0xD7FF)   return true;
      if (c < 0xE000)   return false;
      if (c <= 0xFFFD)   return true;
      if (c < 0x10000)   return false;
      if (c <= 0x10FFFF)   return true;
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
