package unverified;

public class ClonePair8661 {

    boolean method1(char ch){
      if (ch == 0x9 || ch == 0xA || ch == 0xD)   return true;
      if ((0x20 <= ch) && (ch <= 0xD7FF))   return true;
      if ((0xE000 <= ch) && (ch <= 0xFFFD))   return true;
      if ((0x10000 <= ch) && (ch <= 0x10FFFF))   return true;
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
