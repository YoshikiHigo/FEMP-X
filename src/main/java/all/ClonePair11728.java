package all;

public class ClonePair11728 {

    boolean method1(char c){
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

    boolean method2(char c){
    switch (c) {
    case 0x9:case 0xa:case 0xd:    return true;
    default:  return ((0x20 <= c && c <= 0xd7ff) || (0xe000 <= c && c <= 0xfffd) || (0x10000 <= c && c <= 0x10ffff));
    }
    }
}
