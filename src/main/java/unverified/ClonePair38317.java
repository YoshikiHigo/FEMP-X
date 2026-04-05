package unverified;

public class ClonePair38317 {

    int method1(char c){
      if (c >= '0' && c <= '9')   return c - '0';
     else   if (c >= 'a' && c <= 'f')   return c - 'a' + 10;
     else   if (c >= 'A' && c <= 'F')   return c - 'A' + 10;
      System.err.println("Error: '" + c + "' is not a hex digit");
      return -1;
    }

    int method2(char c){
      if (c >= '0' && c <= '9') {
        return c - '0';
      }
      if (c >= 'A' && c <= 'F') {
        return c + 10 - 'A';
      }
      if (c >= 'a' && c <= 'f') {
        return c + 10 - 'a';
      }
      return -1;
    }
}
