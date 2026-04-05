package all;

public class ClonePair11337 {

    boolean method1(char character){
      if ((character == 0x9) || (character == 0xA) || (character == 0xD)|| ((character >= 0x20) && (character <= 0xD7FF))|| ((character >= 0xE000) && (character <= 0xFFFD))|| ((character >= 0x10000) && (character <= 0x10FFFF))) {
        return true;
      }
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
