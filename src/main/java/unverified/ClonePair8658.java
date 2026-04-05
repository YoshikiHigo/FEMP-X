package unverified;

public class ClonePair8658 {

    boolean method1(char ch){
      if (ch == 0x9 || ch == 0xA || ch == 0xD)   return true;
      if ((0x20 <= ch) && (ch <= 0xD7FF))   return true;
      if ((0xE000 <= ch) && (ch <= 0xFFFD))   return true;
      if ((0x10000 <= ch) && (ch <= 0x10FFFF))   return true;
      return false;
    }

    boolean method2(char character){
      if ((character == 0x9) || (character == 0xA) || (character == 0xD)|| ((character >= 0x20) && (character <= 0xD7FF))|| ((character >= 0xE000) && (character <= 0xFFFD))|| ((character >= 0x10000) && (character <= 0x10FFFF))) {
        return true;
      }
      return false;
    }
}
