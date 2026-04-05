package all;

public class ClonePair8663 {

    boolean method1(char ch){
      if (ch == 0x9 || ch == 0xA || ch == 0xD)   return true;
      if ((0x20 <= ch) && (ch <= 0xD7FF))   return true;
      if ((0xE000 <= ch) && (ch <= 0xFFFD))   return true;
      if ((0x10000 <= ch) && (ch <= 0x10FFFF))   return true;
      return false;
    }

    boolean method2(char c){
    switch (c) {
    case 0x9:case 0xa:case 0xd:    return true;
    default:  return ((0x20 <= c && c <= 0xd7ff) || (0xe000 <= c && c <= 0xfffd) || (0x10000 <= c && c <= 0x10ffff));
    }
    }
}
