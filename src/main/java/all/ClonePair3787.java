package all;

public class ClonePair3787 {

    char method1(byte b){
      char ib=(char)(b & 0x00FF);
      if (ib < 32 || ib > 126) {
        return '.';
      }
      return ib;
    }

    char method2(byte b){
      char c=(char)b;
      if (c >= 0x20 && c < 0x7f)   return c;
     else   return '.';
    }
}
