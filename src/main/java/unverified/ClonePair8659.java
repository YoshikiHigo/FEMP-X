package unverified;

public class ClonePair8659 {

    boolean method1(char ch){
      if (ch == 0x9 || ch == 0xA || ch == 0xD)   return true;
      if ((0x20 <= ch) && (ch <= 0xD7FF))   return true;
      if ((0xE000 <= ch) && (ch <= 0xFFFD))   return true;
      if ((0x10000 <= ch) && (ch <= 0x10FFFF))   return true;
      return false;
    }

    boolean method2(char c){
      if (c >= 0x20 && c <= 0x7e)   return true;
      if (c == 9 || c == 10 || c == 13 || c == 0x85)   return true;
      if (c >= 0xa0 && c <= 0xd7ff)   return true;
      if (c >= 0xe000 && c <= 0xfffd)   return true;
      return false;
    }
}
