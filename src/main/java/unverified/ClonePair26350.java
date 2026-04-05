package unverified;

public class ClonePair26350 {

    int method1(char c){
      if (c >= '0' && c <= '9')   return c - '0';
     else   if (c >= 'a' && c <= 'f')   return c - 'a' + 10;
     else   if (c >= 'A' && c <= 'F')   return c - 'A' + 10;
      System.err.println("Error: '" + c + "' is not a hex digit");
      return -1;
    }

    int method2(char c){
      if (c >= 'a') {
        if (c <= 'f') {
          return 10 + (c - 'a');
        }
      }
     else   if (c >= 'A') {
        if (c <= 'F') {
          return 10 + (c - 'A');
        }
      }
     else   if (c >= '0') {
        if (c <= '9') {
          return c - '0';
        }
      }
      return -1;
    }
}
