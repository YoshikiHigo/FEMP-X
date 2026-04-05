package unverified;

public class ClonePair11340 {

    boolean method1(char character){
      if ((character == 0x9) || (character == 0xA) || (character == 0xD)|| ((character >= 0x20) && (character <= 0xD7FF))|| ((character >= 0xE000) && (character <= 0xFFFD))|| ((character >= 0x10000) && (character <= 0x10FFFF))) {
        return true;
      }
      return false;
    }

    boolean method2(char c){
    switch (c) {
    case 0x9:case 0xa:case 0xd:    return true;
    default:  return ((0x20 <= c && c <= 0xd7ff) || (0xe000 <= c && c <= 0xfffd) || (0x10000 <= c && c <= 0x10ffff));
    }
    }
}
