package all;

public class ClonePair5296 {

    boolean method1(int i){
      if (i >= 0x20 && i <= 0xD7FF)   return true;
      if (i == 0x09 || i == 0x0a || i == 0x0d)   return true;
      if (i >= 0xE000 && i <= 0xFFFD)   return true;
      if (i >= 0x10000 && i <= 0x10FFFF)   return true;
      return false;
    }

    boolean method2(int c){
      if (c <= 0xD7FF) {
        if (c >= 0x20)     return true;
     else {
          if (c == '\n')       return true;
          if (c == '\r')       return true;
          if (c == '\t')       return true;
          return false;
        }
      }
      if (c < 0xE000)   return false;
      if (c <= 0xFFFD)   return true;
      if (c < 0x10000)   return false;
      if (c <= 0x10FFFF)   return true;
      return false;
    }
}
