package unverified;

public class ClonePair11674 {

    boolean method1(char c){
      if (c >= 0x20 && c <= 0x7e)   return true;
      if (c == 9 || c == 10 || c == 13 || c == 0x85)   return true;
      if (c >= 0xa0 && c <= 0xd7ff)   return true;
      if (c >= 0xe000 && c <= 0xfffd)   return true;
      return false;
    }

    boolean method2(char c){
    switch (c) {
    case 0x9:case 0xa:case 0xd:    return true;
    default:  return ((0x20 <= c && c <= 0xd7ff) || (0xe000 <= c && c <= 0xfffd) || (0x10000 <= c && c <= 0x10ffff));
    }
    }
}
