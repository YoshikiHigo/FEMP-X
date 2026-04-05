package all;

public class ClonePair38334 {

    int method1(char c){
      if (c >= '0' && c <= '9')   return c - '0';
     else   if (c >= 'a' && c <= 'f')   return c - 'a' + 10;
     else   if (c >= 'A' && c <= 'F')   return c - 'A' + 10;
      System.err.println("Error: '" + c + "' is not a hex digit");
      return -1;
    }

    int method2(char ch){
      int value=-1;
      if (ch >= '0' && ch <= '9') {
        value=ch - '0';
      }
     else   if (ch >= 'a' && ch <= 'f') {
        value=ch - 'a' + 10;
      }
     else   if (ch >= 'A' && ch <= 'F') {
        value=ch - 'A' + 10;
      }
      return value;
    }
}
