package unverified;

public class ClonePair38319 {

    int method1(char c){
      if (c >= '0' && c <= '9')   return c - '0';
     else   if (c >= 'a' && c <= 'f')   return c - 'a' + 10;
     else   if (c >= 'A' && c <= 'F')   return c - 'A' + 10;
      System.err.println("Error: '" + c + "' is not a hex digit");
      return -1;
    }

    int method2(char c){
      if ('0' <= c && c <= '9') {
        return c - '0';
      }
     else   if ('a' <= c && c <= 'f') {
        return c - 'a' + 0xa;
      }
     else   if ('A' <= c && c <= 'F') {
        return c - 'A' + 0xa;
      }
     else   return -1;
    }
}
