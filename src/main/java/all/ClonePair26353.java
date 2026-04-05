package all;

public class ClonePair26353 {

    int method1(char c){
      if (c >= '0' && c <= '9')   return c - '0';
     else   if (c >= 'a' && c <= 'f')   return c - 'a' + 10;
     else   if (c >= 'A' && c <= 'F')   return c - 'A' + 10;
      System.err.println("Error: '" + c + "' is not a hex digit");
      return -1;
    }

    int method2(char ch){
      if (ch >= '0' && ch <= '9') {
        return ch - '0';
      }
     else   if (ch >= 'a' && ch <= 'f') {
        return ch - 'a' + 10;
      }
     else   if (ch >= 'A' && ch <= 'F') {
        return ch - 'A' + 10;
      }
      return -1;
    }
}
