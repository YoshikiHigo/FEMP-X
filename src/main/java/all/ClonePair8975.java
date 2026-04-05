package all;

public class ClonePair8975 {

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

    boolean method2(char character){
      if ((character == 0x9) || (character == 0xA) || (character == 0xD)|| ((character >= 0x20) && (character <= 0xD7FF))|| ((character >= 0xE000) && (character <= 0xFFFD))|| ((character >= 0x10000) && (character <= 0x10FFFF))) {
        return true;
      }
      return false;
    }
}
