package all;

public class ClonePair8976 {

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
      if (c >= 0x20 && c <= 0x7e)   return true;
      if (c == 9 || c == 10 || c == 13 || c == 0x85)   return true;
      if (c >= 0xa0 && c <= 0xd7ff)   return true;
      if (c >= 0xe000 && c <= 0xfffd)   return true;
      return false;
    }
}
