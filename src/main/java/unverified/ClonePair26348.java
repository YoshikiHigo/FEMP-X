package unverified;

public class ClonePair26348 {

    int method1(char c){
      if (c >= '0' && c <= '9')   return c - '0';
     else   if (c >= 'a' && c <= 'f')   return c - 'a' + 10;
     else   if (c >= 'A' && c <= 'F')   return c - 'A' + 10;
      System.err.println("Error: '" + c + "' is not a hex digit");
      return -1;
    }

    int method2(char inChar){
      if (inChar >= '0' && inChar <= '9') {
        return inChar - '0';
      }
      if (inChar >= 'A' && inChar <= 'F') {
        return inChar - 'A' + 10;
      }
      if (inChar >= 'a' && inChar <= 'f') {
        return inChar - 'a' + 10;
      }
      return -1;
    }
}
