package all;

public class ClonePair38314 {

    int method1(char c){
      if (c >= '0' && c <= '9')   return c - '0';
     else   if (c >= 'a' && c <= 'f')   return c - 'a' + 10;
     else   if (c >= 'A' && c <= 'F')   return c - 'A' + 10;
      System.err.println("Error: '" + c + "' is not a hex digit");
      return -1;
    }

    int method2(char a_c){
      if ('0' <= a_c && a_c <= '9') {
        return a_c - '0';
      }
      if ('A' <= a_c && a_c <= 'F') {
        return a_c - 'A' + 10;
      }
      if ('a' <= a_c && a_c <= 'f') {
        return a_c - 'a' + 10;
      }
      return -1;
    }
}
