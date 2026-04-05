package all;

public class ClonePair10976 {

    byte method1(char c){
      if (c >= '0' && c <= '9')   return (byte)(c - '0');
      if (c >= 'a' && c <= 'f')   return (byte)((c - 'a') + 10);
      if (c >= 'A' && c <= 'F')   return (byte)((c - 'A') + 10);
      return 0;
    }

    byte method2(char ch){
      if ('0' <= ch && ch <= '9') {
        return (byte)(ch - '0');
      }
     else   if ('a' <= ch && ch <= 'f') {
        return (byte)(ch - 'a' + 10);
      }
     else   if ('A' <= ch && ch <= 'F') {
        return (byte)(ch - 'A' + 10);
      }
      return 0;
    }
}
