package all;

public class ClonePair8979 {

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
    switch (c) {
    case 0x9:case 0xa:case 0xd:    return true;
    default:  return ((0x20 <= c && c <= 0xd7ff) || (0xe000 <= c && c <= 0xfffd) || (0x10000 <= c && c <= 0x10ffff));
    }
    }
}
